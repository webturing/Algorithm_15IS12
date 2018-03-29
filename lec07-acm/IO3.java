import java.util.Scanner;

/**
 * IO����һ��T��ͷ������T������
 * <p>
 * <p>
 * Sample Input
 * 2
 * 3 4
 * 1 2
 * Sample Output
 * 7
 * 3
 *
 * @author Administrator
 */
public class IO3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }

        cin.close();
    }
}
