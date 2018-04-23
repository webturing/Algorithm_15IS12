import java.util.Arrays;

class ArraySortDemo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1023));
        int a[]={1,3,5,7,9,2,4,6,8,0};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
