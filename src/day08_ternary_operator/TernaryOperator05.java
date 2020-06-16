package day08_ternary_operator;

import java.util.Scanner;

public class TernaryOperator05 {
    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character ");
        char ch = scan.next().charAt(0);

            //  Ascii table  z          a          A         Z
       String result= ((ch<=122 && ch>=97) || (ch>=65 && ch<=90))  ?
               ((ch<=122 && ch>=97) ? "Kucuk Harf" : "Buyuk Harf") : "Harf Degil";

        System.out.println("result = " + result);

        scan.close();
    }
}
