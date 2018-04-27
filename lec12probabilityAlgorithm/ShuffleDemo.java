package lec12probabilityAlgorithm;

import java.util.Arrays;

public class ShuffleDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        shuffle(a);
        System.out.println(Arrays.toString(a));
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
