package lec13probaliityAlgorithm2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {
    public static void main(String[] args) {
        Random random = new Random();
        int start = 1, end = 100;
        int key = random.nextInt(end - start + 1) + start;//
        // System.out.println(key);
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            int user = (end + start) / 2;
            System.out.println("AI guessed the number is " + user);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (user == key) {
                System.out.println("Congratulations!");
                break;
            } else if (user > key) {

                System.out.println("Too bigger");
                end = user - 1;
            } else {

                System.out.println("Too smaller");
                start = user + 1;
            }
        }
        System.out.println(key);
    }
}
