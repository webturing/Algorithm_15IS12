package lec13probaliityAlgorithm2;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(2));//coin
        System.out.println(rand.nextInt(6) + 1);//doss
        int card = rand.nextInt(52);//cards
        String kind = "Heart Spread Club Diamond".split(" ")[card / 13];
        String digit = "A 2 3 4 5 6 7 8 9 10 J Q K".split(" ")[card % 13];
        System.out.println(kind + digit);
        System.out.println(rand.nextInt(54));//cards2
    }
}
