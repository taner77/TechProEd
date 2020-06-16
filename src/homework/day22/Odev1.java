package homework.day22;

public class Odev1 {
    public static void main(String[] args) {
        //Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını
        //For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.

        int arr[] ={1,2,3,4,5,6};

        int product =1;
        for(int w : arr){
            product *= w;

        }
        System.out.println(product);
    }
}
