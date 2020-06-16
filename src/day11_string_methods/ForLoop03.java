package day11_string_methods;

public class ForLoop03 {
    public static void main(String[] args) {

        //ilk 4 sayma sayisinin carpimini veren for loop yaziniz
        //1*2*3*4 = 4! =24
        int product = 1;
        for (int i = 1; i <=4 ; i++) {
            product = product*i;
        }
        System.out.println("product = " + product);


        // ilk 6 cift sayma sayisinin carpimini veren for loop yaziniz
        //2*4......*12=  = ?
        int product2= 1;
        for(int i=2; i<=13; i+=2) {
            product2 = product2 * i;
        }
        System.out.println("product2 = " + product2);

        //Matematikte 1 er 1 er geri sayim yapip carpmaya faktoryel denir
        //6!=6 x 5 x 4 x 3 x 2 x 1
        //Interview lerde sorarlar

        //9! li hesaplayan programi for loop kullanarak yaziniz.

        //9! =9 x 8 x7 x......x1 = ?(faktoriyel) hesaplayan for loop prog yaziniz
        int product3 =1;
        for (int i = 1; i <=9 ; i++) {
            product3 = product3 * i;
        }
        System.out.println("9! = "+ product3);

    }
}
