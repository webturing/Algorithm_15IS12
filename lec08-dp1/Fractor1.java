public class Fractor1 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(10));
    }

    private static int factorial(int n) {
        return n<=1?1:factorial(n-1)*n;
    }
}
