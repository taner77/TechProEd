package homework.day6;

import java.util.Scanner;

public class IfElseIf_01 {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
        //0 ise ekrana “Nötr” yazdırın. 0 dan büyük ise ekrana “Pozitif” yazdırın.


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        if(num>0){
            System.out.println("Positive");
        }else  if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
