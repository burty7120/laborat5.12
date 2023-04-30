
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        int[] resultArray = new int[10];

        // zakraska dva masiv rand chisel
        for (int i = 0; i < 10; i++) {
            firstArray[i] = (int) (Math.random() * 11);
            secondArray[i] = (int) (Math.random() * 11);
        }

        // obch 1 ta 2 masiv z ineks i
        for (int i = 0; i < 10; i++) {
            resultArray[i] = firstArray[i] + secondArray[i];
        }

        // vivod masivchika
        System.out.println("Перший масив: " + Arrays.toString(firstArray));
        System.out.println("Другий масив: " + Arrays.toString(secondArray));
        System.out.println("Результат: " + Arrays.toString(resultArray));
    }
}
