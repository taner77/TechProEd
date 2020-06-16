package day10_string_methods;

import java.util.Scanner;

public class OdevSorusuSwitch {
    public static void main(String[] args) {
        //Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
        //Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
        //Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
        //Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ay ismini giriniz");
        String ay = scan.next();
        ay = ay.toLowerCase();

        switch(ay){
            case ("ocak"):
            case ("mayis"):
            case ("mart"):
            case ("temmuz"):
            case ("eylul"):
            case ("kasim"):
                System.out.println("BU ay 31 gundur");
                break;
            case ("subat"):
                System.out.println("BU ay 28 veya gundur");
                break;
            case ("nisan"):
            case ("ekim"):
            case ("haziran"):
            case ("agustos"):
            case ("aralik"):
                System.out.println("BU ay 30 gundur");
                break;
            default:
                System.out.println("Gecersiz ay");

        }
      scan.close();
    }

}
