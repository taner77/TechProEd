package homework.day13;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek
        //ekrana yazdırın.
        //Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime veya cumle giriniz:");
        String str = scan.nextLine();

        char ilkH =str.charAt(0);
        char sonH =str.charAt(str.length()-1);
        String orta = str.substring(1, str.length()-1);

        System.out.println(sonH + orta + ilkH);

        scan.close();
    }
}
