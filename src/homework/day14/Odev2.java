package homework.day14;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
        //biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start value :");
        int start = scan.nextInt();

        System.out.println("Enter finish value :");
        int finish = scan.nextInt();

        if(start<=finish) {
            do {
                if (start % 4 == 0 && start % 6 == 0)
                    System.out.print(start + " ");
                start++;
            } while (start <= finish);

        }else{
            do {
                if (start % 4 == 0 && start % 6 == 0)
                    System.out.print(start + " ");
                start--;
            } while (start >= finish);
        }
        scan.close();
    }
}
