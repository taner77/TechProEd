package homework.day8;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin.
        // En ve boy eşit ise ekrana “Kare”, farklı ise ekrana “Dikdörtgen” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdortgenin enini giriniz");
        double en = scan.nextDouble();

        System.out.println("Dikdortgenin boyunu giriniz");
        double boy = scan.nextDouble();

        String result = (en>0 && boy>0 ) ? (en==boy ? "Bu bir karedir" : "Bu bir dikdortgendir")      :
                                           ("Gecersiz bir deger girdiniz. Lutfen tekrar deneyiniz");
        System.out.println(result);

        scan.close();
    }
}
