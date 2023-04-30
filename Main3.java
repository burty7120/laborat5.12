// третє завдання перероблене
public class Main3 {
    public static void main(String[] args) {
        int[][] arrays = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arrays[i][j] = (int) (Math.random() * 6);
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
        double[] averages = new double[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += arrays[i][j];
            }
            averages[i] = (double) sum / 5;
            System.out.println("середнє значення of array " + i + " is " + averages[i]);
        }
        if (averages[0] > averages[1] && averages[0] > averages[2]) {
            System.out.println("Array 0 має найбільше середнє значення");
        } else if (averages[1] > averages[0] && averages[1] > averages[2]) {
            System.out.println("Array 1 має найбільше середнє значення");
        } else if (averages[2] > averages[0] && averages[2] > averages[1]) {
            System.out.println("Array 2 має найбільше середнє значення");
        } else {
            System.out.println("Середні значення для всіх масивів однакові");
        }
    }
}


// public class Main5 {
//    public static void main(String[] args) {
//
//        int zero = 0, one = 0, two = 0;
//        int three = 0;
//        int four = 0;
//        int five = 0;
//        int array[] = new int[6];
//        for (int i = 0; i < 6; i++) {
//            array[i] = (int) (Math.random() * 5);
//            System.out.print(array[i] + " ");
//            if (array[i] == 0)
//                zero++;
//            else if (array[i] == 1)
//                one++;
//            else if (array[i] == 2)
//                two++;
//            else if (array[i] == 3)
//            three++;
//            else if (array[i] == 4)
//            four++;
//            else if (array[i] == 5)
//            five++;
//        }
//        System.out.println();
//        if (zero > one && zero > two && zero > three && zero > four && zero > five)
//            System.out.println("zero = " + zero);
//        else if (one > zero && one > two && one > three && one > four && one > five)
//            System.out.println("one = " + one);
//        else if (two > one && two > three && two > four && two > five)
//            System.out.println("two = " + two);
//        else if (three > two && three > four && three > five)
//            System.out.println("three = " + three);
//        else if (four > three && four > five)
//            System.out.println("four = " + four);
//        else if (five > four)
//            System.out.println("five = " + five);
//    }
//}