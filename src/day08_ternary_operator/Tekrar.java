package day08_ternary_operator;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        // Kullanicidan bir sayi aliniz
        // Sayi cift ise 10 ile bolunup bolunmedigini kontrol ediniz
        // Sayi 10'a bolunuyorsa "Wooow 10"  yazdiriniz. 10'a bolunmuyorsa "Yazik 10" yazdiriniz
        // Sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz
        // Sayi 5 e bolunuyorsa “Wooow 5” yazdiriniz, 5 e bolunmuyorsa “Yazik 5" yazdiriniz
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");
        int num = scan.nextInt();

       String result= num%2 ==0 ? num%10 == 0 ? "wooov 10" : "yazik 10" : num%5 == 0 ? "Woov 5" : "yazik 5";
        System.out.println(result);

        scan.close();



    }
}
