package homework.day15;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        //Kullanıcıya paralelkenar, dikdörtgen ve diküçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
        //Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("paralekenar, dikdortgen, dikucgen sekillerinden birini seciniz");
        String sekil = scan.nextLine().toLowerCase();

        System.out.println("Iki kenar uzunlugu giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        cevreAlanHesplama(sekil, num1, num2);

     scan.close();
    }

    public static void cevreAlanHesplama (String sekil, int num1, int num2){
        switch (sekil){
            case "paralelkenar":
                System.out.println("Paralelkenarin cevresi = "+ 2*(num1+num2));
                break;
            case "dikdortgen":
                System.out.println("Dikdortgenin cevresi = " + 2*(num1+num2));
                System.out.println("Dikdortgenin alani = " + num1*num2);
               break;
            case "dikucgen":
                System.out.println("Dik ucgenin alani = " + (num1*num2)/2);
                break;
            default:
                System.out.println("Gecersiz sekil");
        }

    }


}
