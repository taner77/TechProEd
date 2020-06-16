package homework.day4;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers:");

            double n1 = scan.nextDouble();
            double n2 = scan.nextDouble();

            System.out.println("Before changed");
            System.out.println("n1 : "+ n1);
            System.out.println("n2 : " +n2);

            double temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("After changed");
            System.out.println("n1 : " + n1);
            System.out.println("n2 :" +n2);

            // OR
//            n1 = n1 + n2;
//            n2 = n1 - n2;
//            n1 = n1 - n2;





    }
}
