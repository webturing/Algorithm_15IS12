package lec08;

public class FibDemo {
	static int F[] = new int[100];

	public static void main(String[] args) {
		for (int n = 1; n < 100; n++) {
			long start = System.currentTimeMillis();
			System.out.print(fib(n));
			long end = System.currentTimeMillis();
			System.out.println(n + " \t" + (end - start));
		}
	}

	private static int fib(int n) {
		if (F[n] != 0)
			return F[n];
		if (n == 0 || n == 1)
			return F[n] = 1;
		return F[n] = fib(n - 1) + fib(n - 2);
	}
}
