package com.company.lastlesson;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ddexster on 06.07.16.
 */
public class upinGrade {
    static long insq(long x, int y) {
        long r = x;
        while(y>1) {
            r=r*x;
            y--;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter a number you want to square: ");
        long n=sc.nextLong();
        System.out.print("Please enter a grade: ");
        int g=sc.nextInt();

        System.out.println("Result is: " +insq(n,g));

    }
}
