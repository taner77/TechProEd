package day30_exceptions;

public class TryCatch01 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 0;
        //finally{} block exception block olsa da olmasa da her zaman calisir
        //finally block{} try-catch den sonra yazilir
        try{
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.out.println("Sifir ile bolme yapilmaz");
        }finally{
            System.out.println("Isleminiz bitmistir");
        }

       // Interview: final, finally, finalize keyword'lerinin farki nedir?
        /*
        1) finally{} (block)==> try-cath bloc'dan sonra kullanilir
                         Exception olsa da olmasa da kullanilir
        2) final(keyword) ==> a) Variable'larda final kullanilirsa o variable'in degeri degistirilemez
                        Ex: final String code = "POS";

                     b) Method'larda final kullanilirsa, method body'leri degistirilemez
                        Dolayisiyla overriding yapilamaz

                     c) Class'larda final kullanilirsa o class extends edilemez
                        inheritance mumkun degildir
                        public final class Animal{ } ==>public class Dog extends Animal{ } OLMAZ

        3) finalize()(method) ==> finalize() methodu, garbage collector'in imha edecegi datalari
                          imha edecegi hale getirir

         */

    }
}
