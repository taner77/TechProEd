package homework.day20;

import java.util.Arrays;
import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in kac elemanli olmasini istersiniz ?");
        int length = scan.nextInt();
        int arr1[] = new int[length];
        System.out.println("Array elemanlarindan en az biri 3 olmalidir.");
        for (int i = 0; i < length; i++) {
            System.out.println("Array'in " + (i + 1) + ". elemanini giriniz:");
            arr1[i] = scan.nextInt();
        }

        System.out.println("Array'iniz " + Arrays.toString(arr1));
        int arr2[] = new int[length];
        for (int i = length-1; i >= 0; i--) {
            arr2[i] = arr1[(length-1) - i];
        }
        Arrays.sort(arr1);
        if (Arrays.binarySearch(arr1, 3) < 0) {
            System.out.println("Array'de 3 bulunmuyor!");
        }


        System.out.println("Girdiginiz array'in tersi" + Arrays.toString(arr2));
    }
}
