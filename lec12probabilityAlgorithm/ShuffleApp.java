package lec12probabilityAlgorithm;

import java.util.Arrays;

public class ShuffleApp {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            shuffle(a);
            int x = a[0] * 100 + a[1] * 10 + a[2];
            int y = a[3] * 100 + a[4] * 10 + a[5];
            int z = a[6] * 100 + a[7] * 10 + a[8];
            if (y == 2 * x && z == 3 * x) {
                System.out.println(Arrays.toString(a));
                break;
            }
        }
    }

    private static void shuffle(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = DossDemo1.doss(i, a.length - 1);
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
