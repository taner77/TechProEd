package review01;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        //Kullanicidan alinan uc sayinin toplamini bulunuz. int kulaniniz

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = input.nextInt();

        System.out.println("Enter second number : ");
        int n2 = input.nextInt();

        System.out.println("Enter third number : ");
        int n3 = input.nextInt();

        int sum = n1 +n2 + n3;
        System.out.println("Sum : " + sum);
    }
}
