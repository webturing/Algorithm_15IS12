public class FibDemo2 {
    static int F[]=new int[101];

    public static int fib(int n) {

        if(F[n]!=0)
            return F[n];
        if (n <= 1)
            return F[n]=n;
        return F[n]=fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long start = System.currentTimeMillis();
            // System.out.println(fib(i));
            fib(i);
            long end = System.currentTimeMillis();
            System.out.println("T(" + i + ")=" + (end - start) / 1000.0);
        }
    }
}
