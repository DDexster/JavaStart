package com.company.homeworks;
//Дано текст. Убрать лишние пробелы, расставить знаки препинания.
// Пример: «Я длинное предложение Я второе предложение.» -> «Я длинное предложение. Я  второе предложение.»

import java.util.Arrays;

/**
 * Created by ddexster on 06.07.16.
 */
public class hwTextFormat {
    public static void main(String[] args) {
        String text="Я длинное          предложение Я торое предложение.";

        StringBuilder sb=new StringBuilder();
        String[] spl=text.split(" ");
        System.out.println(Arrays.toString(spl));

        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length()>0)
                sb.append(spl[i]);

            if (((i+1)<spl.length)&&
                    (spl[i+1].length()>0)&&
                    (Character.isUpperCase((spl[i+1].charAt(0))))&&
                    (! spl[i].endsWith("."))) {
                sb.append(".");
            }

            if (spl[i].length()==0)
                sb.append("");

            else sb.append(' ');
        }

        System.out.println(sb.toString());
    }
}
