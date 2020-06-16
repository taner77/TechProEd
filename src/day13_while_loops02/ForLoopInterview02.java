package day13_while_loops02;

import java.util.Scanner;

public class ForLoopInterview02 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin
        // Bu sayinin tersinin 2 fazlasini ekrana yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        String num = scan.next();

        String reverse = "";
        for (int i = num.length()-1; i >=0 ; i--) {
            reverse = reverse + num.charAt(i) + "";  // char'i String cevirmek icin sonuna + "" ekleyebilirsiniz

        }
      //  System.out.print(reverse);

       int result = Integer.valueOf(reverse) ;
       result +=2;
        System.out.println(result);






    }
}
