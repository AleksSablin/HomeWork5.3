import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество рядов: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество мест в каждом ряду: ");
        int m = scanner.nextInt();

        int[][] cinema = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema[i][j] = random.nextInt(2);
            }
        }
        System.out.println("Исходный массив:");
        printArray(cinema);

        System.out.print("Введите количество билетов на продажу: ");
        int k = scanner.nextInt();

        boolean seatsFound = false;
        for (int i = 0; i < n; i++) {
            int count = 0;
            String row = "";
            for (int j = 0; j < m; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                    row += (j + 1) + " ";
                    if (count == k) {
                        System.out.println("Свободные места для продажи в ряду " + (i + 1) + ": " + row);
                        seatsFound = true;
                        break;
                    }
                } else {
                    count = 0;
                    row = "";
                }
            }
        }
        if (!seatsFound) {
            System.out.println("Свободные места для продажи не найдены.");
        }
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
