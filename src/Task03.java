import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        int[] numbers = new int[200];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201);
        }
        int oneDigitCount = 0;
        int twoDigitCount = 0;
        int threeDigitCount = 0;
        for (int number : numbers) {
            if (number >= 0 && number < 10) {
                oneDigitCount++;
            } else if (number >= 10 && number < 100) {
                twoDigitCount++;
            } else if (number >= 100 && number < 200) {
                threeDigitCount++;
            }
        }
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
        System.out.println("Количество чисел по разрядам:");
        System.out.println("Одноразрядные: " + oneDigitCount);
        System.out.println("Двухразрядные: " + twoDigitCount);
        System.out.println("Трёхразрядные: " + threeDigitCount);
    }
}
