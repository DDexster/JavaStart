package com.company.lastlesson;

import java.util.Scanner;

/**
 * Created by ddexster on 06.07.16.
 */
public class isPrime {
    static boolean isPrime(int x) {
        if (x <= 1) return false;
        if(x==2) return true;
        else
            for (int i =2; i<x; i++)
                if (x%i==0) return false;
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to output primes: ");
        int num=sc.nextInt();

        for (int i=0; i<num; i++) {
            if (isPrime(i)) System.out.print(i+" ");
        }
    }
}
