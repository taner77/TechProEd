package day27_constructor_cagirma;

public class Mamal extends Animal {
    public boolean dogum = true;

    public static void main(String[] args) {
        Mamal mamal = new Mamal();
       // Mamal mamal1 =new Mamal(15);
        mamal.feed();

    }

    public void feed(){
        System.out.println("cocuklarini besler");
    }

    Mamal(){
        this(11); // Parent'taki parametresiz constructoru cagir demektir
                // super() keyword'unu kullanmassaniz da olur ama bazilari kullanir sasirmayin
                // super() kullanilacaksa ilk satirda olmalidir
                // super() ve this() birlikte olamaz
        System.out.println("Mammal parametresiz constructor");
    }

    public Mamal(int age){
        super();
        System.out.println("Child constructor called by this()");
    }

}
