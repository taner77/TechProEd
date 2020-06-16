package homework.day2;
import java.util.Scanner;

public class Dikdortgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve
        cevresini hesaplayıp ekrana yazdıran bir program yazınız.
        Not: Alan: Boy x En
        Not: Çevre: 2x (Boy + En)
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Dikdortgenin enini giriniz :");
        double en = scan.nextDouble();

        System.out.print("Dikdortgenin boyunu giriniz :");
        double boy = scan.nextDouble();

        double cevre = 2 * (en + boy);
        System.out.println("Dikdortgenin Cevresi : " + cevre);

        double alan = en * boy;
        System.out.println("Dikdortgenin Alani : " + alan);





    }
}
