package day37_collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        /*Deque : Double Ended Queue (Iki uclu queue)
        ==> Queue'larda ekleme sona yapilir, silme bastan yapilir
        Deque kullanirsaniz eklemeyi hem basa hem de sona yapabilirsiniz
        ayni sekilde silmeyi de hem bastan hem de sondan yapabilirsiniz
        Deque'da FIFO var bunun yaninda LIFO ( Last In First Out) da var

        Queue'larda eleman olarak null eklenebilir ama Deque'lara null eleman
        olarak eklenmez
         */

        Deque<String> dq = new LinkedList<>();
        dq.add("Son1");
       // dq.add("Bas1");
        dq.addFirst("Bas1");
        dq.addLast("Son2");
        dq.push("Bas2");// push() en basa ekleme yapar
        dq.offer("Son3");
        dq.offerFirst("Bas3");
        dq.offerLast("Son4");

        System.out.println(dq);//[Bas3, Bas2, Bas2, Son1, Son2, Son3, Son4]
        //pop() methodu Deque'larda bastaki elemani siler ve bastaki
        //      elemani return eder.
        System.out.println(dq.pop());//Bas3
        System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3, Son4]

        System.out.println(dq.removeLast());//Son4
        System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3]

        System.out.println(dq.removeFirst());//Bas2
        System.out.println(dq);// [Bas1, Son1, Son2, Son3]

    }
}
