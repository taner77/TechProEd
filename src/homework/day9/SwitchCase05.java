package homework.day9;

import java.util.Scanner;

public class SwitchCase05 {
    public static void main(String[] args) {
        //Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın.
        //A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
        //Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir harf giriniz");
        char letter = scan.next().charAt(0);

        switch(letter){
            case'A':
            case'D':
            case'B':
                System.out.println("Incorrect answer");
                break;
            case'C':
                System.out.println("Correct answer");
                break;
            default:
                System.out.println("Invalid answer");
        }
        scan.close();

    }
}
