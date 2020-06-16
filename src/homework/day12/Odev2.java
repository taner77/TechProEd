package homework.day12;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
        //biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start value :");
        int start = scan.nextInt();

        System.out.println("Enter finish value :");
        int finish = scan.nextInt();


        if (start <= finish) {

            while (start <= finish) {
                System.out.print(start + " ");
                start++;
            }
        } else {

            while (start >= finish) {
                System.out.print(start + " ");
                start--;
            }
        }
        scan.close();
    }
}