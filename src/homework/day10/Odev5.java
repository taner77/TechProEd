package homework.day10;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Where do you live? : ");
        String answer = scan.nextLine();

        System.out.println(answer.substring(0,2).toUpperCase() );
    }
}
