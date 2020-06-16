package homework.day15;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran
        //Program yazınız. Ornegin; CAN ==> C
        //                                  A
        //                                  N

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir kelime veya cumle giriniz");
        String str =scan.nextLine();

        upToDown(str);

        scan.close();

    }

    public static void upToDown (String str){
        for(int i =0; i<=str.length()-1; i++){
            System.out.println(str.charAt(i));
        }

    }

}
