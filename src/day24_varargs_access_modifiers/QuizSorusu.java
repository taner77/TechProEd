package day24_varargs_access_modifiers;

public class QuizSorusu {
    public static void main(String[] args) {
        String a = "";
        a +=2;
        a  += 'c';
        a +=false;

        if(a.equals("2cfalse")){
            System.out.println("==>" +a);
        }
    }
}
