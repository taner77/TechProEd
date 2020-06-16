package homework.day8;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = scan.nextInt();
        
       int result = (num>=0) ? (num)  :  (num*(-1));
        System.out.println("result = " + result);

        scan.close();

    }
}
