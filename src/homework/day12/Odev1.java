package homework.day12;

public class Odev1 {
    public static void main(String[] args) {
        //While loop kullanarak 3 den 13 e kadar tum tek tamsayıları ekrana yazdırınız.

        int num = 3;
        while(num<14){
            if(num%2 == 1){
                System.out.print(num + " ");
            }
            num++;
        }

    }
}
