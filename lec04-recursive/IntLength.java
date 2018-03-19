public class IntLength {

	public static void main(String[] args) {
		// expectedValue==actualValue Unit Test
		System.out.println(4 == len(1234));
		System.out.println(6 == len(123456));
		System.out.println(1 == len(1));
		System.out.println(1 == len(0));
	}

	static int len(int n) {//Recursive
		if (n < 10)
			return 1;
		else
			return len(n / 10) + 1;
	}

	// static int len(int n) {//Loop
	// int tot = 0;
	// while (true) {
	// n /= 10;
	// ++tot;
	// if (n == 0)
	// break;
	// }
	// return tot;
	// }

	// static int len(int n) {//Math
	// // TODO Auto-generated method stub
	// if (n == 0)
	// return 1;// fixed bugs
	// return (int) (Math.log10(n) + 1);
	// }

}
