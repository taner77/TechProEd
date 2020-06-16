package homework.day11;

import java.util.Scanner;

public class Odev3_DIKKAT {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
        //başlayıp bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter start value ");
        int start = scan.nextInt();

        System.out.println("Enter finish value ");
        int finish = scan.nextInt();

        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if(i % 3 == 0)
                    System.out.print(i + " ");
            }
        } else {
            for (int i = start; i >= finish; i--) {
                if(i % 3 == 0)
                    System.out.print(i + " ");
            }
        }
        scan.close();
    }
}


                      // 2. YOL
//        if (start%3 == 1 || start%3 == -2) {
//           start= start+2;
//        }else if(start%3 == 2 || start%3 == -1){
//            start++;
//        }
//        if (start < finish) {
//            for (int i = start; i <= finish; i += 3) {
//                System.out.print(i + " ");
//            }
//        } else {
//            System.out.println("Please enter finish value greater than start value!" );
//        }


         //                3.YOL
//         int tribleStart = start%3==0 ? start : (start+1)%3 == 0 ? start+1 : start+2;
//
//        for (int i = tribleStart ; i>= tribleStart && i<=end;i+=3) {
//
//                System.out.print(i+" ");
//        }
