package review03;

import java.util.Scanner;

public class Variables2 {
    public static void main(String[] args) {
        //Kullanicidan iki farkli kelime yazsin - (String) olarak
       //Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
         /* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
        kullaniriz. next() tek kelimelik String'ler icin kullanilir.
        Space gorunce String'i almayi birakir.
        nextLine() girilen tum String'i almak icin kullanilir.*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Ilk kelimeyi giriniz");
        String str1 = scan.next();

        System.out.println("Ikinci kelimeyi giriniz");
        String str2 = scan.next();

        String merge = str1 + " " + str2 + "!";
        System.out.println(merge);

        scan.close();
    }
}
