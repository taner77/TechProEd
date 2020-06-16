package day06_ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin
        // Pozitifse ekrana pozitive yazdirin
        // Negetifse ekrana negative yazdirin
        // Sifirsa ekrana zero yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: " );
        int num =scan.nextInt();

        if(num>0){
            System.out.println("Positive");
        }
        if(num<0){
            System.out.println("Negative");
        }
        if(num==0){
            System.out.println("Zero");
        }

    }
}
