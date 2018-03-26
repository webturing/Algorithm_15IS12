package lec08;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class YHTriangle2_Recussive {

    static void printYHTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cnr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int cnr(int n, int r) {
        if (n == r || r == 0)
            return 1;
        else
            return cnr(n - 1, r) + cnr(n - 1, r - 1);
    }


    public static void main(String[] args) {
        int n = 10;
        printYHTriangle(n);
    }
}
