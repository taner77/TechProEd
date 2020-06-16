package review06_araba_projesi;

public class Toyota extends Car{
    /*
    Bir class olusturunuz adi Toyota olsun
    icerisinde 3 instance variable olsun
    protected String make = "Toyota";
    protected String model = "Corolla";
    protected int year = 2009;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz
    */

    protected String make = "Toyota";
    protected String model = "Corolla";
    protected int year = 2009;

    public Toyota() {

    }

    public Toyota(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Toyota toyota1 = new Toyota();
        System.out.println("Arabanin markasi: " + toyota1.arabaMarkasi());
        System.out.println("Arabanin modeli: " + toyota1.arabaModeli());
        System.out.println("Arabanin yili: " + toyota1.arabaYili());

        System.out.println("******************");

        Toyota toyota2 = new Toyota("Camry",2014);
        System.out.println("Arabanin markasi: " + toyota2.arabaMarkasi());
        System.out.println("Arabanin modeli: " + toyota2.arabaModeli());
        System.out.println("Arabanin yili: " + toyota2.arabaYili());
    }


    public  String arabaMarkasi(){
        return make;
    }
    public  String arabaModeli(){
        return model;
    }

    public  int arabaYili(){
        return year;
    }

}