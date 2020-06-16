package day07_nestedIf;

import java.util.Scanner;

public class OdevSorusu {
    public static void main(String[] args) {
        // Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
        // Diğer durumlarda ekrana “Harf değil” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir character giriniz:");
        char harf = scan.next().charAt(0); //Kullanicidan char almak icin next().char(0) kullanilir

        if ((harf<=122 && harf>=97) || (harf<=98 && harf>=65)){ //ASCII TABLOSUNDAN
            System.out.println("Bu bir harftir");
        }else{
            System.out.println("Bu bir harf degildir");
        }


    }
}
