package lec03;

import java.util.Arrays;

public class ArraysBinarySearchDemo {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 6, 7, 10, 13, 25};
        int key = 13;
        int pos = Arrays.binarySearch(a, key);
        if (pos < 0)
            System.out.println("NOT FOUND!");
        else
            System.out.println(String.format("%d occured at pos=%d firstly.",
                    key, pos));

    }
}
