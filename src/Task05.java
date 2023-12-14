import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        int[] array = new int[20];
        int maxCount = 0;
        int currentCount = 0;
        int startIndex = 0;
        int endIndex = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(30)-10;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    endIndex = i;
                    startIndex = endIndex - maxCount + 1;
                }
            } else {
                currentCount = 0;
            }
        }
        System.out.println("Исходный массив: "+Arrays.toString(array));

        System.out.println("Найденный фрагмент:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
