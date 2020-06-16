package day14_do_while_loop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<4);


        // 10 ile 20 arasindaki tek tamsayilari do- while ile yapiniz
        int num1 = 11;
        do{
            if(num1%2 == 1)
            System.out.print(num1 + " ");
            num1 ++;

        }while(num1<20);


    }
}
