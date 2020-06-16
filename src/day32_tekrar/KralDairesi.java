package day32_tekrar;

public class KralDairesi extends Otel{
    public static void main(String[] args) {
        KralDairesi kralDairesi =new KralDairesi();
        kralDairesi.kahvalti();
        System.out.println( kralDairesi.wifi(6));

    }
    @Override
    public void kahvalti(){
        System.out.println("");
    }
}
