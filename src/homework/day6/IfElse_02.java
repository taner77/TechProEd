package homework.day6;

import java.util.Scanner;

public class IfElse_02 {
    public static void main(String[] args) {
        //Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
        //“Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana “Eşkenar değil” yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Ucgenin uc kenar uzunlugunu giriniz :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a<=0 || b<=0 || c<=0){
            System.out.println("Kenar uzunlugu negatif veya sifir olamaz");
        }else if(a==b && b==c){
            System.out.println("Eskenar Ucgen");
        }else {
            System.out.println("Eskenar degil");
        }
    }
}
