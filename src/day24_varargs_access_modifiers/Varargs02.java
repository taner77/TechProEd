package day24_varargs_access_modifiers;

public class Varargs02 {
    public static void main(String[] args) {
        // Varargs'in yanlis kullanimlari

        //Kural 1: Varargs her zaman son parametre olmalidir.
        //         Cunku ilk parametre yaparsaniz girdiginiz her deger
        //         varargs'in icine duser, siz asla ikinci parametreye deger
        //         veremezsiniz

        valueChar("Character: ", 'a');
        valueChar("Character: ", 'a', 'b');

        product(5, 6, 7);

    }

    public static void valueChar(String s, char... c) {
        for (char w : c) {
            System.out.print(s);
            System.out.println(w);
        }
    }

    //Kural 2: Parametre olarak 1'den fazla varargs kullanamazsiniz.
    //         Cunku varargs en sonda olmalidir, en sonda olmak tek olmayi
    //         tek olmayi gerektirir
    public static void product(int x, int... y) {
        int product = 1;
        for (int w : y) {
            product = product * w;
        }
        System.out.println(x);
        System.out.println(product);
    }

}