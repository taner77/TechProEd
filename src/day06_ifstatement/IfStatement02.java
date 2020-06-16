package day06_ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin
        // Deger cift sayi ise ekrana “cift” yazdirin
        // Deger tek sayi ise ekrana “tek” yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        if(num%2==0){
            System.out.println(num + " is a Even number");
        }
        if(num%2 != 0){
            System.out.println(num +" is a Odd number");
        }


    }
}
