import java.util.Arrays;

public class Fractor3 {
    static int F[] = new int[12];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(F));
        factorial(7);
        System.out.println(Arrays.toString(F));
        factorial(5);
        System.out.println(Arrays.toString(F));
        factorial(11);
        System.out.println(Arrays.toString(F));
    }

    private static int factorial(int n) {
        if (F[n] != 0)//查询数组 避免重复子问题的求解
            return F[n];
        if (n <= 1)
            return F[n] = 1;//计算出及时写入存储
        return F[n] = factorial(n - 1) * n;//计算及时写入存储
    }
}
