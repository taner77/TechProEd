package day03_operators;

import java.util.Scanner;

public class Wrapper01 {
    public static void main(String[] args) {
        // Kullanicidan ad ve soyadini alip ekrana yazdirin
        //String kullaniniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name =scan.nextLine();

        // next() tek kelimelik String ler icin kullanilir
        // Space gorunce String'i almay birakir
        // nextLine() girilen tum String'i almak icin kullanilir

        System.out.println(name);

    }
}
