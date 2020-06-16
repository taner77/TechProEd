package day21multi_dimensional_array_list;

public class SplitMethodSoru {
    public static void main(String[] args) {
        //Verilen bir cumledeki bosluklar haric character sayisini bulunuz.

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";


        str = str.replace(" ","");
        String ch[] =str.split("");

        System.out.println(ch.length);

        //   2.YOL
        //Bosluk sayisi kelime sayisindan bir azdir
        //Bosluk sayisi = Kelime sayisi - 1
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        String kelime[] =str1.split(" ");
        int boslukSayisi = kelime.length -1;
        System.out.println(boslukSayisi);

        String character[] = str1.split("");
        System.out.println(character.length -boslukSayisi);

    }
}
