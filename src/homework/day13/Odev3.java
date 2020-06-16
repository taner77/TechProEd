package homework.day13;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
        //Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
        //hem for loop hem de while loop kullanarak çözünüz

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

//        for (int i = 1; i <= num; i++) {
//            if(num%i == 0){
//                System.out.print(i + " ");
//            }
//        }

           // while loop ile
        int bolen=1;
        while(bolen<=num){
            if(num%bolen == 0){
                System.out.print(bolen+ " ");
            }
            bolen++;
        }

      scan.close();
    }
}
