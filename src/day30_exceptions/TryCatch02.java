package day30_exceptions;

public class TryCatch02 {
    static String m;

    public static void main(String[] args) {
        String s = "";
        System.out.println(s.length());//0

        try{
            s +="t";
        }catch(Exception e){
            s += "c";
        }finally {
            s +="f";
        }
        s +="a";
        System.out.println(s);

        // String'e null atandigi zaman length() methodu calismaz
        String n = null;
      //  System.out.println(n.length()); //NullPointerException

      //  String m;
      //  System.out.println(m.length());//Error:(23, 28) java: variable m might not have been initialized

      //  System.out.println(m.length()); //NullPointerException

    }
}
