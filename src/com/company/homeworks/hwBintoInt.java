package com.company.homeworks;

import java.util.Scanner;

/**
 * Created by ddexster on 04.07.16.
 */
public class hwBintoInt {
    static int toD(String s) {
        int res=0;
        for (int i=s.length()-1, j=0; i>=0; i--, j++) {
            res+= Math.pow(2,j)*(s.charAt(i)=='1'? 1:0);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите произвольное число в двоичной системме: ");
        String s1=sc.nextLine();
        System.out.println("Ваше число в десятичной системме: "+toD(s1));

    }
}
