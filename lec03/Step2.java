public class Step2 {

    public static final int N = 100;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    static long H[]=new long[N+1];
    static void fill(){
        for(int i=1;i<=N;i++)
            H[i]=h(i);
    }
    private static void solve() {
        fill();
        int a, b, c, d, e, f;
        for (a = 1; a < N; a++)
            for (b = a; b < N; b++)
                for (c = b; c < N; c++)
                    for (d = c; d < N; d++)
                        for (e = d; e < N; e++)
                            for (f = e + 1; f <= N; f++) {
                                if (H[a]+H[b]+H[c]+H[d]+H[e]==H[f])
                                    System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                            }
    }

    private static long h(int a) {
        return 1L * a * a * a * a * a;
    }
}
