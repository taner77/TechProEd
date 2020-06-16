package review02;

public class YerDegistirmeInterview {
    public static void main(String[] args) {
        //*** interview question***
        // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
        int  x = 50; //=>10
        int  y  = 10; //=>50

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
