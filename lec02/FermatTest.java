import java.math.BigInteger;

public class FermatTest {
    public static void main(String[] args) {
        BigInteger two=new BigInteger("2");
        for(int i=0;i<10;i++)
        {
            System.out.println(two.pow(1<<i).add(BigInteger.ONE).isProbablePrime(100));
        }
        System.out.println();
    }
}
