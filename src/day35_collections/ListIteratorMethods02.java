package day35_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {
    public static void main(String[] args) {
        //elemanlari A, B, C olan bir list olusturunuz
        //List iterator kullanarak AW, BW ve CW'ye donusturunuz

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        //Elemanlari AW BW CW yap
        while(listIterator.hasNext()){
            Object element = listIterator.next();
            listIterator.set(element+"W");
        }
        System.out.println(list); //[AW, BW, CW]

        listIterator.add("Kemal");
        listIterator.add("Can");






    }
}
