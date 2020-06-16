package day01_variables;

public class Variable01 {
    public static void main(String[] args) {

        int salary = 3000;
        char letter = 'S';

        System.out.println(salary); //3000
        System.out.println(letter);

        int number = 123;
        System.out.println(number);

        boolean isOld = true; //Sadece true veya false
        System.out.println(isOld);

        boolean isNew = false;
        System.out.println(isNew);


        byte length = -127;  //-127 to 128
        System.out.println(length);

        short population = 28000;
        System.out.println(population);

        long hucreSayisi = 1234567891111111111L; //integer sinirini asan long variable' larda
                                                 // en sona "L" koymaliyiz
        System.out.println(hucreSayisi);


        float money = 5.25f; //ondalik kesri float yapmak icin
                             // en sona "f" veya "F" koymaliyiz
        System.out.println(money);


        String studentName = "john";
        System.out.println(studentName); //john






    }
}
