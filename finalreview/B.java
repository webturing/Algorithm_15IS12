package contest1130;

import java.util.Scanner;

class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        long sum=1L*n*(n+1)/2;
        System.out.println(sum);
        if(n%2==1)
            ++n;
        System.out.println(1L*n*n/4);
    }


}