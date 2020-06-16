package homework.day4;

import java.util.Scanner;

public class IlkveSonRakamToplami {
    public static void main(String[] args) {
        //Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını ekrana yazdıran bir program yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Dort basamakli bir yamsayi giriniz:");
        int sayi = scan.nextInt();

        int ilkRakam = sayi % 10;
        int sonRakam = sayi / 1000;
        int sonuc = ilkRakam + sonRakam;

        System.out.println(sonuc);

    }
}
