package day23_date;

import java.time.*;

public class Date03 {
    public static void main(String[] args) {

        //Time Manipulation (Zamani degistirecegiz)

        LocalTime time = LocalTime.now();
        System.out.println(time);


        // plus ve minus methodlarini saat, dk ve sn icin kullaniniz
        System.out.println(time.plusSeconds(25));
        System.out.println(time.plusMinutes(5));
        System.out.println(time.plusHours(3));

        System.out.println(time.minusSeconds(15));
        System.out.println(time.minusMinutes(40));
        System.out.println(time.minusHours(2));

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);


    }
}
