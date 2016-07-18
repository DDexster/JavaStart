package com.company.homeworks;

/**
 * Created by ddexster on 04.07.16.
 */
//Написать свой вариант ф-и Arrays.equals для short[]
public class hwEqualsShort {
    static boolean eqShort (short[] a, short[] b) {
        if (a.length!=b.length)
            return false;
        else
            for (int i = 0; i < a.length; i++) {
                if (a[i]!=b[i])
                    return false;
            }
        return true;
    }

    public static void main(String[] args) {
        short[] x= {1,2,3,4,5};
        short[] y= {1,2,3,4,5};
        boolean i= eqShort(x,y);
        System.out.println(i);



    }
}
