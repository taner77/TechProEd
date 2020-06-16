package day14_do_while_loop;

import java.util.Scanner;

public class DoWhileLoop05 {
    public static void main(String[] args) {
        // Kullanicidan ismini alin
        //Ilk harf buyukse "Dogru giris yaptiniz"
        //Ilk harf kucukse "Ilk harfi buyuk harf olarak giriniz"


        Scanner scan = new Scanner(System.in);
        String isim = "";

        do {
            System.out.println("Ilk isminizi giriniz");
            isim = scan.nextLine();
            if(isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
                System.out.println("Dogru giris yaptiniz");
            }else{
                System.out.println("Ilk harfi buyuk harf oalrak giriniz");
            }

        }while(!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));

        scan.close();
    }
}