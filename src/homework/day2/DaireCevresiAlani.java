package homework.day2;

import java.util.Scanner;

public class DaireCevresiAlani {
    public static void main(String[] args) {
        /*
        Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan
        bir program yazınız. (float kullanınız)
        Not 1: pi sayısı: 3.14159
        Not 2: Alan: 3.14159 x radius x radius
        Not 3: Cevre: 2 x 3.14159 x radius
         */

        float pi = 3.14159f;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricap uzunlugunu giriniz : " );
        float yaricap = input.nextFloat();


        float cevre = 2 * pi * yaricap;
        System.out.println("Dairenin Cevresi : " + cevre );

        float alan = pi * yaricap * yaricap;
        System.out.println("Dairenin Alani : " +  alan);



    }
}
