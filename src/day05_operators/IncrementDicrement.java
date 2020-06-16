package day05_operators;

public class IncrementDicrement {
    public static void main(String[] args) {
        // int data type'inda bir variable olusturun
        // Carpma ve bolme kullanarak degerini artirin ve azaltin

        int num1 = 12;

         // uzun yol
        num1 = num1 * 3;
        System.out.println(num1); //36

        // kisa yol
        num1*=3;
        System.out.println(num1); //108

        //Uzun Yol ile bolme yaparak decrement
        num1 = num1 / 9; //108/9=12
        System.out.println(num1);//12

        //Kisa Yol
        num1/=2; // 12/2=6
        System.out.println(num1);
    }
}
