package review05;

import java.util.Scanner;

public class StringManupulation {
    public static void main(String[] args) {
        //Kullanicidan bir e-mail addressi isteyiniz eger email id de "hotmail" varsa
        //         * "gmail" ile degistiriniz e.g: mesutyaman@hotmail.com ==> mesutyaman@gmail.com


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir mail adresi giriniz :");
        String email = scan.nextLine();

        if(email.contains("hotmail")){
            email = email.replace("hotmail","gmail");
        }
        System.out.println(email);
    }
}
