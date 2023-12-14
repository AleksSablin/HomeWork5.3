import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40) - 10;
        }
        int negativeResult = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeResult = i;
                break;
            }
        }
        if (negativeResult == -1) {
            System.out.println("В массиве отсутствуют отрицательные элементы");
            return;
        }
        int sum = 0;
        for (int i = negativeResult + 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nСумма элементов после первого отрицательного элемента: " + sum);
    }
}


