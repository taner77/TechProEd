package homework.day13;

public class Odev1 {
    public static void main(String[] args) {
        // 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
        // hem for loop hem de while loop kullanarak çözünüz

        System.out.println("for loop ile");
        for(int i=8; i<=180; i++){
            if(i%5 == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();

        System.out.println("while loop ile");
        int num1=8;
        while(num1<=180){
            if(num1%5 == 0){
                System.out.print(num1 +" ");
            }
            num1++;
        }

    }
}
