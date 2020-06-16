package homework.day2;

import java.util.Scanner;

public class DikdortgenlerPrizmasi {
    public static void main(String[] args) {
        /*
        Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir program yazınız.
        Not: Dikdörtgenler Prizmasının Hacmi: En x Boy x Yükseklik
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Dikdortgenler prizmasini enini giriniz :");
        double en = scan.nextDouble();

        System.out.print("Dikdortgenler prizmasinin boyunu giriniz :");
        double boy = scan.nextDouble();

        System.out.print("Dikdortgenler prizmasinin yuksekligini giriniz :");
        double yukseklik = scan.nextDouble();

        double hacim = en * boy * yukseklik;
        System.out.println("Dikdortgenler Prizmasinin Hacmi : " + hacim);



    }
}
