package homework.day14;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //Kullanıcıya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi aynı ise
        //ekrana “Simetrik” yazdırın. Aynı değilse tekrar bir String girmesini isteyin.

        Scanner scan =new Scanner(System.in);

        String str="";
        char ch1;
        char ch2;
        do {
            System.out.println("Bir kelime veya cumle giriniz :");
             str = scan.nextLine();
             ch1 = str.charAt(0);
             ch2 = str.charAt(str.length()-1);

        }while(ch1 != ch2);
            System.out.println("Simetrik");

        scan.close();
    }
}
