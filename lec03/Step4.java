import java.util.Arrays;

public class Step4 {

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
                        {
                            long key=H[a]+H[b]+H[c]+H[d]+H[e];
                            int pos= Arrays.binarySearch(H,e+1,N,key);
                                if (pos>=0)
                                    System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f=pos));
                            }
    }

    private static long h(int a) {
        return 1L * a * a * a * a * a;
    }
}
