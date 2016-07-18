package com.company.homeworks;
//Написать код, который позволит менять и читать значения произвольных битов в массиве int-ов.
/**
 * Created by ddexster on 04.07.16.
 */
public class hwIsBitinArr {
    //Проверка бита в указанной позиции на 1
    static boolean isBit(int x, int pos) {
        return (x & (1<<pos))!=0;
    }
    //установка бита в указанной позиции на 1
    static int setBit(int x, int pos) {
        return x | (1<<pos);
    }

    static void setBit (int[] a, int pos) {
        int intN=a.length-(pos/32)-1;
        int bitN=pos%32;
        a[intN]=setBit(a[intN], bitN);
    }

    static boolean isBitSet(int[] a, int pos) {
        int intN=a.length-(pos/32)-1;
        int bitN=pos%32;
        return  isBit(a[intN], bitN);
    }

    public static void main(String[] args) {
        int[] a={0,0};

        setBit(a,0);
        setBit(a,1);
        setBit(a,32);
        setBit(a,63);

        System.out.println(isBitSet(a,0));
        System.out.println(isBitSet(a,1));
        System.out.println(isBitSet(a,32));
        System.out.println(isBitSet(a,63));
        System.out.println(isBitSet(a,55));
    }
}
