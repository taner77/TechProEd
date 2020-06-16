package homework.day22;

import java.util.*;

public class Odev2 {
    public static void main(String[] args) {
        //Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
        //For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int sum=0;
        for(int w : list){
           sum += w*w;
        }
        System.out.println("Karelerin Toplami = " + sum);
    }
}
