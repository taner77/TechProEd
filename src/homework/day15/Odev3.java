package homework.day15;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
        //yazdıran bir program yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int num = scan.nextInt();

        rakamlariTopla(num);

    }
     public static void rakamlariTopla(int num){
        int sum =0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
         System.out.println("sum = " + sum);
     }
}
