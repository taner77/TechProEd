package homework.day6;

import java.util.Scanner;

public class IfElse_03 {
    public static void main(String[] args) {
       // Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
       // Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
       // ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen urun miktarini giriniz:");
        int miktar = scan.nextInt();

        System.out.println("Lutfen urunun birim fiyatini giriniz");
        double birimFiyat = scan.nextDouble();

        if(miktar>1000){
            System.out.println("Toplam Fiyat = " + miktar*birimFiyat*0.9);
        }else{
            System.out.println("Toplam Fiyat = " + birimFiyat*miktar);
        }


    }
}
