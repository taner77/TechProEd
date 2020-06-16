package day14_do_while_loop;

import java.util.Scanner;

public class DoWhileLoop04 {
    public static void main(String[] args) {
        // Kullanicidan bir String alin
        //Bu String'in indexi cift sayi characterlerini ekrana yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.println("Bir kelime veya cumle giriniz :");
        String str =scan.nextLine();

        int length = str.length();
        int i = 0;
        do{
            if(i%2 == 0){
                System.out.print(str.charAt(i) + " ");
            }
            i++;
        }while(i<length);



    }
}
