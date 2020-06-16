package review02;

public class YerDegistirme {
    public static void main(String[] args) {
        // verilen iki sayının yerlerini değiştiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
