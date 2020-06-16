package day13_while_loops02;

public class WhileLoop03 {
    public static void main(String[] args) {
        //3 un carpim tablosunu ekrana yazdirin
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num = 1;
        while(num<11){
            System.out.println("3x"+ num + "=" + 3*num +" ");
            num++;
        }

        System.out.println("For Loop ile");
        //  for loop ile
        for(int i =1; i<11; i++){
            System.out.print("3x"+ num + "=" + 3*num +" ");
        }

    }
}
