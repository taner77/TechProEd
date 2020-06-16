package homework.day13;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        //Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın.
        //Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime veya cumle giriniz:");
        String str = scan.nextLine();

        int halfIdx = str.length()/2;
        System.out.println(str.substring(0,halfIdx));

        scan.close();
    }
}
