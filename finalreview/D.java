package contest1130;

public class D {
    public static void main(String[] args) {
        int a=123;
        int m=rev(123);
        int m2=rev2(123);
    }

    private static int rev2(int n) {
        String s=Integer.toString(n);
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        //sb.de
        String t=sb.toString();
        return Integer.parseInt(t);
    }

    private static int rev(int n) {
        int m=0;
        while(n>0){
            m=m*10+n%10;
            n/=10;
        }
        return m;
    }
}
