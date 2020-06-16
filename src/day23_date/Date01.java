package day23_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {
    public static void main(String[] args) {
        //Bugunun tarihini ekrana yazdiralim
        System.out.println(LocalDate.now());

        //Bugunun zamanini ekrana yazdiralim
        System.out.println(LocalTime.now());

        //Bugunun tarihini ve zamanini ekrana yazdiralim
        System.out.println(LocalDateTime.now());//2020-05-20T11:02:58.975678300
                                // Buradaki "T" tarih ile saati ayiramk icin konuluyor


    }
}
