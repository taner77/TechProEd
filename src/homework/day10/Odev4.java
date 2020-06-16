package homework.day10;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        //Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise
        //ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Where do you live? : ");
        String answer = scan.nextLine();
        answer= answer.toLowerCase();

        switch (answer){
            case "amerika":
                System.out.println("USA");
                break;
            case "ingiltere":
                System.out.println("UK");
                break;
            case "almanya":
                System.out.println("DE");
                break;
            default:
                System.out.println("NA");

        }
        scan.close();
    }
}
