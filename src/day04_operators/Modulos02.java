package day04_operators;

import java.util.Scanner;

public class Modulos02 {
    public static void main(String[] args) {
        /*
        Kullanicinin girdigi 4 basamakli sayinin birler ve onbinler basamagini toplayan
        program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Dort basamakli bir sayi giriniz:");
        int s = scan.nextInt();
        int birBs = s % 10;
        int onbinBs = (s / 1000);

        System.out.println(birBs + onbinBs);
    }
}
