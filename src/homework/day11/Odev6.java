package homework.day11;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
        //biten tüm harfleri büyük harf olarak ekrana yazdırın.

        Scanner scan =new Scanner(System.in);
//        System.out.println("Enter start letter ");
//        char start = scan.next().toUpperCase().charAt(0);
//
//        System.out.println("Enter finish letter ");
//        char finish = scan.next().toUpperCase().charAt(0);
//
//        for(char i= start; i<=finish; i++) {
//
//            System.out.print( i + " ");
//        }

        System.out.println("Enter first letter ");
        char first = scan.next().charAt(0);

        System.out.println("Enter second letter");
        char second = scan.next().charAt(0);

        for (char i = first;  i<= second; i++){
            System.out.print(String.valueOf(i).toUpperCase() + " ");
        }
        scan.close();

    }
}
