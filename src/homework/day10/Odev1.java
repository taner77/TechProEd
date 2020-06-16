package homework.day10;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
        //rakamlarını ekrana yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter credit card number");
        String cardNumber = scan.nextLine();

        System.out.println("Third number: " + cardNumber.charAt(2));
        System.out.println("Fourth number: "   + cardNumber.charAt(3));
        System.out.println("Last number: " + cardNumber.charAt(cardNumber.length()-1));

        scan.close();
    }
}
