package homework.day6;

import java.util.Scanner;

public class IfElseIf_04 {
    public static void main(String[] args) {
        //Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın.
        //Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın.
        //Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yili giriniz : ");
        int yil = scan.nextInt();

        if(yil%1000 == 0){
            System.out.println("Milenyum");
        }else if(yil%100 == 0) {
            System.out.println("Yuzyil");
        }else if(yil%10 == 0){
            System.out.println("Onyil");
        }

}
}
