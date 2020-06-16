package day15_method_creation;

public class MethodCreation01 {
    public static void main(String[] args) {

        System.out.println(toplama(6,5.2)); //11.2
        System.out.println(carpma(3,5)); //15

    }


    // Bir methodu main methodun icinden cagirmak icin mutlaka 'static' kelimesini kullanmalisiniz
    // Method parantezinin icinde olusturulan variable'lara "parametre" denir.
    // Methodu cagirirken method parantezinin icine yazilan degerlere "Argument" denir
    // Parametrenin data type'i ile Argument data type'i birebir eslesmeli

    public static double toplama(int num1, double  num2){
        return num1 + num2;

    }

    public static int carpma(int num1, int num2){
        return num1*num2;
    }



}
