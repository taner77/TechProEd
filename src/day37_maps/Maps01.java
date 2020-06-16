package day37_maps;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        /*
        Map bir interface'dir. Map interface'inin 3 tane child class'i vardir
        1) HashMap: HashMap key- value yapisini kullanir. Key ve value programci tarafindan yazilir.
                    Key ve value'da null degeri kullanilabilir.Key'de 1'den fazla null degeri kullanilirsa
                    Java son kullanilan null'i kabul eder. Value da 1'den fazla null degeri kullanilabilir
                    HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina
                    = sembolu konularak yazdirilir
                    HashMap'ler ekrana yazdirirken rastgele siralma yapar
                    HashMap'lar map'lar arsinda en hizlisidir.
                    HashMap'ler "thread safe" degildir
        */

        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(33, "Ali");
        hashmap.put(2, "Veli");
        hashmap.put(111, "Mine");
        hashmap.put(4, "Kemal");
        System.out.println(hashmap);

        System.out.println( hashmap.remove(4));// Kemal
        System.out.println(hashmap.remove(111, "Ayse")); //false

        System.out.println(hashmap.get(33));//Ali
        System.out.println(hashmap.get(100)); //null

        System.out.println( hashmap.keySet()); //[33, 2, 111] sadece key'ler
        System.out.println( hashmap.values()); //[Ali, Veli, Mine] sadece value'ler

        System.out.println(hashmap.containsKey(111)); //true
        System.out.println(hashmap.containsValue(1)); //false

        hashmap.replace(111, "Mahmut");
        System.out.println(hashmap);

        hashmap.clear(); //tum elemanlari siler. clear() methodu void oldugu icin sout icinde yazilmaz
        System.out.println(hashmap);//{}





    }
}
