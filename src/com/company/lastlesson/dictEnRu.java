package com.company.lastlesson;

import java.util.Scanner;

/**
 * Created by ddexster on 06.07.16.
 */
public class dictEnRu {
    static String dictSearch(String s) {
        String [][] dict={{"apple", "box", "cage", "dictionary", "envelope", "forecast", "gravity", "height"},
                {"яблоко", "коробка", "клетка", "словарь", "конверт", "прогноз", "гравитация", "высота"}};
        s=s.toLowerCase();
        String [] search=s.split(" ");
        int pos=0;

        for (int i = 0; i < search.length; i++) {
            for (int j = 0; j < dict.length; j++) {
                for (int k = 0; k < dict[j].length; k++) {
                    if (search[i].equals(dict[j][k]))
                        System.out.println(dict[1][k]);
                }
            }

        } return null;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word to translate in Russian:");
        String text=sc.nextLine();
        System.out.println(dictSearch(text));

    }
}
