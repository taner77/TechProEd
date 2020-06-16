package day07_nestedIf;

import java.util.Scanner;

public class ArtikYilSorusu_Interview {
    public static void main(String[] args) {
        // Kullanicidan yil girmesini isteyin
        // Girilen yil artik yil ekran "Artik Yil" yazdirin
        // Girilen yil artik yil degilse ekrana "Artik Yil" yazdirin

        // Artik yil 1) Yil 100'e bolunurse 400 e de bolunmeli  --> 1300 artik yil degil
        //                                                      --> 1200 artik yildir
        //           2) Yil 100 e bolunmezse 4 e bolunmeli

        Scanner scan = new Scanner(System.in);

        System.out.println("Yil giriniz:");
        int year = scan.nextInt();

        if(year%100 == 0 && year%400 == 0){
            System.out.println(year + " Artik Yil");
        }else if(year%100 != 0 && year%4 == 0){
            System.out.println(year + " Artik Yildir");
        }else{
            System.out.println(year +" Artik yil degildir");
        }

    }
}
