import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minCount = 0;
        int maxCount = 0;
        int[][] minIndexes = new int[n][n];
        int[][] maxIndexes = new int[n][n];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minCount = 1;
                    minIndexes = new int[n][n];
                    minIndexes[i][j] = 1;
                } else if (array[i][j] == min) {
                    minCount++;
                    minIndexes[i][j] = 1;
                }

                if (array[i][j] > max) {
                    max = array[i][j];
                    maxCount = 1;
                    maxIndexes = new int[n][n];
                    maxIndexes[i][j] = 1;
                } else if (array[i][j] == max) {
                    maxCount++;
                    maxIndexes[i][j] = 1;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Наименьший элемент: " + min);
        System.out.println("Наибольший элемент: " + max);


        if (minCount > 1) {
            System.out.println("Индексы минимальных элементов: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (minIndexes[i][j] == 1) {
                        System.out.println("Строка " + (i + 1) + ", столбец " + (j + 1));
                    }
                }
            }
        }

        if (maxCount > 1) {
            System.out.println("Индексы максимальных элементов: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (maxIndexes[i][j] == 1) {
                        System.out.println("Строка " + (i + 1) + ", столбец " + (j + 1));
                    }
                }
            }
        }

        System.out.println("Время выполнения поиска: " + executionTime + " мс");
    }
    }

