package homework.day11;

import java.util.Scanner;

public class Odev2_DIKKAT {
    public static void main(String[] args) {
        //  Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
        // başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start value ");
        int start = scan.nextInt();

        System.out.println("Enter finish value ");
        int finish = scan.nextInt();

        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");

            }
        }else {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        }

              // 2.YOL
//        if (start % 2 != 0) {
//            start++;
//        }
//
//        if (start < finish) {
//            for (int i = start; i <= finish; i += 2) {
//                System.out.print(i + " ");
//            }
//        } else {
//            System.out.println("Please enter finish value greater than start value!" );
//
        scan.close();
    }
}