package day21multi_dimensional_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        //["A", "C", "B", "C"] listini olusturun
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("C");
        list.add("B");
        list.add("C");
        System.out.println(list);

        // list'te eleman olarak B var mi?
        System.out.println(list.contains("B"));// Eger B varsa true, yoksa false return eder

        //list'te eleman olarak Z var mi?
        System.out.println(list.contains("Z"));

        //list'teki elemanlari alfabetik olarak siraya koyunuz
        //Collections ==> Bir araya getirilmis parcalar
        // Bir list'teki elemanlari alfabetik siraya (Natural order) dizmek icin
        //Collections.sort() methodu kullanilir. Argument olarak list'in kullaniniz
        Collections.sort(list);
        System.out.println(list);

    }
}
