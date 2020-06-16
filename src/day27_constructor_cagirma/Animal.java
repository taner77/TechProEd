package day27_constructor_cagirma;

public class Animal {
    public int age;
    protected String name;


    public static void main(String[] args) {
        Animal animal = new Animal();

    }

    public void move(){
        System.out.println("hareket edebilir");
    }
    public void eat (){
        System.out.println("yemek yer");
    }

    Animal(){
        System.out.println("Animal parametresiz constructor");
    }

}
