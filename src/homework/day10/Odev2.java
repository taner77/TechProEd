package homework.day10;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first  name: ");
        String firstN = scan.nextLine();
        int lenghtFirst= firstN.length();

        System.out.println("Enter your first  name: ");
        String lastN = scan.nextLine();
        int lenghtLast= firstN.length();

        System.out.println("Total letter = " + lenghtFirst + lenghtLast);

    }
}
