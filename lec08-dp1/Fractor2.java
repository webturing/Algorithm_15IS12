public class Fractor2 {
    static int F[]=new int[12];

    static void fill()
    {
        F[0]=F[1]=1;
        for(int i=2;i<F.length;i++)
            F[i]=F[i-1]*i;
    }
    public static void main(String[] args) {
        fill();
        System.out.println(F[10]);
        System.out.println(F[10]);
    }

    private static int factorial(int n) {
        return n<=1?1:factorial(n-1)*n;
    }
}
