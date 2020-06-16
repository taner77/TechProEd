package day38_interview_hazirlik;

public class PostandPreIncrement {
    public static void main(String[] args) {

        //Post Increment
        int a = 12;
        a = a++;
        System.out.println(a);//12

        int b = 22;
        //post Increment
        b++;
        System.out.println(b);//23

        int c=32;
        //Pre increment
        c = ++c;
        System.out.println(c);//33

    }
}