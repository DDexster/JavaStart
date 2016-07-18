package com.company.homeworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ddexster on 30.06.16.
 */
public class hwDateCompare {

    public static void main(String[] args) {
        //Ввести с консоли дату. Сравнить ее с текущей датой в
        //системе. Вывести отличающиеся части (год, месяц) на экран
     
        Calendar c1 = Calendar.getInstance();
        Scanner s= new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Please enter some date (in format dd/MM/yyyy): ");
        String s2=s.nextLine();

        Date dt= null;
        try {
            dt = sdf.parse(s2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar c2 = Calendar.getInstance();
        c2.setTime(dt);

        System.out.println("Today's date is: "+c1.get(Calendar.DATE)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.YEAR));
        System.out.println("Date you've entered: "+c2.get(Calendar.DATE)+"/"+(c2.get(Calendar.MONTH)+1)+"/"+c2.get(Calendar.YEAR));

        System.out.println("Date differs on:");
        if (!c1.equals(c2)) {
            int d1=c1.get(Calendar.DATE);
            int d2=c2.get(Calendar.DATE);
            if (d1!=d2) System.out.println(d1-d2+" days");

            int m1=c1.get(Calendar.MONTH);
            int m2=c2.get(Calendar.MONTH);
            if (m1!=m2) System.out.println(m1-m2+" month");

            int y1=c1.get(Calendar.YEAR);
            int y2=c2.get(Calendar.YEAR);
            if (y1!=y2) System.out.println(y1-y2+" years");

        }

    }
}
