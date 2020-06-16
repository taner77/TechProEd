package homework.day9;

import java.util.Scanner;

public class SwitchCase04 {
    public static void main(String[] args) {
        //Kullanıcıdan ay ismi alın eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
        //Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
        //Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a month");
        String month = scan.next();
        month = month.toLowerCase();

        switch(month){
            case"january":
                System.out.println("It is 31 days.");
                break;
            case"february":
                System.out.println("It is 28 or 29 days.");
                break;
            case"march":
                System.out.println("It is 31 days.");
                break;
            case"april":
                System.out.println("It is 30 days.");
                break;
            case"may":
                System.out.println("It is 31 days.");
                break;
            case"june":
                System.out.println("It is 30 days.");
                break;
            case"july":
                System.out.println("It is 31 days.");
                break;
            case"august":
                System.out.println("It is 31 days.");
                break;
            case"september":
                System.out.println("It is 30 days.");
                break;
            case"october":
                System.out.println("It is 31 days.");
                break;
            case"november":
                System.out.println("It is 30 days.");
                break;
            case"december":
                System.out.println("It is 31 days.");
                break;
            default:
                System.out.println("Invalid month");
        }
     scan.close();

    }
}
