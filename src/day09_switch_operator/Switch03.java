package day09_switch_operator;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        // Kulanic ay ismini girsin
        //Program kacinci ay oldugunu yazsin
        // Buyuk harf kucuk harf hepsi icin calissin
        //Yanlis ay girerse "Gecerli ay ismi giriniz"

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month ");
        String month = scan.next();
        month = month.toLowerCase(); //Kullanicinin girdigi String leri kucuk harfe cevirir

        switch(month){
            case "ocak":
                System.out.println("1. ay");
                break;
            case "subat":
                System.out.println("2. ay");
                break;
            case "mart":
                System.out.println("3. ay");
                break;
            case "nisan":
                System.out.println("4. ay");
                break;
            case "mayis":
                System.out.println("5. ay");
                break;
            case "haziran":
                System.out.println("6. ay");
                break;
            case "temmuz":
                System.out.println("7. ay");
                break;
            case "agustos":
                System.out.println("8. ay");
                break;
            case "eylul":
                System.out.println("9. ay");
                break;
            case "ekim":
                System.out.println("10. ay");
                break;
            case "kasim":
                System.out.println("11. ay");
                break;
            case "aralik":
                System.out.println("12. ay");
                break;
            default:{
                System.out.println("Gecerli ay ismi giriniz");
            }

        }
        scan.close();

    }
}
