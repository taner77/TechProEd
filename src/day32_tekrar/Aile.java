package day32_tekrar;

public class Aile extends  Otel {
    public static void main(String[] args) {
        Aile aile = new Aile();
        aile.kahvalti();
        System.out.println(" Wifi Ucreti: " + aile.wifi(3));
    }


    @Override
  public void kahvalti(){
        System.out.println("Kahvvaltiniz cafede olacaktir");
  }
}
