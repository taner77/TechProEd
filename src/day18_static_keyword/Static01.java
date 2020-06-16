package day18_static_keyword;

public class Static01 {
    String isim = "Ali Can";
    static int yas =44;

    public static void main(String[] args) {
        Static01 obj =new Static01();
        System.out.print(obj.isim);
        System.out.println(yas);
    }
//    static int en = 12;
//    static int boy = 10;
//    static int alan;
//    static int yaricap =4;
//    static double pi =8; //once static block calisir
//    // Eger bir variale'in degerini olustururken hesap yapmamiz gerekirse "static block"
//    // olusturmak iyidir. Yani "int alan= en*boy;" demek yerine
//    // "static block" olusturup bu islemleri static block'un icine yazmak daha iyidir
//    // "static block" variable'lara deger atamak icin de kullanilabilir
//
//    // static blok class'in icinde butun methodlarin (main dahil) ve constructorlarin
//    // disinda olusturulmalidir.
//    // static block class olusturuldugu zaman olusturulur
//
//    // static block tum methodlardan (main method dahil) ve constructorlardan once calistirilir
//
//    // Birden fazla static block varsa ustteki once calisir
//
//
//    static{
//        pi = 3.14;
//    }
//    static {
//         alan =  en*boy;
//     }
//
//
//
//
//    public static void main(String[] args) {
//        System.out.println(pi);
//    }
//
//    // Static class olusturulabilir ama alt classlar(inner class) static class olabilir
//    // ust classlar (outer class) static olamazlar
//
//
//    static class Altclass{
//
//    }
}
