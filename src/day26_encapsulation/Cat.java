package day26_encapsulation;

public class Cat extends Mamal{
    public boolean clean = true;


    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.age);//0
        System.out.println(cat.name);//null
        System.out.println(cat.dogum);//true
        System.out.println(cat.clean);//true

        cat.meow();//kediler miyavlar
        cat.eat();//yemek yiyebilir
        cat.feed();//cocuklarini besler
        cat.move();//hareket edebilir



    }
    public void meow(){
        System.out.println("Kediler miyavlar");
    }
}
