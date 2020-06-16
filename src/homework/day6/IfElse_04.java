package homework.day6;

import java.util.Scanner;

public class IfElse_04 {
    public static void main(String[] args) {
        //Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
        //Diğer durumlarda ekrana “Harf değil” yazdırın.

        Scanner scan  = new Scanner((System.in));

        System.out.println("Lutfen bir character giriniz");
        char ch = scan.next().charAt(0);

        if ((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')){
            System.out.println("Harf");

        }else{
            System.out.println("Harf degil");
        }
    }
}
