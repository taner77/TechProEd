package homework.day2;

import java.util.Scanner;

public class UcgeninCevresi {
    public static void main(String[] args) {
        //Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir program yazınız. (byte kullanınız)
        //Not 1: Üçgenin Cevresi: a + b + c

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin uc kenar uzunlugunu giriniz :");

        byte a = scan.nextByte();
        byte b = scan.nextByte();
        byte c = scan.nextByte();

        int cevre = a + b+ c;
        System.out.println("Ucgenin Cevresi : " + cevre);

    }
}
