package day08_ternary_operator;

import java.util.Scanner;

public class TernaryOperator03 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi aliniz
        // Kucuk sayiyi ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        
        int result = (num1<=num2) ? num1 : num2;
        System.out.println("result = " + result);

        scan.close();
        
    }
}
