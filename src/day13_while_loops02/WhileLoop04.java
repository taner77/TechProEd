package day13_while_loops02;

import java.util.Scanner;

public class WhileLoop04 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir sayinin carpim tablosunu yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.print("Carpim tablosunu gormek istediginiz bir sayi giriniz : ");
        int num = scan.nextInt();

        System.out.println("for loop ile");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num + "x" + i + "=" + num*i );
        }

        System.out.println(" while loop ile");
        int num1 =1;
        while(num1<11){
            System.out.println(num + "x" + num1 + "=" + num*num1 );
            num1++;
        }
    }
}
