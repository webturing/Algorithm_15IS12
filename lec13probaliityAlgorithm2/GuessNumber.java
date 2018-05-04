package lec13probaliityAlgorithm2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int key = random.nextInt(100) + 1;//
        System.out.println(key);
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int user = cin.nextInt();
            if (user == key) {
                System.out.println("Congratulations!");
                break;
            } else if (user > key) {
                System.out.println("Too bigger");
            } else {
                System.out.println("Too smaller");
            }
        }
        System.out.println(key);
    }
}
