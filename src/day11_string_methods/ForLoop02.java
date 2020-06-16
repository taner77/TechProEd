package day11_string_methods;

public class ForLoop02 {
    public static void main(String[] args) {
        //100 den kucuk 3 un kati olan sayma sayilarini ekrana yazdiran for loop
        for (int i = 3; i < 100; i+=3) {
            System.out.print(i +" ");
        }


        System.out.println();

        //ilk 5 sayma sayisinin toplamini  for loop ile yapiniz

        int sum =0;
        for (int i = 1; i <=5 ; i++) {
           sum = sum +i;
        }
        System.out.println("sum = " + sum); // sadece son adimi gormek isterseniz
                                // yazdirma islemini for loop un disinda yapiniz


        //10 dan buyuk ilk uc sayma  sayisinin  toplamini for loop ile bulunuz
        int sum1 = 0;
        for (int i = 11; i <14 ; i++) {
            sum1 =sum1 +i;
        }
        System.out.println("sum1 = " + sum1);


        //20 den buyuk ilk 5 sayma sayisinin toplamini veren for loop yaziniz
        int  sum3 =0;
        for (int i = 21; i <26 ; i++) {
          sum3 =sum3 + i;
        }
        System.out.println("sum3 = " + sum3);
        
        //ilk 50 sayma sayisinin toplamini vere for loop yaziniz
        int sum4=0;
        for (int i = 1; i <=50 ; i++) {
            sum4 =sum4 + i;
        }
        System.out.println("sum4 = " + sum4);

        // 5 ile bolunebilen 100 den kucuk sayma sayilarinin toplamini veren for loop yaziniz
        int sum5 =0;
        for (int i = 5; i <100 ; i+=5) {
            sum5 = sum5 + i;
        }
        System.out.println("sum5 = " + sum5);

    }
}
