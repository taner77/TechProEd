package day07_nestedIf;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin
        //Bu sayi pozitif veya 0 ise 9 dan buyuk mu diye kontrol edin, 9 dan buyuk ise ekrana "Sayi" yazdirin
        // 9 dan kucuk esit ve 0'dan buyuk esit ise ekrana “Rakam” yazdirin
		// Bu sayi negatif ise ekrana “Sayi” yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz:");
        int num = scan.nextInt();

        if(num>=0){
            if(num>9){
                System.out.println(num + " sayidir");
            }else {
                System.out.println(num + " rakamdir");
            }

        }else{
            System.out.println(num + " sayidir");
        }

      scan.close(); //Scanner class'ini kullandiktan sonra en altta main method'un icinde Scanner class'ini kapatiniz.


    }
}
