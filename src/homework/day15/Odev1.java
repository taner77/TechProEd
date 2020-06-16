package homework.day15;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük
        //diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi  giriniz");
        String ad = scan.nextLine().toLowerCase();
        System.out.println("Soyadiniz giriniz");
        String soyAd = scan.nextLine().toLowerCase();

        adSoyAd(ad,soyAd);
        scan.close();


    }
    public static void adSoyAd (String ad, String soyAd){
        ad = ad.toUpperCase().charAt(0) + ad.substring(1);   // VEYA alttaki gibi
        soyAd= soyAd.substring(0,1).toUpperCase() + soyAd.substring(1);
        System.out.println(ad + " " + soyAd);
    }



}
