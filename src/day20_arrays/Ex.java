package day20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli array olusturmsk istiyorsunuz?");
        int length = scan.nextInt();

        int arr[] = new int[length];

        System.out.println("Array elemanlarini giriniz");
        for(int i = 0; i<length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));



    }
}
