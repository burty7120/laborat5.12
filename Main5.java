import java.util.Arrays;
public class Main5 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int countEven = 0;

        // заповнення i скіки парних елементів
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11);
            if(array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Масив: " + Arrays.toString(array));
        System.out.println("Кількість парних елементів: " + countEven);
    }
}
