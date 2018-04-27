package lec12probabilityAlgorithm;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Doll {
    public static void main(String[] args) {
        Vector<Integer> balls = new Vector<>();
        for (int i = 1; i <= 35; i++) {
            balls.add(i);
        }
        System.out.println(balls);
        Vector<Integer> firstPrize = new Vector<Integer>();
        Collections.shuffle(balls);
        for (int i = 0; i < 7; i++)
            firstPrize.add(balls.get(i));
        System.out.println(firstPrize);
        int first = 0, second = 0;
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(balls);
            List<Integer> cur = balls.subList(0, 7);
            int sim = count(firstPrize, cur);
            if (sim == 7) {
                ++first;
            } else if (sim >= 4) {
                ++second;
            }
        }
        System.out.println(first);
        System.out.println(second);

    }

    private static int count(List<Integer> a, List<Integer> b) {
        int tot = 0;
        for (int i = 0; i < a.size(); i++)
            if (a.get(i) == b.get(i))
                ++tot;
        return tot;
    }
}
