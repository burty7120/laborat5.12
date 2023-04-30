public class Main {
    public static void main(String[] args) {
        int size = 50; // size masivchika
        int[] araay = new int[size]; // stvoriv
        int currentNumber = 1; // pochatok

        for (int i = 0; i < size; i++) {
            araay[i] = currentNumber; // dodav nepar cheslo do masiva
            currentNumber += 2; // zbilsh na 2 dla poluchena neparnogo
        }
        // pokaz radok
//        for (int i = 0; i < size; i++) {
//            System.out.print(araay[i] + " "); // виведення кожного елементу в один рядок
//        }
        // pokaz stopchik
        for (int i = 0; i < size; i++) {
            System.out.println(araay[i]);
        }
    }
}


