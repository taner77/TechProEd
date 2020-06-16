package day06_ifstatement;

import java.util.Scanner;

public class IfElseStatment01 {
    public static void main(String[] args) {
        //Kullanicidan password girmesini isteyin
        //password dogru ise ekrana "Password dogru" yazdirin
        //password yanlis ise ekrana "Password yanlis tekrar deneyin" yazdirin
        //Dogru password = Java2020

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password = input.next();

        //String'lerin esitligini kontrol ederken
        //asla "==" sembolu kullanmayin. Onun yerine
        //"equals()" kullanin

        //"==" String'in degerini ve adresini kontrol eder
        //"equals()" ise sadece degerleri kontrol eder

        if(password.equals("Java2020")){
            System.out.println("Password is true");
        }else {
            System.out.println("Password is false. Please try again.");
        }


    }
}
