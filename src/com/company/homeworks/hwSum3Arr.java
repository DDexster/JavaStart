package com.company.homeworks;
//Дано 3 массива чисел. С помощью 1-2-х циклов найти сумму элементов во всех массивах.

import java.util.Arrays;

/**
 * Created by ddexster on 06.07.16.
 */
public class hwSum3Arr {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5}, b={6,7}, c={8,9,1,4};
        int[][] ar={a,b,c};
        int sum=0;
        //System.out.println(Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum+=ar[i][j];
            }
        }
        System.out.println(sum);
    }
}
