package day29_polymorphism_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//ikincisi try-catch block kullanmaktir. Bunu kullanirsaniz console'de teknik mesajlar
//yerine kendi yazdiginiz mesajlari  gorebilirsiniz. try-catck kullanmak tercih edilir
 class ExceptionTryCatch{
 public static void main(String[] args) {
     try {
         FileInputStream file = new FileInputStream("C:/ogrenci.txt");
     } catch (FileNotFoundException e) {
         System.out.println("Dosya'nin path'i yanlis veya dosya silinmis olabilir");
     }
 }
}
