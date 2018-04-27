package lec12probabilityAlgorithm;

import java.util.Arrays;

public class DossDemo1 {
    static int doss(int start, int end) {
        int n = (end - start) + 1;
        return (int) (n * Math.random() + start);
    }

    static void test() {
        int[] freq = new int[7];
        for (int i = 0; i < 1000000; i++) {
            freq[doss(1, 6)]++;
        }
        System.out.println(Arrays.toString(freq));
    }

    public static void main(String[] args) {
        int freq[] = new int[13];
        for (int i = 0; i < 10000; i++) {
            int d1 = doss(1, 6);
            int d2 = doss(1, 6);
            freq[d1 + d2]++;
        }
        System.out.println(Arrays.toString(freq));

    }
}
