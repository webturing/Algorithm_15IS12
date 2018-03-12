public class Brute {
    public static void main(String[] args) {
        System.out.println(100000 == h(10));
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void solve() {
        int a, b, c, d, e, f;
        for (a = 1; a <= 100; a++)
            for (b = 1; b <= 100; b++)
                for (c = 1; c <= 100; c++)
                    for (d = 1; d <= 100; d++)
                        for (e = 1; e <= 100; e++)
                            for (f = 1; f <= 100; f++) {
                                if (h(a) + h(b) + h(c) + h(d) + h(e) == h(f))
                                    System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                            }
    }

    private static long h(int a) {
        return 1L * a * a * a * a * a;
    }
}
