package day13_while_loops02;

public class WhileLoop01 {
    public static void main(String[] args) {
        // while loop ile ilk 5 sayma sayisinin toplamini ekrana yazdirin

        int num = 1;
        int sum = 0;
        while(num<6){
            sum = sum + num;
            num++;
        }
        System.out.println("sum = " + sum);
        //En son toplami gormek icin System.out.println("sum = " + sum); ifadesini loop disina yazin
        //Her adimda toplami gormek icin loop icine yazin
    }
}
