package homework.day10;

public class StringMethod {
    public static void main(String[] args) {
        //Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
        //ekran çıktılarına bakın.

        System.out.println("---------------indexOf()----------");

        String str = "Cat, caterpillar";

        System.out.println(str.indexOf("c")); //5
        System.out.println(str.indexOf("cat"));//5
        System.out.println(str.indexOf("s"));//-1
        System.out.println(str.indexOf("CAT"));  //-1
        System.out.println(str.indexOf("ter"));//7
        System.out.println(str.indexOf("pars"));//-1
        System.out.println(str.indexOf("a" , 3 ));//6
        System.out.println(str.indexOf("at", 2)); //6
        System.out.println(str.indexOf("at", 8)); //-1

        System.out.println("********************");

      //  String str = "Cat, caterpillar";
        System.out.println(str.lastIndexOf("a")); //14
        System.out.println(str.lastIndexOf("at")); //6
        System.out.println(str.lastIndexOf("s")); //-1
        System.out.println(str.lastIndexOf("CAT")); //-1
        System.out.println(str.lastIndexOf("pars")); //-1
        System.out.println(str.lastIndexOf("a" , 3 )); //1
        System.out.println(str.lastIndexOf("a" , 5 )); //1
        System.out.println(str.lastIndexOf("at", 2)); //1
        System.out.println(str.lastIndexOf("at", 7)); //6  ilk 7 indexteki at nin son goruldugu yer

        String str1 = "";
        System.out.println(str1.isEmpty()); //true
        String str2 =" ";
        System.out.println(str2.isEmpty()); //false
        String str3 = "Almanya";
        System.out.println(str3.isEmpty()); //true
    }
}
