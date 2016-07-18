package com.company.lastlesson;
//Проверить баланс круглых скобок в выражении. Пример: “((x – 8)+a(y – 1))”
/**
 * Created by ddexster on 06.07.16.
 */
public class balInRounds {
    public static void main(String[] args) {
        String s = "((x – 8)+a(y – 1))";
        int cop = 0, ccl = 0, pos = 0;


        do {
            pos = s.indexOf('(', pos);
            if (pos >= 0) {
                cop++;
                pos++;
            }
        } while (pos >= 0);

        pos = 0;
        do {
            pos = s.indexOf(')', pos);
            if (pos >= 0) {
                ccl++;
                pos++;
            }
        } while (pos >= 0);

        if (cop == ccl) System.out.println("The balance is right!");
        else System.out.println("The balance is wrong, please correct the expression!");
    }
}
