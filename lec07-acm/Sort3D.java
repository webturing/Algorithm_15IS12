import java.util.Scanner;

/**
 * 3��������ð���㷨 �Ƚ�a ,b if(a>b) a<->b �Ƚ� b,c �Ƚ� a,b //��ʱc�Ѿ������ֵ��
 *
 * @author Administrator
 */
public class Sort3D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();

            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            if (b > c) {
                int t = b;
                b = c;
                c = t;
            }
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            System.out.println(String.format("%d %d %d", a, b, c));
        }
        cin.close();
    }
}
