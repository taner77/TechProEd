package day07_nestedIf;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        // Kullacidan password girmesini isteyin
        // Password 4 basamakli  ise cift sayi olup olmadigini kontrol edin
        // Cift sayi ise ekrana "Password tamam" yazdirin, tek sayi ise "Tekrar deneyin" yazdirin

     Scanner scan = new Scanner(System.in);

        System.out.println("Please enter  your password;");
        int password = scan.nextInt();

        if (password>999 && password<10000){
            if(password%2 == 0){
                System.out.println("Password ok");
            }else {
                System.out.println("Please try again");
            }
        }else{
            System.out.println(" Try again please!");
        }
        scan.close();
    }
}
