package review02;

import java.util.Random;

public class RandomSayi_DIKKAT {
    public static void main(String[] args) {

      //0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?
      //random sayi= 185  toplamları = 14

                   // RANDOM SAYI 1.YOL
        int randomSayi = (int) (Math.random()*1000);//0 ile 1000 arasi sayi
       // int randomSayi = (int) (Math.random()*10) + 10;// 10 ile 20 arsi degerler

        System.out.println("randomSayi = " +randomSayi);

                   //RANDOM SAYI 2.YOL
//        Random random = new Random();
//        int randomSayi = random.nextInt(1000);
//        System.out.println("randomSayi = " +randomSayi);


        int birler = randomSayi%10;
        int onlar = (randomSayi /10)%10;
        int yuzler = randomSayi/100;

        System.out.println("Rakamlar toplami = " + (birler + onlar+ yuzler));


    }
}
