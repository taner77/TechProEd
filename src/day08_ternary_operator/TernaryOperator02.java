package day08_ternary_operator;

import java.util.Scanner;

public class TernaryOperator02 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin
        // bu sayilar birbirine esit ise toplamlarini ekrana yazdrin
        // Bu sayilar birbirinden farkliysa carpimlarini ekrana yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        int result =(num1 == num2) ?  num1+num2 :  num1*num2; //TERNARY!!!
        System.out.println("result "+ result);

        scan.close();
    }
}
