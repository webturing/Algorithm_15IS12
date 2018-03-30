import java.util.Arrays;

public class Sieve {
    static int N = 100;
    static boolean prime[] = new boolean[N];

    static void fill() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (prime[i])
                for (int j = i * i; j < N; j += i) {
                    prime[j] = false;
                }
        }
    }

    public static void main(String[] args) {
        fill();
        for (int i = 0; i < N; i++)
            if (prime[i])
                System.out.print(i + " ");
    }
}
