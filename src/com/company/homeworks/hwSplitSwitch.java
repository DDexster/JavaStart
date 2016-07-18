package com.company.homeworks;

import java.util.Arrays;

/**
 * Created by ddexster on 06.07.16.
 */
//ано текст из 3-х слов “word1 word2 word3”. Поменять 1-е и 3-е слова местами и вывести на экран результат.
public class hwSplitSwitch {
    public static void main(String[] args) {
        String text="word1 word2 word3";
        String[] ts=text.split(" ");
        System.out.println(Arrays.toString(ts));
        String t=ts[2];
        ts[2]=ts[0];
        ts[0]=t;
        System.out.println(Arrays.toString(ts));

    }
}
