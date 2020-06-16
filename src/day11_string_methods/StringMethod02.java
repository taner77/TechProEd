package day11_string_methods;

public class StringMethod02 {
    public static void main(String[] args) {

        // substring() methodu bir String'in belli bir bolumunu kesip almak icin kesip almak icin kullanilir

        String str1 = "Java calisana kolaydir";

         // 1.versiyon
        System.out.println(str1.substring(5)); //calisana kolaydir
        System.out.println(str1.substring(8)); //isana kolaydir (8. ch dahil=inclusive)
        System.out.println(str1.substring(22));//ekranda birsey goremezsiniz

        // System.out.println(str1.substring(25));//StringIndexOutOfBoundsException: String index out of range: -3

         // 2. versiyon
        System.out.println(str1.substring(5,13)); //calisana
                                    // 5. ch dahil, 13.ch dahil degil
                                 // ilk index akranda goorulur. ikinci index gorulmez

        System.out.println(str1.substring(6,12)); //alisan
        System.out.println(str1.substring(6,6)); // bisey cikti almaz. sayilar esit kullanilmaz






    }
}
