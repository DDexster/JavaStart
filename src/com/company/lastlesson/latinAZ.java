package com.company.lastlesson;

/**
 * Created by ddexster on 06.07.16.
 */
public class latinAZ {
    public static void main(String[] args) {
        for (char c='A'; c<='Z'; c++)
            if (c=='Z')
                System.out.println(c);
            else
                System.out.print(c+", ");
    }
}
