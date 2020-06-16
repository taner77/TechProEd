package day08_ternary_operator;

import java.util.Scanner;

public class TernaryOperator01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi pozitif ise ekrana "Pozitif veya sifir" yaziniz
        //Sayi negatif ise ekrana "Negatif" yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        double num = scan.nextDouble();

        if(num>=0) {
            System.out.println("Pozitif veya sifir");
        }else{
            System.out.println("Negatif");
        }

                                            // Ternary Operator (if Else)
                    //Condition soru isareti   Condition dogru ise   iki nokta ust uste  Condition yanlis ise
        String sonuc = (num>=0)       ?          "Pozitif veya sifir"        :            "Negatif";
        System.out.println(sonuc);

        scan.close();


    }
}
