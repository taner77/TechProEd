package day13_while_loops02;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Ilk 5 sayma sayisinin carpiminin sonucunu ekrana yazdirin

        int num = 1;
        int product = 1;
        while (num<=5){
            product = product* num;
            num++;
        }
        System.out.println("product = " + product);

    }
}
