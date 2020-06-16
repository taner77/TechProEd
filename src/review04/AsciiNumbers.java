package review04;

public class AsciiNumbers {
    public static void main(String[] args) {
        //Bir loop (dongu) olusturun ve orada sirasiyla alfabedeki harfleri kucuk harf olarak konsola yazdiriniz
        // ve her harfin karsisina ascii numaralarini yazdiriniz
        //a => 97

//        for (char i = 'a'; i <='z' ; i++) {
//            System.out.println(i + " => " + (int) i);
//        }


                // VEYA
        for (int i = 'a'; i <='z' ; i++) {
            System.out.println((char)i + " => " +i);
        }
    }
}
