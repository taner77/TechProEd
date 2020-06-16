package day35_collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        //Linked list'de head haric her eleman icin bir data bir de pointer var.
        //head'de sadece pointer var.
        //Her elemanin pointer'i bir sonraki elemani gosterir, son eleman'in(tail)
        //pointer'i Null gosterir.
        //Data ve pointer iceren her elemanin diger adi "Node" dur.
        //Linked list eleman ekleme ve cikarma durumlarinda basarilidir.


        //Linked list objesi olusturunuz
        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("Mark");
        linkList.add("Amanda");
        linkList.add("John");
        linkList.add("Ann");
        linkList.add("Pamela");
        System.out.println(linkList);//[Mark, Amanda, John, Ann, Pamela]

        linkList.remove(2); //remove() methodu indekse gore eleman siler
        System.out.println(linkList);//[Mark, Amanda, Ann, Pamela]

        linkList.removeFirst();
        System.out.println(linkList);//[Amanda, Ann, Pamela]

        linkList.removeLast();
        System.out.println(linkList);//[Amanda, Ann]

        linkList.add("Ali");
        System.out.println(linkList);//[Amanda, Ann, Ali]

        linkList.addFirst("Kemal");
        System.out.println(linkList);//[Kemal, Amanda, Ann, Ali]

        linkList.addLast("Zeynep");
        System.out.println(linkList);//[Kemal, Amanda, Ann, Ali, Zeynep]

        linkList.set(1, "Ajanda");
        System.out.println(linkList);//[Kemal, Ajanda, Ann, Ali, Zeynep]


        LinkedList<String> linkList2 = new LinkedList<>();
        linkList2.addLast("X");
        linkList2.addLast("Y");

        linkList.addAll(linkList2);
        System.out.println(linkList);//[Kemal, Ajanda, Ann, Ali, Zeynep, X, Y]

        linkList2.addAll(linkList);
        System.out.println(linkList2);//[X, Y, Kemal, Ajanda, Ann, Ali, Zeynep, X, Y]

        linkList.addAll(3, linkList2);
        System.out.println(linkList);


        System.out.println(linkList.contains("Can"));//false
        System.out.println(linkList.contains("Ali"));//true

        linkList.clear(); //Elemanlari siler
        System.out.println(linkList);//[]



    }
}
