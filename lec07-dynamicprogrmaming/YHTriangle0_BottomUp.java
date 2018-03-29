package lec08;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class YHTriangle0_BottomUp {
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int cnr(int n, int r) {
        return factorial(n) / factorial(n - r) / factorial(r);
    }

    static void printYHTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cnr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printYHTriangle(n);
    }
}
