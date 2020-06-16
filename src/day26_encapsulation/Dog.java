package day26_encapsulation;

public class Dog extends Mamal{
  public boolean sadik = true;


    public static void main(String[] args) {
        Dog dog =new Dog();
        System.out.println("Animal Class'tan geldi: " + dog.age);//0
        System.out.println("Animal Class'tan geldi: " + dog.name);//null
        dog.eat(); //yemek yiyebilir
        dog.move(); // hareket edebilir
        

        System.out.println("Mamal class'tan geldi: "+ dog.dogum);
        dog.feed();

        System.out.println("Dog class'tan geldi: " + dog.sadik);
        dog.bark();

    }
    public void bark(){
        System.out.println("Kopek havlar");
    }
}
