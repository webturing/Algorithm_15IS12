package lec13probaliityAlgorithm2;

public class Doll1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double cur = Math.random();
            if (cur < 0.1) {
                System.out.println("Iphone X ");

            } else if (cur < 0.3) {
                System.out.println("Ipad min");
            } else {
                System.out.println("Thank you");
            }
        }
    }
}
