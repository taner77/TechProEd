package homework.day14;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu
        //tüm sayıların toplamını yazdırınız.
        //Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın

        Scanner scan = new Scanner(System.in);

        int num;
        int sum = 0;

        do{
            System.out.println("Please enter a number:");
             num =scan.nextInt();
             sum += num;
        }while(num!=0);
        System.out.println("sum: " + sum );

        scan.close();
    }
}
