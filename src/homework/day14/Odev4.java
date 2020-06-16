package homework.day14;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        //Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın.
        //Eşit değilse tekrar iki sayı girmesini söyleyin.

        Scanner scan =new Scanner(System.in);

        int num1;
        int num2;
        do{
            System.out.println("2 tane pozitif tamsayi giriniz:");
            num1 =scan.nextInt();
            num2 =scan.nextInt();
            if(num1>0 && num2>0 && num1 == num2){
                System.out.println("Kare olusturdunuz ");
            }else{
                System.out.println("Tekrar deneyiniz");
            }

        }while(num1<=0 || num2<=0 || (num1 != num2));

     scan.close();
    }
}
