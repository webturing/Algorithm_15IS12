import java.util.Scanner;

/**
 * IO��ֻ��һ�Mݔ��
 * Sample Input
 * 3 4
 * Sample Output
 * 7
 *
 * @author Administrator
 */
public class IO1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println(a + b);

        cin.close();
    }
}
