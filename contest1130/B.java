package contest1130;

import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nexLine();
        System.out.println(s.toLowerCase());


        //大小写互换
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++)
            if (Character.isLowerCase(cs[i])) {
                cs[i] = Character.toUpperCase(cs[i]);
            } else if (Character .isUpperCase(cs[i])) {
                cs[i] = Character.toLowerCase(cs[i]);
            }

        System.out.println(new String(cs));
    }


}