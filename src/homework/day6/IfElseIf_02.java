package homework.day6;

import java.util.Scanner;

public class IfElseIf_02 {
    public static void main(String[] args) {
        //Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
        //“Eşkenar üçgen” yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”
        //yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        if(a<=0 || b<=0 || c<0){
            System.out.println("Kenar uzunluklari negatif veya sifir olamaz ");
        }else if(a==b && b==c){
            System.out.println("Eskenar ucgen");
        }else if(a==b || a==c ||b==c){
            System.out.println("Ikizkenar ucgen");
        }else{
            System.out.println("Cesitkenar ucgen");
        }

    }
}
