package homework.day14;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.
        //“a” harfi yoksa tekrar bir String girmesini isteyin.

        Scanner scan = new Scanner(System.in);

        String str;
        do {
            System.out.println("Bir kelime veya cumle giriniz :");
             str = scan.nextLine();

        } while (!(str.contains("a")));

        System.out.println("a harfi var");
        scan.close();
    }
}
