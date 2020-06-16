package homework.day11;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//        System.out.println("Baslangic sayisi giriniz");
//        int num1 = scan.nextInt();
//        System.out.println("Bitis sayisi giriniz");
//        int num2 = scan.nextInt();
//
//        int result = num1%3==0 ? num1 : (num1%3==1? num1+2 : num1+1);
//        System.out.println();
//        for(int i= result; result<=num2; result+=3){
//
//            System.out.print(result+" ");
//        }



//        System.out.println("Enter the first value");
//        int num1 = scan.nextInt();
//        System.out.println("Enter the second value");
//        int num2 = scan.nextInt();
//
//
//        for (int i=num1;i<=num2;i++) {
//            if (i%3==0)
//                System.out.print(i + " ");
//        }
//        scan.close();



        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen baslangic degerinizi giriniz: ");
        int start = scanner.nextInt();

        System.out.print("Lütfen bitis degerinizi giriniz: ");
        int end = scanner.nextInt();

        int tribleStart = start%3==0 ? start : (start+1)%3 == 0 ? start+1 : start+2;

        for (int i = tribleStart ; i>= tribleStart && i<=end;i+=3) {

            System.out.print(i+" ");
        }
        scanner.close();

        System.out.println("Tamsayı başlangıç değerini giriniz=");
        int basNum=scan.nextInt();

        System.out.println("Tamsayı bitiş değerini giriniz= ");
        int bitNum=scan.nextInt();

        if (basNum%3==0) {
            for (int i=basNum; i<=bitNum; i=i+3) {
                System.out.print(i+" ");
            }
        } else if (basNum%3==1) {
            for (int i=basNum+2; i<=bitNum; i=i+3) {
                System.out.print(i+" ");
            }
        } else if (basNum%3==2) {
            for (int i=basNum+1; i<=bitNum; i=i+3) {
                System.out.print(i+" ");
            }
        }

    }
}
