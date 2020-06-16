package day05_operators;

public class Dicrement01 {
    public static void main(String[] args) {
        // int data vir varaible olusturun
        // Bu variable'in degerini 3 yontemi de kullanarak 1 azaltin

        int num1 = 12;

        // uzun yol
        num1 = num1 - 1;
        System.out.println(num1); //11

        //kisa yol
        num1-=1;
        System.out.println(num1); //10

        // en kisa yol
        num1--;
        System.out.println(num1); //9

    }
}
