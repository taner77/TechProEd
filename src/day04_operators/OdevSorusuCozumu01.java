package day04_operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {
    public static void main(String[] args) {

      // Kullanicidan int aldiktan sonra String alamiyoruz
        Scanner scan = new Scanner(System.in);

        System.out.println("Yasinizi giriniz");
        String yas = scan.nextLine();  //DIKKAT!!!!  int yerine String kullandik
        int yeniYas =Integer.parseInt(yas);  // sadece rakam iceren String'i tamsayiya cevirir
        System.out.println(yas);

        System.out.println("Adinizi ve soyadinizi giriniz");
        String isim = scan.nextLine();
        System.out.println(isim);





    }
}
