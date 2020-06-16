package homework.day12;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
        //biten tüm harfleri büyük harf olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first letter :");
        char ch1 = scan.next().toUpperCase().charAt(0);


        System.out.println("Please enter second letter :");
        char ch2 = scan.next().toUpperCase().charAt(0);


        while(ch1<=ch2){
            System.out.print(ch1 + " ");
            ch1++;
        }
      scan.close();
    }
}
