package com.company.homeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ddexster on 24.06.16.
 */
public class hwFillMirror {
    static void fillmir(int[] a) {
        int n=((a.length%2)==0)?1:0;
        for (int i = a.length/2; i < a.length; i++) {
            a[i]=a[a.length-i-1]=n++;
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int x=s.nextInt();
        int[] ar= new int[x];

        fillmir(ar);
        System.out.println(Arrays.toString(ar));
    }
}
