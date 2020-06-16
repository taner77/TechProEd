package homework.day6;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” yazdırın.
        //3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz:");
        int num = scan.nextInt();

        if(num%3 == 0){
            System.out.println(num +" sayisi 3'un katidir");
        }else{
            System.out.println(num +" sayisi 3'un kati degildir");
        }


    }
}
