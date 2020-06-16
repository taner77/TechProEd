package day34_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {

       // Kullanicidan adini ve soyadini aliniz
        Scanner scan =new Scanner(System.in);
        System.out.println("Adinizi  giriniz");
        String ad=scan.nextLine();

        System.out.println("Soyadinizi  giriniz");
        String soyad=scan.nextLine();

        // 1)Ad ve soyadini console’a yazdirin
        System.out.println("Ad - Soyad:" +ad+ " "+soyad);
        // 2)Sadece adini console’a yazdirin
        System.out.println("Ad: "+ ad);
        // 3)Ad ve soyadinin ilk harflerini console’a yazdirin
        System.out.println("Ad ve soyadin ilk harfleri: "+ ad.charAt(0)+ soyad.charAt(0));

        // 4)Ad ve soyadini console’a tersten yazdirin
        String reverse ="";
        String fullName = ad + " " + soyad;
        for (int i =fullName.length()-1 ; i >=0 ; i--) {
            reverse += fullName.charAt(i);
        }
        System.out.print("Tesrten Yazim: " +reverse);
        //2.yol
        System.out.println();
        StringBuilder strB = new StringBuilder(ad + " "+ soyad);
        System.out.println("Tersten Yazim: "+ strB.reverse());

        // 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada console’a yazdirin.
        String tamAd =  ad+ soyad;
        String harfArr[] = tamAd.split("");
        Arrays.sort(harfArr);
        System.out.println("Harfler alfabetik sirada: " + Arrays.toString(harfArr));

        scan.close();
    }
}
