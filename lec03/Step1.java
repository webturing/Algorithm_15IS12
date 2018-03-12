public class Step1 {

    public static final int N = 100;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void solve() {
        int a, b, c, d, e, f;
        for (a = 1; a < N; a++)
            for (b = a; b < N; b++)
                for (c = b; c < N; c++)
                    for (d = c; d < N; d++)
                        for (e = d; e < N; e++)
                            for (f = e + 1; f <= N; f++) {
                                if (h(a) + h(b) + h(c) + h(d) + h(e) == h(f))
                                    System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                            }
    }

    private static long h(int a) {
        return 1L * a * a * a * a * a;
    }
}
