package homework.day6;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
     // Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
     // b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz:");
       char letter = scan.next().charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("Sesli harf");
        }
        if(letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f') {
            System.out.println("Sessiz harf");
        }

    }
}
