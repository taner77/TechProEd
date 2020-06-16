package day14_do_while_loop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        // Kullanicidan sayi alin
        // Sayi 10'dan kucukse ekrana "Kazandiniz" yazdirin
        // Sayi 10 veya 10'dan buyukse ekrana "Tekrar deneyiniz" yazdirin

        Scanner scan =new Scanner(System.in);
        int num = 0;

        do{
            System.out.println("Bir sayi giriniz:");
            num =scan.nextInt();
        }while(num>=10);
        System.out.println("Kazandiniz!");

        scan.close();
    }
}
