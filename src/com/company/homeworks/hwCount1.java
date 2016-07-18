package com.company.homeworks;
//Ввести с консоли целое число. Посчитать количество единиц в его бинарном представлении (“1011” –> 3)

import java.util.Scanner;

/**
 * Created by ddexster on 04.07.16.
 */
public class hwCount1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число: ");
        int x=sc.nextInt();
        int xf=x;
        int count=0;

        while (x!=0) {
            if (x%2!=0) count++;
            x=x/2;
        }

        System.out.println("Количество единиц в двоичном представлении "+xf+" равно: "+count);
    }
}
