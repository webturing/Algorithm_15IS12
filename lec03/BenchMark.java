public class BenchMark {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        f();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void f() {
        int s = 0;
        for (int i = 0; i < 10000000; i++)
            s += i;

    }
}
