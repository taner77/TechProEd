package homework.day13;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
        //biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız
        //hem for loop hem de while loop kullanarak çözünüz

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start value :");
        int start = scan.nextInt();

        System.out.println("Enter finish value :");
        int finish = scan.nextInt();

        if(start<=finish){
            for(int i= start; i<=finish; i++){
                if(i%3==0 && i%5 ==0){
                    System.out.print(i +" ");
                }
            }
        }else{
            for(int i= start; i>=finish; i--){
                if(i%3==0 && i%5 ==0){
                    System.out.print(i +" ");
                }
            }
        }
                   // while loop ile
//        if (start <= finish) {
//            while (start <= finish) {
//                if (start % 3 == 0 && start % 5 == 0) {
//                    System.out.print(start + " ");
//                }
//                start++;
//            }
//        } else {
//            while (start >= finish) {
//                if (start % 3 == 0 && start % 5 == 0) {
//                    System.out.print(start + " ");
//                }
//                start--;
//            }
//        }

        scan.close();
    }
}

