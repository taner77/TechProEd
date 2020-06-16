package homework.day20;

import java.util.Arrays;
import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //Kullanıcıya kaç elemanlı bir array gireceğini sorun.
        //Kullanıcıdan array’in elemanlarını girmesini isteyin.
        //a) Bu array’in tum elemanlarını ekrana yazdırın.
        //b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.
        // Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın.


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen array'in eleman sayisini giriniz");
        int length = scan.nextInt();

        int arr[] =new int[length];
        System.out.println("Lutfen array'in elemanlarini giriniz");

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Degisimden once: " + Arrays.toString(arr));

        int arr2[] = new int[length];
        for (int i = 0; i <length-1 ; i++) {
            arr2[i+1] = arr[i];
        }
        arr2[0] = arr[length-1];
        System.out.println("Degisimden sonra: "+ Arrays.toString(arr2));

        scan.close();
    }
}
