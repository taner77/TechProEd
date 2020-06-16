package day26_encapsulation;

public class Encapsulation01 {
    private String kimlikNo = "12345678901";
    private int krediKartNo = 12345678;
    private boolean soguk = true;


    public static void main(String[] args) {
        /*Encapsulation data saklama (data- hiding) yontemidir.
                  Encapsulation 2 stepte yapilir
           1) Data 'yi (variable, method) private yapmalisiniz
           2) public olan getter() ve setter() methodlar uretmeliyim.
           getter() data'yi sadece okumamiza yarar, getter() methodu data'da degisilik yapamaz
           setter() data'yi degistirmemize yarar

         */
    }

    // getter uretmek icin: 1) Access modifier public olmali
    //                      2) Return type variable'in return type'i ile ayni olmali
    //                      3) Method ismi "get + variable ismi" seklinde olmali
    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getKrediKartNo(){
        return krediKartNo;
    }

    // return type boolean ise; getter() method'un ismi "is" ile baslar. "get" kullanilmaz
    public boolean isSoguk(){
        return soguk;
    }



    //setter() uretmek icin: 1) Access modifier public olmali
    //                       2) return type void olmali
    //                       3) method ismi "set + variable ismi" sekilinde olmali
    //                       4) Parametre kullanilmali
    //                       5) setter() methodlarin ismi boolean'lar icin de "set" ile baslar

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setKrediKartNo(int krediKartNo){
        this.krediKartNo = krediKartNo;
    }
    public void setSoguk(boolean soguk){
        this.soguk = soguk;
    }






}
