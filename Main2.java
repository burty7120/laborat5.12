import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[20]; // stor mas
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10); // random cifru [0, 9]
        }
        System.out.println("pochatok masiva: " + Arrays.toString(array)); // pocht masiva

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0; // zamina vsih sufr z nepar indks to nol
        }
        System.out.println("Masiv after zmina: " + Arrays.toString(array)); // vivedinia pomin masiv
    }
}
