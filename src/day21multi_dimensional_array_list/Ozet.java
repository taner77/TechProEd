package day21multi_dimensional_array_list;

import java.util.*;

public class Ozet {
    public static void main(String[] args) {
        List<String> a=new ArrayList<>(); // List olusturmak icin,

        a.add("Ayse");
        a.add("Serik");
        a.add("Sultan");
        a.add("Berik"); 		// Berik'i eklemek icin,
        a.add(4,"Ali"); 		// Ali'yi kacinci idx'e yerlestirmek istiyorsak,

        a.size(); 				// Kac Eleman Oldugunu kontrol etmek icin,
        Collections.sort(a);	// Alfabetik siralama yapmak icin,
        a.contains("Ayse");		// a list'inde Ayse'nin olup olmadigini kontrol etmek icin,
        a.isEmpty();			// a List'inde elemanin olup olmadigini kotrol etmek icin,
        a.remove("Serik"); 		// Serik'i kaldirmak icin,
        a.remove(1);       		// idx'i 1 olani kaldirmak icin,
        a.remove(a.size()-1); 	// En son elemani kaldirmak icin,
        a.set(0,"Adnan");		// 0 idx'teki elemanin yerine Adnan'i yazmak icin,

        System.out.println(a.remove(0)); // 0 idx'teki elamni siler ve onu ekrana yazdirmak icin,
        a.clear();              		// list'teki butun elemanlari silmek icin,
        a.add("Son");
        System.out.println(a);			// list' teki kalan elemanlari yazdirmak icin,
    }

}

