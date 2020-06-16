package review01;

import java.util.Scanner;

public class Dikdortgen {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Dikdortgenin en uzunlugunu giriniz: ");
        double en = scan.nextDouble();

        System.out.println("Dikdortgenin boy uzunlugunu giriniz: ");
        double boy = scan.nextDouble();

        double cevre = 2 * (en + boy);
        System.out.println("Cevre = " + cevre);

        double alan = en * boy;
        System.out.println("Alan = " + alan);



    }
}
