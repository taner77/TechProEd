package day03_operators;

import java.util.Scanner;

public class Wrapper03 {
    public static void main(String[] args) {
        // Kullanicidan ad ve soyadini alip ekrana yazdirin
        // Kullanicidan adresini alip ekrana yazdirin
        // Kullanicidan yasini alip ekrana yazdirin
        // Kullaniciya "Turkiye'de yasiyorum. true/false" diye sorup
        //  cevabi "true" veya "false" olarak ekrana yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first and last name:");
        String fullName =  scan.nextLine();
        System.out.println(fullName);

        System.out.println("Enter  your address:");
        String adress = scan.nextLine();
        System.out.println(adress);

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println(age);
        scan.nextLine(); //DUMMY!!!! Scanner da int ten sonra nextLine() almak icin

        System.out.println("enter your country:");
        String country = scan.nextLine();
        System.out.println(country);

//        System.out.println("Do you live in Turkey?");
//        boolean blTr = scan.nextBoolean();
//        System.out.println(blTr);









    }
}
