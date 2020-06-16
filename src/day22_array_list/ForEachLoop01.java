package day22_array_list;

import java.util.*;

public class ForEachLoop01 {
    public static void main(String[] args) {
        // For Each Loop, for loop'un ust versiyonudur
        //Diger adi "Enhanced (zenginlestirilmis) For Loop "

        int arr[] = {12, 21, 13, 43};

        // for loop kullanarak elemanlari ekrana yazdir
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println("\n" + "-----------------");
        //for each loop kullanarak elemanlari ekrana yazdir
        for (int w : arr) {
            System.out.print(w + " ");
        }

        System.out.println();


        ///String iceren bir array olusturun, elemanlarini yanyana aralarina bosluk koyarak
        //for each loop ile ekrana yazdirin.
        String arr2[] = {"Ali", "Ayse", "Kaan"};
        for (String w : arr2) {
            System.out.print(w +" ");
        }


        System.out.println();
        //Integer elemanlar iceren bir list olusturun.For each loop kullanarak
        //bu elemanlarin toplamini ekrana yazdirin.
        int sum =0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); //[1, 2, 3, 4, 5]
        for(int w : list){
            sum += w;
        }
        System.out.println("sum = " + sum); //15


        //{ {1,2}, {5}, {6,7,8} } array'indaki tum elemanlarin toplamini bulunuz
        int arr3[][] = { {1,2}, {5}, {6,7,8} };

        int sum1 = 0;
        for(int[] w : arr3){
            for(int y : w){
                sum1 += y;
            }
        }
        System.out.println("sum1 = " + sum1);





    }
}