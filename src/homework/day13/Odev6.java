package homework.day13;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
        //indexini ekrana yazdırın. “a” harfi yoksa ekrana “a harfi yok” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime veya cumle giriniz:");
        String str = scan.nextLine();

        if(str.contains("a")){
            System.out.println("Ilk a'nin indexi : " + str.indexOf('a'));

        }else{
            System.out.println("\"a\" harfi yoktur");
        }
     scan.close();



    }
}
