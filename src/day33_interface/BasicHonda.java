package day33_interface;

public class BasicHonda extends Araba implements IcAraba,DisAraba{
    public static void main(String[] args) {
        BasicHonda basicHonda = new BasicHonda();
        basicHonda.benzin();
        basicHonda.direksiyon();
        basicHonda.kapi();
        basicHonda.koltuk();
        basicHonda.klima();
        basicHonda.move();


    }

    @Override
    public void move() {
        System.out.println("15 saniyede 100km'lik hiza ulasir");
    }

    @Override
    public void kapi() {
        System.out.println("Kumandali kapi");

    }

    @Override
    public void direksiyon() {
        System.out.println("Classic direksiyon");

    }

    @Override
    public void koltuk() {
        System.out.println("Kumas koltuk");

    }

    @Override
    public void klima() {
        System.out.println("Manuel klima");

    }
}
