public class IntReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		revPrint(123456);

	}

	static void revPrint(int n) {
		if (n < 10) {
			System.out.print(n);
			return;
		}
		System.out.print(n % 10);
		revPrint(n / 10);

	}

	// static void revPrint(int n) {//Loop
	// while (n > 0) {
	// System.out.print(n % 10);
	// n /= 10;
	// }
	//
	// }

}
