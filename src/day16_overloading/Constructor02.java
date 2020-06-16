package day16_overloading;

public class Constructor02 {
    public static void main(String[] args) {

        // 1) Baska bir class'tan urettigimiz object'i urettigimiz class'ta kulanabiliriz
        // 2) Object'in ozelliklerini degistirebiliriz, fakat bu degisim sadece o object ile
        //    sinirli kalir. Yeni uretilecek olan object'ler bu degisimlerden etkilenmez.
        // 3) Eger uretilecek her object'in degisime ugramis olmasini istiyorsaniz class'daki ozellikleri
        //    degistirmelisiniz.


        Constructor01 yeniAraba = new Constructor01();
        System.out.println("New price = "+ (yeniAraba.price + 1000));
        System.out.println("New year = "+ (yeniAraba.year + 1));
        System.out.println("New make = "+ yeniAraba.make.replace("Honda","Toyota"));
        System.out.println("New type = "+ yeniAraba.type.replace("Civic","Camry"));
    }
}
