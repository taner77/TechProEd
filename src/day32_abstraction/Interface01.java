package day32_abstraction;

public interface Interface01 {
    // Interface icine concrete method yazarasaniz compile time error alirsiniz
    //Interface'de olustururken kesinlikle body yazmayin
    //interface'deki methodlar kesinlikle abstract olmalidir

    //interface'deki abstract methodlari uretirken abstract keyword kullansaniz
    // da olur kullanmasaniz da olur. Cunku interface kendi icne yazilan methodlari
    // otomatik olarak abstract olarak kabul eder
    public void add();
    public abstract void subtract();

    //Interface de variable'lar mutlaka; public, static, final olmali ve
    //mutlaka initialize(deger atanmali) edilmelidirler.
    //Variable olusturulurken public, static, final keywordleri
    //kullanilsa da olur kullanilmasa da olur.public, static, final
    //ketwordleri kullanildiginda da kullanilmadiginda da variable
    //public static ve finaldir.
    public static final int a = 12;
    int b = 11;
    public int c = 13;
    final int d = 14;
    static int e = 15;

}
