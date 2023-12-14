import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        int[] array = new int[100];
        int[] resultArray = new int[100];
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(755)-300;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                resultArray[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                resultArray[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                resultArray[index] = array[i];
                index++;
            }
        }
        System.out.println("Исходный массив: " +Arrays.toString(array));
        System.out.println("Результирующий массив: " +Arrays.toString(resultArray));
    }
}
