package day35_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {
    public static void main(String[] args) {
        //Elemanlari A, B, C Stringleri olan bir list olusturunuz

        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);//[A, B, C]

        //list iterator olusturun
        //listIterator bir listteki elemanlari degistirmek icin kullanilir
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
           Object element = listIterator.next();
            System.out.print(element+ " "); //A B C
        }
        System.out.println();
        //hasPrevious() ve previous() methodlarini kullanarak
        //bir listin elemanlarini tersten yazdirmak isterseniz mutlaka
        //once hasNext() ve next() kullanmalisiniz

        while(listIterator.hasPrevious()){
            Object element = listIterator.previous();
            System.out.print(element+" ");
        }








    }
}
