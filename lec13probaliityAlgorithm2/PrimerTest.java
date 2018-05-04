package lec13probaliityAlgorithm2;

import java.math.BigInteger;

public class PrimerTest {
    public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        for (int i = 0; i < 10; i++) {
            BigInteger f = two.pow(1 << i).add(BigInteger.ONE);
            System.out.println(f);
            boolean flag = f.isProbablePrime(10);
            System.out.println(flag);
        }

    }
}
