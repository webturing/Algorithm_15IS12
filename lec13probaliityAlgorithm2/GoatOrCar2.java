package lec13probaliityAlgorithm2;

import java.util.Collections;
import java.util.Vector;

public class GoatOrCar2 {
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
            int master = 1;
            if (v.get(1) == GOAT)
                master = 1;//B
            else
                master = 2;//
            int user = v.get(3 - master);//change selection
            if (user == CAR) ++success;
        }
        System.out.println(success);
    }
}
