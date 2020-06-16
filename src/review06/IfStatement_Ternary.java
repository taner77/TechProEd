package review06;

import java.util.Scanner;

public class IfStatement_Ternary {
    public static void main(String[] args) {
        //Kullanicidan 2 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olarak konsola yazdiriniz
        //int num1
        //int num2

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        int num1 = scan.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int num2 = scan.nextInt();

       if(num1>=num2){
           System.out.println("Buyuk sayi:" + num1);
           System.out.println("Kucuk sayi:" + num2);
       }else{
           System.out.println("Buyuk sayi:" + num2);
           System.out.println("Kucuk sayi:" + num1);
       }

       // Ternary ile;
       String result = num1>=num2 ? ("Buyuk sayi:" + num1+"\n" +"Kucuk sayi:" + num2) :
               ("Buyuk sayi:" + num2+"\n" +"Kucuk sayi:" + num1);
        System.out.println(result);

        scan.close();
    }
}
