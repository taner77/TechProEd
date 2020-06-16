package review04;

public class LoopIfStatementAndIncrementDcerement {
    public static void main(String[] args) {
        // Bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle olmalidir;
        // 1_uzunlugu => en az 8 karakter (chars) olmalidir
        // 2_icinde sadece alfabetik karakterler bulunmalidir



        String userName ="Selim123456".toLowerCase();

        int count=0;
        if(userName.length()>=8){
            for (int i = 0; i <userName.length() ; i++) {
                char temp = userName.charAt(i);
               // if(!(temp>= 'a' && temp<='z')){
                if(temp>= 'a' || temp<='z'){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("User name olusturuldu!");
            }else{
                System.out.println();
                System.out.println("Lutfen bosluk olmadan sadece alfabetik character kullaniniz");
            }

        }else{
            System.out.println("User name en az 8 character olmalidir");
        }


        //     PASSWORD




    }
}
