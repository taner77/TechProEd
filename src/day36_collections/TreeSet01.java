package day36_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        //TreeSet: 1) HashSet ile hemen hemen aynidir. Duplication'a izin vermez
        //            key-value yapisi kullanir
        //         2) HashSet ile farki; TreeSet elemanlarini natural order'a gore dizer
        //            HashSet ise rastgele dizer
        //         3) HashSet ile farki; Hashset daha hizli calisir
        //         4) Natural order'a sahip bir set lazim oldugunda Hashset olusturulur,
        //            elemanlar eklenir sonra bu HashSet Treeset'e donusturulur
        //            boylelikle TreeSet'in hiz problemi halledilir. Direkt TreeSet olusturma
        //            genellikle kullanilmaz

        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("ABC");
        tSet.add("String");
        tSet.add("Test");
        tSet.add("Pen");
        tSet.add("Ink");
        tSet.add("Jack");
        System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test]

        //HahsSet olusturup Java'nin elemanlari hizli eklenmesini saglariz
        HashSet<String> hset1 =new HashSet<>();
        hset1.add("ABC");
        hset1.add("String");
        hset1.add("Test");
        hset1.add("Pen");
        hset1.add("Ink");
        hset1.add("Jack");
        System.out.println(hset1);

        //Olusturdugumuz HashSet'i TreeSet constructor'ina parametre olarak
        //koyup TreeSet'e ceviririz, boylelikle TreeSet'in elemanlari natural order
        //yapma ozelliginden istifade etmis oluruz.
        TreeSet<String> tSet1 = new TreeSet<>();
        System.out.println(tSet1);

    }
}
