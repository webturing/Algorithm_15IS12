import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a=new BigInteger("1000000007");
        BigInteger b=new BigInteger("1111111111111111111111111111111111");

        System.out.println(b.pow(4));


        System.out.println(a.multiply(b));
        System.out.println(a.isProbablePrime(100));
    }
}
