package day29_polymorphism_exception;

public class Polymorphism01 {
    public static void main(String[] args) {
        //Polymorphism => Coklu yapi
        //Overloading ve Overridding ile bir method polymorphism haline getirilirt
        //polymorphism'i overloading ile yaparsaniz "Compile Time Polymorhism" denir
                                     // Diger adi static polymorphism'dir
        //Polymorphism'i overridding ile yaparsaniz "Run Time Polymorphism " denir
                                    // Diger adi dinamic polymorphism'dir.
    }

    public void eat() {
        System.out.println("Ye!");
    }

    //Overloading ile polymorphism
    public void eat(String name) {
        System.out.println(name + "Ye!");
    }

    //Overriding ile polymorphism
    class Yeni extends Polymorphism01 {
        public void eat() {
            System.out.println("Lutfen Ye!");
        }

    }
}