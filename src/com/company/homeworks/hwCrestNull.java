package com.company.homeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ddexster on 24.06.16.
 */
public class hwCrestNull {

    static void arrout(char[][] a) {
        for (int i = 0; i < 4; i++) {
            for (int j=0; j < 4;j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*static void ifWin (char[][] a) {
        if (Arrays.equals(a[1][1],a[1][2]) && Arrays.equals(a[1][2], a[1][3]) && Arrays.equals(a[1][1],a[1][3])
                //|| a[1][1]==a[2][1]==a[3][1] || a[2][1]==a[2][2]==a[2][3]
               // || a[1][2]==a[2][2]==a[3][2] || a[3][1]==a[3][2]==a[3][3] || a[1][3]==a[2][3]==a[3][3]
               // || a[1][1]==a[2][2]==a[3][3] || a[1][3]==a[2][2]==a[3][1]
        ) return true;
        }*/

    public static void main(String[] args) {
        char[][] field = new char[4][4];

        for (int i=0; i<4; i++) field[i][0]=Character.forDigit(i,4);

        for (int i=0; i<4; i++) field[0][i]=Character.forDigit(i,4);

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) field[i][j] = '-';
        }

        arrout(field);

        System.out.println("Добро пожаловать в игру 'Крестики-нолики'");
        String p1=new String();
        String p2=new String();
        Scanner s=new Scanner(System.in);

        System.out.print("Игрок 1, представьтесь пожалуйста: ");
        p1=s.nextLine();
        System.out.print("Игрок 2, представьтесь пожалуйста: ");
        p2=s.nextLine();

       /* do {
            int x;
            int y;
            System.out.print(p1+" введите координаты для Х: ");
            x=s.nextInt();
            y=s.nextInt();
            if (field[x][y]=='-')
                field[x][y]='X';
            else
                System.out.println("Данная координата занята! Попробуйте еще!");
                return;

            System.out.print(p1+" введите координаты для О: ");
            x=s.nextInt();
            y=s.nextInt();
            if (field[x][y]=='-')
                field[x][y]='O';
            else
                System.out.println("Данная координата занята! Попробуйте еще!");
            }
        while (ifWin==false); */


        }
}

