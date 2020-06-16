package day04_operators;

import java.util.Scanner;

public class InterviewSorusu01 {
    public static void main(String[] args) {
        // iki tane variable'in degerlerini yer degistiriniz
        //sayi1=12,  sayi2=30 --> sayi1= 30,  sayi2=12 (SWAP)

        Scanner scan = new Scanner(System.in);
        System.out.println("Yerlerini degistirmek icin iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan .nextDouble();

        //1. Yol
        System.out.println("Yer degistirmeden once:");
        System.out.println(sayi1);
        System.out.println(sayi2);

        double gecici =0.0;
        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("Yer degistirdikten sonra:");
        System.out.println(sayi1);
        System.out.println(sayi2);

        //2. Yol
        System.out.println("Yer degistirmek icin iki sayi dah giriniz");

        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        sayi3 = sayi3 + sayi4;
        sayi4 = sayi3 - sayi4;
        sayi3 = sayi3 - sayi4;

        System.out.println("Yer degistirdikten sonra:");
        System.out.println(sayi3);
        System.out.println(sayi4);






    }
}
