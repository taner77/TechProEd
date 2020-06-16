package homework.day8;

import java.util.Scanner;

public class Ternary06 {
    public static void main(String[] args) {
        //Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl”
        // degilse ekrana “Artık yıl degil” yazdırın
        // Artik yil       1) Yil 100'e bolunurse 400 e de bolunmeli
        //                 2) Yil 100 e bolunmezse 4 e bolunmeli


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        int year = scan.nextInt();

        String result = year%100 ==0 ? (year%400==0 ? "Artik Yil" : "Artik yil degil") :
                                        (year%4 == 0 ? "Artik Yil" : "Artik yil degil");
        System.out.println(result);

        scan.close();
    }
}
