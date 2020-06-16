package homework.day3;

import java.util.Scanner;

public class Odev_10 {
    public static void main(String[] args) {
        //10)Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız.
        //Ad ve soyad ilk satırda, adres ikinci satırda olsun.
        //(String kullanınız)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi  giriniz:");
        String adSoyad = scan.nextLine();
        //scan.nextLine();

        System.out.println("Adresinizi giriniz:");
        String adres = scan.nextLine();

        System.out.println(adSoyad);
        System.out.println(adres);






    }

}
