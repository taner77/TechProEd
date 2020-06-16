package homework.day7;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        //Kullanıcıdan password girmesini isteyin.
        //Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        //Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter your password: ");
        int  password = scan.nextInt();

        if(password%5 == 0){
            if(password%10 == 0){
                System.out.println("Even number divided by 5");
            }else{
                System.out.println("Odd number divided by 5");
            }
        }else{
            System.out.println("Please try again!");
        }
        scan.close();

    }
}
