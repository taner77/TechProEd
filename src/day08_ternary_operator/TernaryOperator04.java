package day08_ternary_operator;

import java.util.Scanner;

public class TernaryOperator04 {
    public static void main(String[] args) {

              // Ternary Operator (if Else if)

        // Kullanicidan bir sayi aliniz
        // Sayi 0 dan buyuk veya esit ise 10'dan kucuk olup olmadigini kontrol ediniz
        // 10'dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Positif Sayi"
        // Sayyi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        String result = num>=0 ? num<10 ? "Rakam" : "Pozitif Sayi" : "Negatif Sayi";

        System.out.println(num + " " + result + "dir");


        scan.close();
    }

}
