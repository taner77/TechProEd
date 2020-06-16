package homework.day7;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        //Kullanıcıdan bir harf girmesini isteyin.
        //Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
        //“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
        //Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
        //“Z” değil ise ekrana “Son büyük harf değil” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a letter: ");
        char letter = scan.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            if (letter == 'a') {
                System.out.println("First lower case");
            } else {
                System.out.println("Not first lower case");
            }
        } else if (letter >= 'A' && letter <= 'Z') {
            if (letter == 'Z') {
                System.out.println("Last upper case");
            } else {
                System.out.println("Not last upper case");
            }

        }else{
            System.out.println("Invalid letter");
        }
        scan.close();
    }
}