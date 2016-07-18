package com.company.lastlesson;


import java.util.Scanner;

/**
 * Created by ddexster on 06.07.16.
 */
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int result=0;

        String num=sc.nextLine();

        for (int i = 0; i < num.length(); i++) {
            result+=num.charAt(i)-'0';
        }

        /*long digit=sc.nextLong();
        int curint=0;

        while (digit>0) {
            curint=(int)(digit%10);
            result+=curint;
            result+=digit%10;
            digit/=10;
        } */

        System.out.println("The sum of all digits in number is "+result);
    }
}
