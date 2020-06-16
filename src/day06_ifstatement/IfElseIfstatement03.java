package day06_ifstatement;

import java.util.Scanner;

public class IfElseIfstatement03 {
    public static void main(String[] args) {
        // Kullanicidan 6 basamkli bir sayi isteyin. o ile de baslayabilir
        //Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir
        // jackpot oyunu yaziniz
        // 000000 - 000001 -000002......999998 - 999999 ==> 1000000 sayi

        Scanner scan = new Scanner(System.in);
        System.out.println("6 Basamakli bir sayi giriniz :");
        int num  = scan.nextInt();

        if (num < 200000){
            System.out.println("Kazandiniz");
        }else if( num <500000){
            System.out.println("Tekrar deneyin");
        }else if ( num <1000000){
            System.out.println("Kaybettiniz");
        }

    }
}
