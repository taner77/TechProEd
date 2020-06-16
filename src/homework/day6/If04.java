package homework.day6;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
        //Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.

        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen birinci sayiyi giriniz");
        int num1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2 = scan.nextInt();

        if(num1==0 || num2==0) {
            System.out.println("Sayilar sifirdan farkli olmali");
        }else if((num1>0 && num2>0) || (num1<0 && num2<0)){
            System.out.println("Sayilar ayni isaretli");
        }else{
            System.out.println("Sayilar farkli isaretli");
        }


    }
}
