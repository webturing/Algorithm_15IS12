package lec08;

public class Factorial01 {
	public static void main(String[] args) {
		for (int n = 0; n < 10; n++)
			System.out.println(fact(n));
	}

	private static int fact(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}
