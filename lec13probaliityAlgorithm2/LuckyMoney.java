package lec13probaliityAlgorithm2;

import java.util.Arrays;
import java.util.Random;

public class LuckyMoney {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] ans = luckyMoney(200, 5);
        System.out.println(Arrays.toString(ans));
    }

    static int doss(int start, int end) {
        return random.nextInt(end - start + 1) + start;
    }

    private static int[] luckyMoney(int cents, int n) {
        if (cents >= 20000 || n > cents || n <= 0)
            return null;
        int[] M = new int[n];
        for (int i = 0; i < n; i++)
            M[i] = 1;
        cents -= n;
        for (int i = 0; i < n - 1; i++) {
            int cur = doss(0, cents);
            cents -= cur;
            M[i] += cur;
        }
        M[n - 1] += cents;
        return M;
    }
}
