package lec08;

public class FibDemo2 {
	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			long start = System.currentTimeMillis();
			fib(n);
			long end = System.currentTimeMillis();
			System.out.println(n + " \t" + (end - start));
		}
	}

	private static int fib(int n) {

		if (n == 0 || n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
}
