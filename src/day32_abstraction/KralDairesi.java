package day32_abstraction;

public class KralDairesi extends  Otel {
    public static void main(String[] args) {
        KralDairesi musteri3 = new KralDairesi();
        musteri3.kahvalti();
        System.out.println("Wifi ucreti: "+musteri3.wifi(3));
        System.out.println("International TV ucreti: "+ musteri3.tv("international",10));
    }

    @Override
    public void kahvalti() {
        System.out.println("Kahvaltiniz teras kat Kral Restaurant'dadir");
    }
    public int tv(String international, int saat){
        if(international.equals("international")){
            return saat*5;
        }else{
            return 0;
        }
    }
}
