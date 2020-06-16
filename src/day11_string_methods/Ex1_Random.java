package day11_string_methods;

import java.util.Scanner;

public class Ex1_Random {
    public static void main(String[] args) {

//    Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int num = scan.nextInt();
//
//        double fac=1;
//        for (int i = num; i >=1 ; i--) {
//            fac = fac * i;
//        }
//        System.out.println("Factorial = " +fac);
//
//        scan.close();



            Scanner scan = new Scanner(System.in);
            int dogruCevap = 0;

            for (int i = 0; i < 10; i++)  {
                int a = (int)(Math.random() * 10 );
                int b = (int)(Math.random() * 20 );
                System.out.println(a + " + " + b + " = ?");
                int cevap = scan.nextInt();

                if (a + b == cevap) {
                    System.out.println("Dogru");
                    dogruCevap++;
                }
                else {
                    System.out.println("Yanlis! Dogru cevap = "+ (a+b) + " olmaliydi.");
                }

            }
            System.out.println("Toplamda : " + dogruCevap + " Dogru, " + (10-dogruCevap) + " Yanlis");
            System.out.println("Puaniniz : " + (dogruCevap *10 ) + " / 100");

            scan.close();

        }
}
