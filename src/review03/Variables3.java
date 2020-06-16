package review03;

import java.util.Scanner;

public class Variables3 {
    public static void main(String[] args) {
        /*
          Kullanici  iki sayi girsin
          Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
          Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
          ve sonucunu ekrana yazdirsin. //
          Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
          Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
         */


        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen 1. Sayiyi Giriniz");
        int num1 = scan.nextInt();

        System.out.println("Lutfen 2. Sayiyi Giriniz");
        int num2 = scan.nextInt();

        int ilkKare = num1*num1;
        System.out.println("Ilk Sayinin Karesi; " + ilkKare);

        int ikinciKare = num2*num2;
        System.out.println("Ilk Sayinin Karesi; " + ikinciKare);

        int ilk5Carp = num1*5;
        System.out.println(ilk5Carp);

        int ikinci5Carp = num2*5;
        System.out.println(ikinci5Carp);

        int eklenecekSayi = 12;
        int ilk12Ekle = num1+eklenecekSayi;
        System.out.println("ilk 12 Ekle; "+ilk12Ekle);

        int ikinci12Ekle = num2+eklenecekSayi;
        System.out.println(ikinci12Ekle);

        int cikarilacakSayi = 5;
        int ilk5Cikar = num1-cikarilacakSayi;
        System.out.println(ilk5Cikar);

        int ikinci5Cikar = num2 - cikarilacakSayi;
        System.out.println(ikinci5Cikar);
     scan.close();
    }
}
