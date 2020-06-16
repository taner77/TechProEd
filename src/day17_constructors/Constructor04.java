package day17_constructors;

public class Constructor04 {
    int num1 = 12;
    static int num2 = 22;


    public static void main(String[] args) {
        // static methodlarin icinde sadece static elemanlar kullanilabilir
        // num1 static olmadigindan main methotun icinde kullanilmaz
        // num2 static oldugundan main method icinde kullanmamiz problem olmuyor

     //  num1++;  // commenti kaldirirsak compile time error aliriz
        num2++;

    }
}
