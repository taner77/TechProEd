package homework.day22;

public class Odev3 {
    public static void main(String[] args) {
        //İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
        //For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız

        String arr1[] = {"Ali", "Ahmet ", "Can"};
        String arr2[] = {"Ali", "Mehmet ", "Can", "Joe"};

        int count = 0;
        for (String w : arr1) {
            for (String y : arr2) {
                if (w.equals(y)) {
                    count++;
                    System.out.println(w);
                }

            }

        }
        if (count == 0) {
            System.out.println("Ortak eleman yoktur");
        }
    }
}