package day03_operators;

public class TypeCasting01 {
    public static void main(String[] args) {
        byte by = 101;
        int sayi1 = by;
        // Kucuk data tipini buyuk data java otomatik cevirir (Auto Widening)

        System.out.println(sayi1); //101


       int sayi2 = 53;
       byte by2 = (byte)sayi2;
        // Buyuk data tipini kucuk data tipine cevirmek java tarafindan yapilmaz.
        // Sag tarafa donusturmek istedigimiz data tipini parantez icinde yazmaliyiz
        System.out.println(by2);

        double sayi3 = 23.5;
        int by3 = (int)sayi3;
        System.out.println(by3); //23

        float sayi4 = -23.9f;
        short by4 = (short)sayi4;
        System.out.println(by4); //-23

        double sayi5 = 4.8;
        double sayi6 = 1.4;
        double sonuc1= sayi5 / sayi6;
        System.out.println(sonuc1); // 3.428571428571429

        int sonuc2 = (int)(sayi5 / sayi6);
        System.out.println(sonuc2); //3

        int sayi7 = 5;
        int sayi8 = 3;
        int sonuc3 = sayi7 / sayi8;
        System.out.println(sonuc3); //1  int sonucun tam kismini gosterir

        int sayi9 = 254;
        byte by5 = (byte) sayi9;
        System.out.println(by5); // -2 -> 254'u 256'ya boler kalani yaza
        // Normalde byte'ta (-128 ....-1, 0, 1 ....127) 256 sayi var. 254  iki tane eksik






    }
}
