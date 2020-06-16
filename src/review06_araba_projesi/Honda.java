package review06_araba_projesi;

public class Honda extends Car{
    /*
    Bir class olusturunuz adi Honda olsun
    icerisinde 3 instance variable olsun
    protected String make = "Honda";
    protected String model = "Accord";
    protected int year = 2012;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz
    */
    protected String make = "Honda";
    protected String model = "Accord";
    protected int year = 2012;

    public Honda(){

    }
    public Honda(String model, int year){
        this.model = model;
        this.year = year;
    }


    public static void main(String[] args) {
        Honda honda1 = new Honda();
        System.out.println("Arabanin markasi: " + honda1.arabaMarkasi());
        System.out.println("Arabanin modeli: " + honda1.arabaModeli());
        System.out.println("Arabanin yili: " + honda1.arabaYili());

        System.out.println("******************");

        Honda honda2 = new Honda("Civic",2014);
        System.out.println("Arabanin markasi: " + honda2.arabaMarkasi());
        System.out.println("Arabanin modeli: " + honda2.arabaModeli());
        System.out.println("Arabanin yili: " + honda2.arabaYili());

    }
    @Override
    public  String arabaMarkasi(){
        return make;
    }
    @Override
    public  String arabaModeli(){
        return model;
    }
    @Override
    public  int arabaYili(){
        return year;
    }

}
