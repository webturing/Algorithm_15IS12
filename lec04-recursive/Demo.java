class Demo{
	public static void f(int x)//pass by value
	{
		x=10;
	}

	 public static void main(String[] args) {
		int y=9;
		f(y);
		System.out.println(y);//y should be 9
	}

}