package homework.day11;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
        //biten tüm tamsayıların toplamını ekrana yazdırın.

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter start value ");
        int start = scan.nextInt();

        System.out.println("Enter finish value ");
        int finish = scan.nextInt();


        int sum = 0;
        for (int i =start; i <=finish ; i++) {
           sum = sum +i;
        }
        System.out.println("sum = " + sum);

    }
}
