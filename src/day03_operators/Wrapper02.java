package day03_operators;

import java.util.Scanner;

public class Wrapper02 {
    public static void main(String[] args) {
        // Kullanicidan ilk ismini alin ekrana yazdirin
        // Kullanicidan soy ismini alin ekrana yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name :");
        String firstName =scan.nextLine();

        System.out.println("Enter last name :");
        String lastName = scan.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);

    }
}
