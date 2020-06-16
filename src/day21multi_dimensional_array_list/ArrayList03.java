package day21multi_dimensional_array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //["Ali", "Can", "Ayse", "Ali"] olusturun

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Ali");
        System.out.println(list);

        list.remove("Ali");// Birden fazla eleman varsa ilkini siler
        System.out.println(list);//[Can, Ayse, Ali]


        list.remove("Kemal"); //remove() methodu listede olmayan elemanlar icin hata vermez
        System.out.println(list);

        System.out.println(list.remove("Ali")); //true
        System.out.println(list.remove("Kemal")); //false

        System.out.println(list.remove(0)); //bu C
        System.out.println(list);

        //"Ayse" elemanini "Aysegul" yapin. set() methodu kullanilir
        System.out.println(list.set(0, "Aysegul")); // Ayse yani degisimden onceki hali ekran yazdirir
        System.out.println(list);

        //List'e "Kenan" ve "Zeynep" ekleyin
        list.add("Kenan");
        list.add("Zeynep");
        System.out.println(list);//[Aysegul, Kenan, Zeynep]

        list.clear();
        System.out.println(list.isEmpty());//true
        System.out.println(list);

    }
}
