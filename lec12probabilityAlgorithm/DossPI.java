package lec12probabilityAlgorithm;

public class DossPI {
    public static void main(String[] args) {
        int N = 100000000;
        int M = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            double op = Math.sqrt(x * x + y * y);
            if (op <= 1)
                ++M;

        }
        double pi = 4.0 * M / N;
        System.out.println(pi);
    }
}
