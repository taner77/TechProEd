package day21multi_dimensional_array_list;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        // split() methodunu kullandiginizda mutlaka bir array olusturmalisiniz
        String str = "Ali Can okula basladi";
        String kelime[] = str.split(" ");

        System.out.println(Arrays.toString(kelime));
        System.out.println("Kelime sayisi = " + kelime.length);


        String str2 = "Kahramanmaras iyi mi?"; // Kac harfli?
        String harf[] = str2.split("");
        System.out.println(Arrays.toString(harf));
        System.out.println("Harf sayisi = " +harf.length); //21  java bosluklari da character olarak sayar
    }
}
