package day11_string_methods;

public class StringMethod01 {
    public static void main(String[] args) {

        //startsWith() methodu bir Stringin istenen harf harfle baslayip baslamadigini kontrol eder
        //Istenen harfle basliyorsa true, baslamiyorsa false return eder

        String str1 = "Ali Can";

        //startsWith() 1. versiyon
        System.out.println(str1.startsWith("A")); //true
        System.out.println(str1.startsWith("B")); //false
        System.out.println(str1.startsWith("a")); //false

        System.out.println(str1.startsWith("Ali"));//true

        //startsWith() 2.versiyon
        System.out.println( str1.startsWith("a",3)); //false. 3.character sonra(4.ch) a ile mi basliyor?
                                                                   // indexOf gibi

        System.out.println(str1.startsWith("Can",4)); //true


        //endsWith() methodu bir String'in istenen harfle bitip bitmedigini kontrol eder
        // Istenen harfle bitiyorsa true, bitmiyorsa false return eder

        String str2 = "Ayse Canan";
        System.out.println(str2.endsWith("n"));//true
        System.out.println(str2.endsWith("Canan"));//true
        System.out.println(str2.endsWith("CANAN"));//false

        System.out.println(str2.endsWith("")); // "" ve " " tamamiyla farklidir. Ikincinin icinde bosluk karakteri var
                                     // Birincinin icinde hicbirsey yok. true verir


        String str3 = "Ali ";
        System.out.println(str3.endsWith(" ")); //true
        System.out.println(str3.endsWith(""));  //true



    }
}
