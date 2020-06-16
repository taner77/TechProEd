package day37_maps;

import java.util.Hashtable;

public class Maps02 {
    public static void main(String[] args) {
        /*
        HashTable: HashMap ile hemen hemen aynidir. console 'a rastgele yazar
         Farklari:
        1) HashTable key ve value'larda null'a musade etmez
        2) HashTable thread safe'dir
        3) HashTable dah yavastir
         */

        Hashtable<String, String> hTable = new Hashtable<>();
        hTable.put("Dil", "Kalp");
        hTable.put("Gonul", "Kalp");
        hTable.put("Dil", "Tad alma organi");
        hTable.put("Ali", "");//"" null olmadigindan problem yok
        //==> hTable.put(null, "Agizlik");//Run Time Error verir
        //==> hTable.put("Kanaat", null);//Run Time Error verir
        //Ayni key degerini tekrar kullanirsaniz son value'yu kabul eder
        System.out.println(hTable);//{Dil=Tad alma organi, Gonul=Kalp, Ali=}

        //HashMap'de kullandigimiz methodlarin tamami HashTable'da da kullanilir

    }
}
