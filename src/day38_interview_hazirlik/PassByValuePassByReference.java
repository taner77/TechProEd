package day38_interview_hazirlik;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        //Bir method'a variable yollandiginda java o variable'in kopyasini olusturur
        //ve method'a kopyayi yollar. Bu yuzden variable'in orjinal degeri method calistiktan
        // sonra da ayni kalir. Buna Pass By Value denir

        // Pass By Reference'da ise reference'in kopyasi olusturulur ve methoda yollanir
        // fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin
        //  orjinal degeri degisir. java bunu kulannmaz
        int x=12;
        System.out.println(increment(x));
        System.out.println(x);
    }

    public static int increment(int a){
        a= a+1;
        return a;
    }
}
