package day27_constructor_cagirma;

public class Dog extends Mamal{
    public boolean sadik = true;

    public static void main(String[] args) {
        Dog dog = new Dog();

    }
    public void bark(){
        System.out.println("Kopekler havlar");
    }

    Dog(){
        System.out.println("Dog parametresiz constructor ");
    }


}
