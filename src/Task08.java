import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность квадратного массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        int value = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                array[minRow][i] = value;
                value++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                array[i][maxCol] = value;
                value++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                array[maxRow][i] = value;
                value++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                array[i][minCol] = value;
                value++;
            }
            minCol++;
        }
        int digitCount = String.valueOf(n * n).length();
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%-" + (digitCount + 1) + "d", num);
            }
            System.out.println();

        }
    }
}
