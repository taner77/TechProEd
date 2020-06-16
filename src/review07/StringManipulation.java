package review07;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk
        //geri kalan harfleri kucuk yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String adSoyad = scan.nextLine().toLowerCase();

        int soyIsimBas = adSoyad.indexOf(" ");
//        String result = adSoyad.toUpperCase().charAt(0)+ adSoyad.substring(1,soyIsimBas+1)+
//                        adSoyad.substring(soyIsimBas+1,soyIsimBas+2).toUpperCase()+
//                        adSoyad.substring(soyIsimBas+2);
//        System.out.println(result);


        //2.yol
        String[] names = adSoyad.split(" ");


        for (int i = 0; i < names.length; i++) {
            if (names.length - 1 != i) { // en son bosluk olmasin diye
                System.out.print(names[i].substring(0, 1).toUpperCase() + names[i].substring(1)+" ");

            }else{
                System.out.print(names[i].substring(0, 1).toUpperCase() + names[i].substring(1));
            }

        }

    }
}