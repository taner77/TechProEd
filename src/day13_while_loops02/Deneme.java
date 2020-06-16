package day13_while_loops02;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

            // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
            // or whatever is there if the string is less than length 3. Return n copies of the front;

            Scanner scan =  new Scanner (System.in);
            System.out.println("enter a word:");
            String word = scan.nextLine();
            System.out.println("enter a postive number:");
            int number = scan.nextInt();
            int lnt = word.length();

            int i = 1;
            if (lnt<=2) {
                while (i<=number) {
                    System.out.println(i + ". " + word);
                    i++;
                }
            } else {
                while (i<=number ) {
                    System.out.println( i + ". " + word.substring(0, 3) );
                    i++;
                }
            }


        }
}
