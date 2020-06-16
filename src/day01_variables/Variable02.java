package day01_variables;

public class Variable02 {
    public static void main(String[] args) {

        char letter1 ='a';  //a->97 (ASCII table)
        char letter2 ='b';  //b->98

        System.out.println(letter1 + letter2); // 97+98=195
        System.out.println(letter1);  // a
        System.out.println(letter2);  // b

        System.out.println(letter1);
        System.out.print(letter2); //ab

        // Bir char'in degeri ASCII tablosu kullanmadan nasil bulunur
        // Data type'i int olan bir variable olustur ve char'i bu variable'a ata
        int aCharDeger = 'a';
        System.out.println(aCharDeger); //97

        //'!' , "%", '*' sembollerinin ASCII degerlerini bulunuz.
        int unlemChar ='!';
        System.out.println(unlemChar); //33

        int yuzdeChar = '%';
        System.out.println(yuzdeChar);//37

        int asterixChar = '*';
        System.out.println(asterixChar);//42

    }
}
