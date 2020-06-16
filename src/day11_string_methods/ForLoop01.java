package day11_string_methods;

public class ForLoop01 {
    public static void main(String[] args) {
        //6,5 4,3,2,1. -1  yi ekrana yazdiran for loop olusturun

        for(int i=6; i>-2; i--){
            System.out.println(i);
        }

        //3, 4, 5, 6, 7, sayilarini ekrana yazdiran for loop
        for(int i=3; i<8; i++){
            System.out.println(i);
        }

        // ilk 100 sayma sayisini ekrana yazdiran for loop
        for(int i=1; i<=100; i++){
            System.out.print(i + " ");  // 1 den 100 e
        }


        System.out.println();

        for(int i=100; i>0; i--){
            System.out.print(i + " ");  // 100 den 1 e
        }

        System.out.println();

        //Ilk 50 cift sayma sayisini ekrana yazdiran for loop
        //2 4 6 .....100
        for(int i=2; i<101; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();
        //Ilk 50 tek sayma sayisini ekrana yazdiran for loop
        //1 3 5 7.... 99
        for (int i = 1; i <100 ; i=i+2) {
            System.out.print(i + " ");
        }


    }
}
