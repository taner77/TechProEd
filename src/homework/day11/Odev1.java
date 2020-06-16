package homework.day11;

import java.util.Scanner;

public class Odev1 {

        public static void main(String[] args) {
            //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
            //biten tüm tamsayıları ekrana yazdırın.

            Scanner scan =new Scanner(System.in);
            System.out.println("Enter start value ");
            int start = scan.nextInt();

            System.out.println("Enter finish value ");
            int finish = scan.nextInt();

            for(int i = start; i<=finish; i++){
                System.out.print(i +" ");
            }
            scan.close();
        }
    }


