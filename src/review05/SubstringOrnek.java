package review05;

import java.util.Scanner;

public class SubstringOrnek {
    public static void main(String[] args) {
        /*
        Kullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
        e.g:
        mehmet ==>   mehahmetmet
        ahmet
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk ismi giriniz");
        String name1 =scan.nextLine();
        System.out.println("Lutfen ikinci ismi giriniz");
        String name2 =scan.nextLine();
        int lg=name1.length();
        if(lg%2==0){
            name1= name1.substring(0,(lg/2)) + name2+ name1.substring((lg/2));
            System.out.println(name1);
        }else{
            System.out.println("ilk ismin uzunlugu cift sayi degil");
        }


    }
}
