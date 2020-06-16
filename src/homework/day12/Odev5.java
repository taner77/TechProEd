package homework.day12;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        // Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
        // biten tüm tamsayıların çarpımını ekrana yazdırın
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start value :");
        int start = scan.nextInt();

        System.out.println("Enter finish value :");
        int finish = scan.nextInt();

        if (start <= finish) {

            int product = 1;
            while (start <= finish) {
                product = product * start;
                start++;
            }
            System.out.println("product = " + product);

        }else{

            int product = 1;
            while (start >= finish) {
                product = product * start;
                start--;
            }
            System.out.println("product = " + product);

        }
        scan.close();
    }
}