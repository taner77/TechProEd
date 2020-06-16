package review04;

public class PasswordOlusturma {
    public static void main(String[] args) {
        // Bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
        // 1_uzunlugu => en az 10 karakter(chars) olmalidir
        // 2_en az 1 sembol bulundurmali
        // 3_en az 1 numara bulundurmali
        // 4_en az bir buyuk harf olmalidir
        // 5_en az bir kucuk harf olmalidir

        String sembol =  "!@#$%%^&*()_+";
        String rakam = "0123456789";
        String password = "Mypassword1@";

        int numOfSembol = 0;
        int numOfDigit = 0;
        int numOfUpperCase = 0;
        int numOfLowercase = 0;



        if(password.length()>=10){
            for (int i = 0; i <password.length() ; i++) {
                if(sembol.contains(password.substring(i, i+1))) {
                    // if(password.contains("" + password.charAt(i)));
                    numOfSembol++;
                }
                if(Character.isDigit(password.charAt(i))){
                    // if(rakam.contains(password.substring(i, i+1))) {
                    numOfDigit++;
                }
                if(password.charAt(i) >= 'a' && password.charAt(i) <='z'){
                    numOfLowercase++;
                }
                if(password.charAt(i) >= 'A' && password.charAt(i) <='Z'){
                    numOfUpperCase++;
                }

            }
            if(numOfSembol>0 && numOfDigit>0 && numOfUpperCase>0 && numOfLowercase>0){
                System.out.println("Tebrikler!  Password olusturuldu");
            }



        }else {
            System.out.println("Password en az 10 character olmalidir!" );
        }



    }
}
