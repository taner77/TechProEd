package day23_date;

import java.time.LocalDate;

public class Date02 {
    public static void main(String[] args) {

        //Date Manipulation (date uzerinde degisiklikler yapmak)

        LocalDate date = LocalDate.now();

        System.out.println(date); //2020-05-20
        System.out.println( date.plusDays(3));//2020-05-23
        System.out.println( date.plusDays(35));//2020-06-24  gun fazla olunca ay veya yil da degisir


        System.out.println(date.plusMonths(2)); //2020-07-20

        System.out.println(date.plusYears(3)); //2023-05-20


        System.out.println(date.minusDays(3)); //2020-05-17
        System.out.println(date.minusWeeks(1));
        System.out.println(date.minusMonths(4));
        System.out.println(date.minusYears(3));

    }
}
