package homework.day10;

public class StringMethod2 {
    public static void main(String[] args) {
  //Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye
        // once dusunun sonra kodları yazarak  ekran çıktılarına bakın.

        String str = "Cat, caterpillar";
        System.out.println(str.toUpperCase()); //CAT, CATERPILLAR
        System.out.println(str.toLowerCase()); //cat,caterpillar
        System.out.println(str.substring(4).toLowerCase());// caterpillar
        System.out.println(str.substring(3,8).toUpperCase());// , CAT
        System.out.println(str.toUpperCase().toLowerCase());//cat,caterpillar

        String strA ="Cat ";
        System.out.println(strA.trim());

        String strB = " Cat";
        System.out.println(strB.trim());

        String strC = " Cat ";
        System.out.println(strC.trim());

        String strD ="Cat";
        System.out.println(strD.contains("a")); //true

        String strE = " Cat";
        System.out.println(strE.contains(" ")); //true

        String strF = "Cat";
        System.out.println(strF.contains("")); //true
    }
}
