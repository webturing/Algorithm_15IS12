
public class Life {
    public static void main(String[] args) {
        System.out.println(100 * 365 * 24 * 3600 * 1000);//bugs here
        System.out.println(100 * 365 * 24 * 3600 * 1000 * 1L);//bugs here
        System.out.println(1L * 100 * 365 * 24 * 3600 * 1000);//bugs fixed
        //1*1
        //12345*54321
        //1L*1L
    }
}
