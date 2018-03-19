public class IntDigitSum {

	public static void main(String[] args) {
		// expectedValue==actualValue Unit Test
		System.out.println(10 == sum(1234));
		System.out.println(21 == sum(123456));
		System.out.println(1 == sum(1));
		System.out.println(0 == sum(0));
	}

	 static int sum(int n) {//Recursive
		 if(n<10)
			 return n;
		 else
		return sum(n/10)+(n%10);
	}

//	 static int sum(int n) {//Loop
//		int tot = 0;
//		while (n > 0) {
//			tot += n % 10;
//			n /= 10;
//		}
//		return tot;
//	}
	

}
