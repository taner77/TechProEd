package day11_string_methods;

public class StringMethod03 {
    public static void main(String[] args) {

        // concat() method concatenation yapmanin yani iki Stringi birlestirmenin diger yoludur

        String str1 = "Ali";
        String str2 = "Veli";

        System.out.println(str1 + str2); //AliVeli
        System.out.println(str1.concat(str2)); //AliVeli

        System.out.println(str1.concat(str2).concat(str1));//AliVeliAli concat() i istediginiz kadar
        //pespese kullanabilirsiniz
        System.out.println(str1.concat("==>").concat(str2));//Ali==>Veli




        // replace() methodu varolan bir characterin butun gorunumlerin yerine baska character yazmaya yarar

                  // 1. versiyon
        String str3 = "ata";
        System.out.println(str3.replace("t","n")); //ana
        System.out.println(str3.replace("a","o")); //oto

        System.out.println(str3.replace("","/"));//  /a/t/a/
        System.out.println(str3.replace("t",""));//  aa olur yani t'yi siler. Biz bu yontemi
                                     // bir characteri String'den silmek icin kullaniriz

        System.out.println(str3.replace("a",""));  //t
        System.out.println(str3.replace("at","Mustaf"));  //Mustafa


        // replaceFirst() methodu degirtirmek istedigimiz characterin sadece ilk gorunumu degistirir
        String str4 = "karakartal";
        System.out.println(str4.replaceFirst("k","K")); // Karakartal
        System.out.println(str4.replaceFirst("a","e")); // kerakartal
        System.out.println(str4.replaceFirst("ka","A")); // Arakartal


        //Soru
        String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
        System.out.println(text.replace("Ali", "Veli"));

        //replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar.replace() methodunda isterseniz
        //tek harfli karakterler icin tek tirnak kullanabilirsiniz. Fakat replaceAll() da tek tirnak kullanilamaz.

    }

}
