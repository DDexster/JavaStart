package com.company.homeworks;
//Написать свой вариант ф-и Arrays.toString() для int[].

public class hwArrtoInt {
    static String intToStr(int[] a) {
        StringBuilder s =new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            if (i!=a.length-1)
                s.append(a[i]+", ");
            else
                s.append(a[i]+"]");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8};
        System.out.println(intToStr(x));
    }
}
