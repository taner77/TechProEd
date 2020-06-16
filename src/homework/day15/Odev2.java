package homework.day15;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana
        //“Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int num2 = scan.nextInt();

        siralama(num1, num2);
        scan.close();
    }

    public static void siralama(int num1, int num2){
       String result= (num1 == num2) ? ("Sayilar esit") :(num1>num2) ? ("Birinci sayi buyuk") : ("Ikinci sayi buyuk");
        System.out.println(result);
    }

}

