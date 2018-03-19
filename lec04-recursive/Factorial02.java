package lec08;

public class Factorial02 {
	public static void main(String[] args) {
		int A[] = new int[11];
		A[0] = A[1] = 1;
		for (int i = 2; i < A.length; i++)
			A[i] = A[i - 1] * i;
		for (int n = 0; n < 10; n++)
			System.out.println(A[n]);
	}

	private static int fact(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}
