package com.company.homeworks;

import java.util.Arrays;

/**
 * Created by ddexster on 06.07.16.
 */
public class hwWordCount {
    public static void main(String[] args) {
        String text="Дано текст и определенное слово. Посчитать сколько раз заданное слово встречается в тексте";
        String word="слово";
        text=text.toLowerCase();
        text=text.replace('.', ' ');

        /*String[] ts=text.split("\\s");            //реализация через массив
        System.out.println(Arrays.toString(ts));

        int count=0;
        for (int i = 0; i < ts.length; i++) {
            if (ts[i].equals(word)) count+=1;

        }
        System.out.println(count);*/

        /*int pos=0, count=0;             //реализация через парсинг строки
        do{
            pos=text.indexOf(word, pos);

            if (pos>=0) {
                count++;
                pos+=word.length();
            }

        } while (pos>=0);
        System.out.println(count);*/        //реализация через парсинг строки
    }
}
