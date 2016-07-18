package com.company.homeworks;

import java.util.Arrays;
import java.util.Random;


/**
 * Created by ddexster on 24.06.16.
 */
public class hwMethods {

    static int lenbyte(int[] a) {       //Написать ф-ю, которая принимает на вход массив чисел и
                                        //возвращает его длину в байтах как результат.
        return a.length*4;
    }

    static void append(int[] a, int[] b) {       //Написать ф-ю для объединения 2-х массивов в один. Вывести
                                                 //результат на консоль
        int[] c= new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {

        int [] ar=new int[10];
        int [] ar1=new int[10];
        Random r=new Random();

        for (int i=0; i<ar.length; i++) {
            ar[i]=r.nextInt(20);
            ar1[i]=r.nextInt(20);
        }

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar1));
        //System.out.println(lenbyte(ar));        //Проверка метода lenbyte
        append(ar,ar1);

    }
}
