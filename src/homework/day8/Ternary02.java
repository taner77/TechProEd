package homework.day8;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        //) Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        
       int result = (num1>=num2) ?  (num1 )  :(num2);
        System.out.println("result = " + result);

        scan.close();
    }
}
