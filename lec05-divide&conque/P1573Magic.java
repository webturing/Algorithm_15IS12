import java.util.Scanner;
/**
Sample Input
2
ABBAABBA
A

Sample Output
2
1
*/
class P1573Magic {
	static boolean sysmetric(String s){
		for (int i = 0; i < s.length() / 2; i++) {
			int j = s.length() - 1 - i;
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String[] args)	{
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		while(n-->0){
			String s=cin.next();
			while (s.length() % 2 == 0 && s.length() > 1 && sysmetric(s)) {
				s = s.substring(0, s.length() / 2);
			}
			System.out.println(s.length());
		}
		cin.close();
	}
}