package homework.day10;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        //Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
       // büyük harf olarak ekrana yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Where do you live? : ");
        String answer = scan.nextLine();
        answer = answer.toUpperCase();


        System.out.print(answer.substring(1,2));
       // OR  System.out.println(answer.charAt(1));

        System.out.println(answer.charAt(answer.length()-2));

        //System.out.println(answer.charAt(1) +""+ answer.charAt(answer.length()-2));
    }
}
