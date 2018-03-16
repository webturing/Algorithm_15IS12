package lec04;

public class ArrayOrderedChecker {

    public static void main(String[] args) {
        //expectedValue==actualValue
        System.out.println(true==check(new int[]{1,2,3,4,5,6}));
        System.out.println(false==check(new int[]{1,2,3,4,5,6,1}));
        System.out.println(true==check(new int[]{6,5,4,3,2,1}));
        System.out.println(false==check(new int[]{1,1}));
        System.out.println(true==check(new int[]{6,5}));
        System.out.println(true==check(new int[]{1}));
        System.out.println(true==check(null));
    }

    private static boolean check(int[] a) {
        if(a==null)
            return true;
        if(a.length<=2)
            return true;
        return isIncreaseOrder(a)||isDecreaseOrder(a);
    }

    private static boolean isDecreaseOrder(int[] a) {
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]<a[i+1])
                return false;
        }
        return true;
    }

    private static boolean isIncreaseOrder(int[] a) {

        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
}
