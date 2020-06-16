package day14_do_while_loop;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        //do-while ile while loop'larinin farki

        int num1 = 7;
        while(num1<7){
            System.out.println("while: " +num1);
            num1++;
        }

        int num2 = 7;
        do{
            System.out.println("do while: " + num2);
            num2++;
        }while(num2<7);

    }
}
