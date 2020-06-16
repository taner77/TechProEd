package review05;

public class ObjectOrnek {
    public static void main(String[] args) {
//        StringBuilder stb = new StringBuilder();
//        stb.append("bayram");
//        System.out.println(stb.equals(stb.reverse())); //true,  object immutable, adresleri karsilastirir
//        System.out.println(stb.equals(stb.reverse().toString()));//false, String mutable
//
//        stb.append("ali");
//        System.out.println(stb); //bayramali


        String name = "mahmut";
        String name2 = "mahmut";
        System.out.println(name.equals(name2)); // degerleri karsilastiriyor, true
    }
}
