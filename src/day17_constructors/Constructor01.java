package day17_constructors;

public class Constructor01 {
    String isim = "Ali Can";
    int yas = 33;



    // Method ile main method ayni class'ta ise methodu sadece ismini yazarak kullanabilirsiniz
    public static void main(String[] args) {
        buyume(33);
        isimDegistir("Ayse Han");
    }

    public static void buyume (int yas){
        yas++;
        System.out.println(yas);
    }


    public static void isimDegistir(String isim){
        System.out.println(isim);

    }


}
