public class ReverseInteger {
	public static void main(String[] args) {
		int n = 1123;
		System.out.println(Integer.toString(n));
		System.out.println("" + n);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toString(n, 2));
		System.out.println(21 == rev(120));
		System.out.println(1 == rev(1));
		System.out.println(1 == rev(100));
		System.out.println(4321 == rev(1234));
	}

	private static int rev(int n) {
		return Integer.parseInt(new StringBuffer(Integer.toString(n)).reverse().toString());
	}

	private static int rev3(int n) {
		String s = Integer.toString(n);
		String ans = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ans += s.charAt(i);
		}

		return Integer.parseInt(ans);
	}

	private static int rev2(int n) {// version1
		int m = 0;
		while (n > 0) {
			int k = n % 10;
			m = m * 10 + k;
			n /= 10;
		}
		return m;
	}
}
