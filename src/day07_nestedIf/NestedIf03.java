package day07_nestedIf;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        // Kullanicidan yil girmesini isteyin
        // Girilen yil artik yil ekran "Artik Yil" yazdirin
        // Girilen yil artik yil degilse ekrana "Artik Yil" yazdirin

        // Artik yil 1) Yil 100'e bolunurse 400 e de bolunmeli  --> 1300 artik yil degil
        //                                                      --> 1200 artik yildir
        //           2) Yil 100 e bolunmezse 400 e bolunmeli

        Scanner scan = new Scanner(System.in);

        System.out.println("Yil giriniz : ");
        int yil = scan.nextInt();

        if(yil%100 == 0 ){
            if(yil%400 == 0){
                System.out.println(yil + " artik yildir");
            }else{
                System.out.println(yil + " artik yil degildir");
            }
        }else if(yil%100 != 0){
            if(yil%4 == 0){
                System.out.println(yil + " artik yildir");
            }else{
                System.out.println(yil + " artik yil degildir");
            }
        }
        scan.close();

    }
}
