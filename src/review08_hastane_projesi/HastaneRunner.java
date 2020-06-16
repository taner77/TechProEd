package review08_hastane_projesi;

public class HastaneRunner {
   private static Hastane hastane = new Hastane();




     //Main method da iki variable olusturunuz
     //String hastaDurumu
     //String unvan
     //Ve asagidaki custom methodlari olusturunuz
     //public static String doktorUnvan(String aktuelDurum) { }
     //Sonra sirasiyla asagidaki adimlari takip ediniz
     //If aktuelDurum  Allerji return Allergist
     //If aktuelDurum  Bas agrisi return Norolog
     //If aktuelDurum  Diabet return Genel cerrah
     //If aktuelDurum  Soguk alginligi return Cocuk doktoru
     //If aktuelDurum  Migren return Dahiliye
     //If aktuelDurum  Kalp hastaliklari return Kardiolog
     //else return yanlis unvan
     //Sonra bu methodunuzu unvan variable iniza atayiniz
    public static void main(String[] args) {
        String hastaDurumu = "Kalp hastaliklari";
        String unvan= doktorUnvan(hastaDurumu) ;

        hastane.setDoktor(doktorBul(unvan));
        System.out.println("Dotor ismi: "+ hastane.getDoktor().getIsim());
        System.out.println("Dotor ismi: "+ hastane.getDoktor().getSoyIsim());
        System.out.println("Dotor ismi: "+ hastane.getDoktor().getUnvan());


    }

    public static String doktorUnvan (String actualDurum){
        if(actualDurum.equals("Allerji")){
            return hastane.unvanlar[0];
        }else if(actualDurum.equals("Bas agrisi")){
            return hastane.unvanlar[1];
        }else if (actualDurum.equals("Diabet")){
            return hastane.unvanlar[2];
        }else if(actualDurum.equals("Soguk alginligi")){
            return hastane.unvanlar[3];
        }else if(actualDurum.equals("Migren")){
            return hastane.unvanlar[4];
        }else if (actualDurum.equals("Kalp hastaliklari")){
            return hastane.unvanlar[5];
        }
        return "yanlis brans";
    }

    public static Doktor doktorBul (String unvan){
        Doktor doktor = new Doktor();

        for (int i = 0; i <hastane.unvanlar.length ; i++) {
            if(unvan.equals(hastane.unvanlar[i])){
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(hastane.unvanlar[i]);
               // doktor.setUnvan(unvan);
            }
        }
        return doktor;
    }
}
