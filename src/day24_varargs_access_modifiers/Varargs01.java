package day24_varargs_access_modifiers;

public class Varargs01 {
    public static void main(String[] args) {

        //Varargs : Variable Arguments
        //Bir method ousturdugumuzda argument olarak istedigimiz kadar argument girebilmemizi saglar

        counNum(5); //1
        counNum(5,6,7,8); //4

        addNums(2,3);
        addNums(1,2,3, 4.5);

        printName("Ali");
        printName("Ali", "Kara");
        printName("Ali", "Can", "Kara");



    }

    public static void counNum(int ...a){
        System.out.println(a.length);
    }

    public static void addNums(double...b){
        double sum = 0;
        for(double w :b){
            sum += w;
        }
        System.out.println("sum = " + sum);
    }

    public static void printName(String... n){
        for(String w : n){
            System.out.print( w + " ");
        }

    }








}
