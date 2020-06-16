package homework.day2;
import java.util.Scanner;

public class KareninCevresiAlani {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alan ve sonra bu karenin alan ve
        //çevresini hesaplayıp ekrana yazdıran bir program yazınız.
        //Not: Alan: Boy x En
        //Not: Çevre: 2x (Boy + En)

        Scanner scan = new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz :");

        double a = scan.nextDouble();

        double cevre = a * 4;
        System.out.println("Karenin cevresi : " + cevre);

        double alan = a * a;
        System.out.println("karenin alani : " + alan);



    }
}
