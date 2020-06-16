package day17_constructors;

public class MyConstructor {

    int x;
    static int y;
    MyConstructor(int i){
        x +=i;
        y +=i;
    }

    public static void main(String[] args) {
        new MyConstructor(2);
        MyConstructor mc = new MyConstructor(3);
        System.out.println(mc.x + "," + mc.y);
    }
//    int x =5;
//    MyConstructor(){
//        System.out.println("-x" + x);
//    }
//
//    MyConstructor(int x){
//        this();
//        System.out.println("-x" + x);
//    }
//
//    public static void main(String[] args) {
//        MyConstructor mc1 = new MyConstructor(4);
//        MyConstructor mc2 = new MyConstructor();
//    }
//
   }

