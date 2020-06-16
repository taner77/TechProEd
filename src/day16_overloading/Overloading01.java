package day16_overloading;

public class Overloading01 {  //Overloading asiri yukleme
    public static void main(String[] args) {
        // Iki sayinin toplamini ekrana yazdiran bir method olusturunuz

        toplama(3,5);
        toplama(8);
        toplama(2.3,5);

    }
    //        OVERLOADING YAPMA YOLLARI
    // 1. Parametrelerin sayisini degistirerek ayni isimli methodlar olusturabilirsiniz
    // 2. Parametre sayisi degistirmeden herhangi bir parametrenin data type'ini
    //    degitirerek de ayni isimli method'lar olusturabilirsiniz

    // NOT: toplama(3,5); cagrisi toplama (int num1, int num2) var oldugu surece
    //      toplama(int num1, int num2) yi kullanir, cunku argument data type ile parametre
    //      data type birebir ortusuyor. Fakat birebir ortusen data type yoksa auto widening'e
    //	    gore Java kullanacagi method'u secer. Auto widening'e gore kullanabilecegi bir method
    //      yoksa Java hata verir.
    // 3. FARKLI data type'indeki parametrelerin yerlerini degistirerk de ayni
    //    isimli methodlar olusturabilirsiniz

    // Method 1
    public static void toplama (int num1, int num2){
        int toplam = num1+num2;
        System.out.println("toplam = " + toplam);
    }

    // Method 2
    public static void toplama (int num1){
        int sum =num1+num1;
        System.out.println("toplam2 = " + sum);
    }

    // Method 3
    public static void toplama (double num1, int num2){
        double toplam = num1+num2;
        System.out.println("toplam3 = " + toplam);
    }

    // Method 4
    public static void toplama (int num2, double num1){
        double toplam = num1+num2;
        System.out.println("toplam4 = " + toplam);
    }


}
