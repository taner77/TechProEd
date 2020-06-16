package homework.day6;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        //) Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
        //“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. “Pazar” ise ekrana
        //“Hıristiyanlar icin kutsal gün” yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir gun giriniz: ");
        String day = scan.nextLine();

        if( day.equalsIgnoreCase("Cuma")){
            //equalsIgnoreCase() buyuk kucuk harf dikkate almadan esitlige bakar
            //equalsIgnoreCase() icin cuma = Cuma = CUMA = CuMa ayni kabul edilir.
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if( day.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if( day.equalsIgnoreCase("Pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }


    }
}
