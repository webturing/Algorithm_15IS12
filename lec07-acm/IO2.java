import java.util.Scanner;

/**
 * IO2 多组输入以EOF结尾(EOF:End Of File,表示文件末尾，在标准输入中可以用Ctrl+Z/D表示)
 * <p>
 * Sample Input
 * 3 4
 * 1 2
 * Sample Output
 * 7
 * 3
 *
 * @author Administrator
 */
public class IO2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }

        cin.close();
    }
}
