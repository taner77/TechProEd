package day10_string_methods;

public class StringMethod01 {
    public static void main(String[] args) {
        // indexOf() methodu String icindeki characterin yerini belirlemek icin kullanilir

        String str1 = "Java World";


         // indexOf() methodu 1. versiyonu
        System.out.println( str1.indexOf('v'));  // Ekrana 2 yazdirir. Cunku index sayimi 0'dan baslar
        System.out.println( str1.indexOf('W')); // 5. Space java icin bir characterdir
        System.out.println( str1.indexOf('w')); // Java index bulamaz. Java "case sensitive" dir
                                                //Kucuk w yok. Java character bulamayinca -1 return eder

        System.out.println( str1.indexOf('a')); //Ekrana 1 yazdirir. Birden fazla kullanilan characterler
                                               //icin java ilk characterin indexini verir

        // indexOf() methodu 2. versiyonu
        System.out.println( str1.indexOf('a',2)); // Stringdeki ikinci 'a' characterinin yerini bulunuz
                                                                // Ekrana 3 yazdirmali
        System.out.println( str1.indexOf('W',4)); //5
        System.out.println( str1.indexOf('a',4)); // Ekrana -1 yazdirir. Cunku stringde 'a' olmasina ragmen
                                                                // aramaya basladigimiz yerde yok

        //"Alamanya" String'indeki 'a' characterinin indexini bulunuz
        String str2 = "Alamanya";
        System.out.println(str2.indexOf('a')); // Bu birinci 'a' nin indexi --> 2
        int idx = str2.indexOf('a');
        System.out.println(str2.indexOf('a',idx+1)); //4


        // indexOf() methodu 3. versiyonu
        String str3 = "Missisippi";
        str3.indexOf("is"); // Ilk is Stringini bulur ve ilk harfin indexini return eder
                            // Bu ornekte ilk "is" deki i harfinin indexi olan 1 i return eder

        System.out.println(str3.indexOf("si")); //3





    }
}
