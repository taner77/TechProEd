package day17_constructors;

public class Constructor02 {

    // buyume() methodu bu class'ta degil Constructor01 class'inda
    // O yuzden Java kullanmama musade etmiyor
    // Eger siz baska bir class'taki methodu kullanmak istiyorsaniz bir tane object
    //  olusturup o object sayesinde istediginiz methodu kullanabilirsiniz

    public static void main(String[] args) {
       Constructor01 obj1 = new Constructor01();

        // buyume() methodu static oldugundan java object kullanarak buyume()
        // methodunu cagirmamizi istemez ve altini sari renkte cizer
       obj1.buyume(35);
       Constructor01.buyume(45);//46


        // isimDegistir() methodu static oldugundan java object kullanarak isimDegirtir()
        // methodunu cagirmamizi istemez ve altini sari renkte cizer
       obj1.isimDegistir("Kemal Can");
       Constructor01.isimDegistir("Mehaba Naci");
        System.out.println(obj1.isim);
        System.out.println(obj1.yas);



        // Bir variable veya method static olarak olusturulmussa o variable veya methods
        // object olusturmadan sadece class ismini kullanarak ulasabilirsiniz
        System.out.println(Constructor03.ad); // Ali Can
        System.out.println(Constructor03.kilo); //33
        Constructor03.artirma(45); //46
        Constructor03.degistirme("Ayhan Isik"); //Ayhan Isik


    }
}
