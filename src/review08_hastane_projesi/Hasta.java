package review08_hastane_projesi;

public class Hasta {
    private String isim;
    private String soyIsim;
    private int hastaID;
    private Durum hastaDurum;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurum() {
        return hastaDurum;
    }

    public void setHastaDurum(Durum hastaDurum) {
        this.hastaDurum = hastaDurum;
    }
}
