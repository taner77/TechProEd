package review02;

import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        /*
        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                 1983
                 2020
        5.Adım Raporu aşağıdaki gibi yazdırınız
                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
           //Şifre= 37HEi56
        */

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen adınızı ve soy adınızı giriniz:");
        String ad =scan.nextLine();
        String soyad =scan.nextLine();

        System.out.println("Lütfen doğum yılınızı ve şimdiki yılı giriniz:");
        int dogumYili = scan.nextInt();
        int simdikiYil = scan.nextInt();
        int yas = simdikiYil-dogumYili;

        String rapor ="Adiniz :" +ad +", "+ "Soyadiniz : "+ soyad +", "+ "Yasiniz : "+ yas;
        System.out.println(rapor);

      //6. adim
        int l1=ad.length();
        int l2=soyad.length();
//        String sifre = yas +""+ ad.toUpperCase().charAt(0)+ soyad.toUpperCase().substring(0,1)+
//                 "" +soyad.charAt(soyad.length()-1) + l1 + l2;



        String sifre = yas+ad.substring(0,1)+soyad.charAt(0)
                +soyad.charAt(soyad.length()-1)+ad.length()+soyad.length();
        System.out.println("Şifreniz: "+sifre);
        System.out.println(sifre);

     scan.close();



    }
}
