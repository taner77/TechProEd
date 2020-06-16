package homework.day4;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        //Kullanıcının girdiği 4 basamaklı sayının tum rakamlarının toplamını ekrana yazdıran bir program yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Dort basamakli bir tamsayi giriniz:");

        int sayi = scan.nextInt();
        int birlerB = sayi % 10;

        int v1 = sayi / 10;
        int onlarB = v1 % 10;

        int v2 = v1 / 10;
        int yuzlerB = v2 % 10;

        int binlerB = sayi /1000;

        System.out.println(birlerB + onlarB + yuzlerB +binlerB);







//        int ilkRakam = sayi /1000;
//        int ikinciRakam = (sayi % 1000) /100;
//        int ucuncuRakam = ((sayi % 1000) % 100)/10;
//        int sonRakam = sayi % 10;
//        System.out.println(ilkRakam + ikinciRakam + ucuncuRakam + sonRakam);




    }
}
