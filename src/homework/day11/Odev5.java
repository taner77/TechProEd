package homework.day11;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
        //biten tüm tamsayıların çarpımını ekrana yazdırın.

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter start value ");
        int start = scan.nextInt();

        System.out.println("Enter finish value ");
        int finish = scan.nextInt();

        int product = 1;
        for (int i = start; i <= finish ; i++) {
            product = product*i;
        }
        System.out.println("product = " + product);

        scan.close();
    }
}
