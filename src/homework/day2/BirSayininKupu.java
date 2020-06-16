package homework.day2;
import java.util.Scanner;
public class BirSayininKupu {
    public static void main(String[] args) {
       // Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.
               // Not: a’ nın küpü: a x a x a

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
         double sayi = input.nextDouble();
         double kup = sayi * sayi * sayi;

        System.out.println("Sayinin kupu : " +kup);





    }
}
