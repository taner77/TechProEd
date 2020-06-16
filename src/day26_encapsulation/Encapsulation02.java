package day26_encapsulation;

public class Encapsulation02 {

    private char ilkharf ='T';
    private double para = 23.75;
    private boolean emekli = false;

    // Variable 'a atanan degerin degisrilmesini istemiyorsaniz o variable
    //ile ilgili setter() olusturmamalisiniz

    //Variable 'a atanan degerin okunmasin istemiyorsaniz o variable
    //    //ile ilgili getter() olusturmamalisiniz

    //Sadece getter() kullanir ve hic setter kullanmazsaniz, variable degerleri
    //degistirilemez demektir. Bu tarz class'lara "immutable class" denir.

    //Sadece setter() kullanir ve hic getter() kullanmazsaniz, variable degerleri
    //okunamaz demektir.



    public static void main(String[] args) {
        Encapsulation01 obj = new Encapsulation01();
        System.out.println( obj.getKimlikNo());
        obj.setKimlikNo("10000000000");
        System.out.println(obj.getKimlikNo());

    }

    public char getIlkharf() {
        return ilkharf;
    }

    public void setIlkharf(char ilkharf) {
        this.ilkharf = ilkharf;
    }

    public double getPara() {
        return para;
    }

    public void setPara(double para) {
        this.para = para;
    }

    public boolean isEmekli() {
        return emekli;
    }

    public void setEmekli(boolean emekli) {
        this.emekli = emekli;
    }
}
