public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        int n = 5;
        int m = 4;
        int[][] array = new int[n][m];
        int num = 1;
        for (int i = 0; i < n + m - 1; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k >= 0 && k < m) {
                    array[j][k] = num++;
                }
            }
        }
        int maxNum = n * m;
        int columnWidth = Integer.toString(maxNum).length() + 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%" + columnWidth + "d", array[i][j]);
            }
            System.out.println();
        }
    }
}
