package review06;

import java.util.Arrays;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        //Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olanlarini konsola yazdiriniz
        //int num1
        //int num2
        //int num3

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        int num1 = scan.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int num2 = scan.nextInt();

        System.out.println("Ucuncu sayiyi giriniz");
        int num3 = scan.nextInt();

        int arr[] = {num1,num2,num3};
        Arrays.sort(arr);
        System.out.println("En buyuk sayi:"+ arr[2]);
        System.out.println("En kucuk sayi:"+ arr[0]);

//        if(num1 >= num2  && num1 >= num3) {
//            System.out.println(num1+" en buyuk sayidir");
//
//            if(num2 >= num3) {
//                System.out.println(num3+" en kucuk sayidir");
//            }else {
//                System.out.println(num2+" en kucuk sayidir");
//            }
//        }else if(num2 >= num1 && num2 >= num3) {
//
//            System.out.println(num2 +" en buyuk sayidir");
//
//            if(num1 >= num3) {
//                System.out.println(num3+" en kucuk sayidir");
//            }else {
//                System.out.println(num1 +" en kucuk sayidir");
//            }
//
//        }
        scan.close();
    }
}
