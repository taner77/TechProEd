package homework.day10;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first  name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter last  name: ");
        String lastName = scan.nextLine();

        System.out.print(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()+" ");
        System.out.println(lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());

    }
}
