package sort.basesrc;

public class Util {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
