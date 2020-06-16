package review07;

public class Case {

    //Case sinifi olusturunuz ve icin de 2 String variable olsun ve private olsunlar
    //     sonra getter ve setterlar kullaniniz
    //     String actualCase;//suan durumu
    //     String emergencey; // acil durum

    private String actualCase;
    private String emercencey;

    public String getActualCase() {
        return actualCase;
    }

    public void setActualCase(String actualCase) {
        this.actualCase = actualCase;
    }

    public String getEmercencey() {
        return emercencey;
    }

    public void setEmercencey(String emercencey) {
        this.emercencey = emercencey;
    }
}
