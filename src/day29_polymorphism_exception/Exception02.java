package day29_polymorphism_exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02{
    //Checked Exception'lari (Compile Time Exception) handle etmek icin iki yol var;
    //birincisi "throws" keyword'unu kullanmak. Bunu kullanirsaniz console'da teknik mesajlar
    //gorursunuz. Bu yuzden cok tercih edilmez.
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("C:/ogrenci.txt");
    }
}

