package homework.day21;

import java.util.*;

public class Odev5 {
    public static void main(String[] args) {

        //1) Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("F");
        System.out.println(list); //[A, C, E, F]

        //2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        //   İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
        //   ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
        list.add("B");
        list.add(1,"L");
        System.out.println(list);  //[A, L, C, E, F, B]


        // 3) set() methodu kullanarak, E’yi D yapınız.
        //    ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
        list.set(3,"D");
        System.out.println(list); //[A, L, C, D, F, B]


        // 4) remove() methodu kullanarak, F’yi siliniz.
        //    ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
        list.remove("F");
        System.out.println(list);  //[A, L, C, D, B]


        //5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
        //   ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
        Collections.sort(list);
        System.out.println(list); //[A, B, C, D, L]

        //6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadığını doğrulayınız.
        System.out.println( list.contains("L")); //true
        System.out.println(list.contains("M")); //false

        //7) size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız.
        System.out.println(list.size()); //5

        //8) clear() methodu kullanarak, list’deki tum elemanları siliniz.
        list.clear();
        System.out.println(list); //[]

        // 9) isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
        System.out.println(list.isEmpty()); //true






    }
}
