package homework.day7;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        //Kullanıcıdan cinsiyetini  ve yasini girmesini isteyin.
        //Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
        //Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
        //Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
        //Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender: ");
        String gender = scan.next();

        System.out.println("Please enter your your age: ");
        int age = scan.nextInt();

        if (gender.equalsIgnoreCase("male")) {
            if (age < 18) {
                System.out.println("Boy");
            } else {
                System.out.println("Man");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age < 18) {
                System.out.println("Girl");
            } else {
                System.out.println("Woman");
            }
        }
        scan.close();
    }
}