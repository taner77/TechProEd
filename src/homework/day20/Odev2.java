package homework.day20;

import java.util.Arrays;
import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Kullanıcıya kaç elemanlı bir array gireceğini sorun.
        //Kullanıcıdan array’in elemanlarını girmesini isteyin.
        //a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
        //b) Bu arrayın tum elemanlarını tersten yazdırın.
        // Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen array'in eleman sayisini giriniz");
        int length = scan.nextInt();

        int arr[] =new int[length];
        System.out.println("Lutfen array'in elemanlarini giriniz");

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("arr = " +Arrays.toString( arr));



        int reverseArr[] = new int [length];
        for (int i = length-1; i >=0 ; i--) {

                reverseArr[i] = arr[(length-1)-i];
        }
        Arrays.sort(arr);
        if (Arrays.binarySearch(arr, 3)>0) {
            System.out.println("Array'da 3 elemani vardir");
        }else{
            System.out.println("Array'da 3 elemani yoktur");
        }

        System.out.println("reverseArr = " +Arrays.toString( reverseArr));

    }
}
