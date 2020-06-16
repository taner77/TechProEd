package review06_araba_projesi;

public class Runner {
    public static void main(String[] args) {
        //          reference type      object type
        //polymorphism:  Car car1 = new Toyota();

        Car car1 = new Honda();
        System.out.println("Arabanin markasi: " +car1.arabaMarkasi());
        System.out.println("Arabanin modeli: "+car1.arabaModeli());
        System.out.println("Arabanin yili: " +car1.arabaYili());

        System.out.println("***************");
        Car car2 = new Honda("jazz",2020);
        System.out.println("Arabanin markasi: " +car2.arabaMarkasi());
        System.out.println("Arabanin modeli: "+car2.arabaModeli());
        System.out.println("Arabanin yili: " +car2.arabaYili());



    }
}