package day13_while_loops02;

import java.util.Scanner;

public class ForLoopInterview {
    public static void main(String[] args) {
        //Kullanicidan bir String alin ve String'i ekrana tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle veya kelime gieriniz :");
        String str = scan.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }


        System.out.println();
               // while loop
        int lng =str.length()-1;
        while(lng>=0){
            System.out.print(str.charAt(lng));
            lng--;
        }
     scan.close();
    }
}
