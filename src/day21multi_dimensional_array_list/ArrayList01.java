package day21multi_dimensional_array_list;

import java.util.ArrayList;
import java.util.List;


public class ArrayList01 {
    public static void main(String[] args) {
       // Array'lerde length sabittir, degistirilemez.
       // ArrayList'lerde (List) length esnektir. Siz eleman ekledikce List length'ini
       // artirir, six eleman sildikce List length'ini azaltir.



       // List<String> list01 = new List<>(); ==> olmaz
       // ArrayList<String> list01 = new List<>(); ==> olmaz
       // ArrayList<String> list01 = new ArrayList<>(); ==> Bu olabilir ama asagidaki daha
        // cok kullanilir
        // ArrayList<String> list01 = new ArrayList<String>(); ==> Bu da olabilir ama asagidaki daha
        // cok kullanilir

        List<String> list01 = new ArrayList<>();
        System.out.println(list01);

        //List'e eleman eklemek icin add() methodu kullanilir
        list01.add("Ali");
        System.out.println(list01); //[Ali]

        list01.add("Can");
        System.out.println(list01); //[Ali, Can]  once ekleneni once koyar

        // Veli'yi Ali ile Can arasina ekleyelim
        list01.add(1,"Veli");
        System.out.println(list01);

        list01.add(0,"Han"); //[Han, Ali, Veli, Can]
        System.out.println(list01);
        list01.add(2,"Kemal"); //[Han, Ali, Kemal, Veli, Can]
        System.out.println(list01);
        list01.add("Ayse");
        System.out.println(list01); //[Han, Ali, Kemal, Veli, Can, Ayse]


        //list01'in eleman sayisini ekrana yazdiriniz
        System.out.println("Eleman sayisi = " + list01.size());




    }
}
