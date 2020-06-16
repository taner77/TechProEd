package homework.day8;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        // Kullanıcıdan bir tamsayı girmesini isteyin, 
        // tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek” yazdırın.
        
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = scan.nextInt();
        
       String result = (num%2 ==0) ?  ("Even number") :("Odd number");
        System.out.println("result = " + result);

        scan.close();

    }
}
