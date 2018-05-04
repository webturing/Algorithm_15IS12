package lec13probaliityAlgorithm2;

import java.util.Collections;
import java.util.Vector;

public class GoatOrCar {
    static final int GOAT = 0;
    static final int CAR = 1;

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(GOAT);
        v.add(GOAT);
        v.add(CAR);
        int success = 0;
        for (int i = 0; i < 1000; i++) {
            Collections.shuffle(v);
            int user = v.get(0);//select A
            if (user == CAR)
                ++success;
        }
        System.out.println(success);
    }
}
