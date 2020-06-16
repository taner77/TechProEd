package homework.day22;

public class Odev4 {
    public static void main(String[] args) {
        //Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
        //for-each loop kullanarak yazdırınız.
        //İpucu: split()

        String str = "Welcome!";
        String ch[] = str.split("");
        for(String w : ch){
            System.out.println(w);

        } 
    }
}