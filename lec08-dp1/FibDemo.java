public class FibDemo {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
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
