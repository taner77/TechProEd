package homework.day5;

public class Concatenation01 {
    public static void main(String[] args) {
        int numA = 2;
        int numB = 3;
        String str1 = "Cok";
        String str2 ="Calis";

        // Aşağıdaki cıktıları ekrana yazdırmak icin program yazınız.
        //        A) Cok Calıs  B) 5 Cok  C) Calıs23  D) Cok1
        //Not: Bosluklara dikkat ediniz.

        System.out.println(str1+" "+ str2); // Cok Calis
        System.out.println(numA + numB + " " + str1); // 5 Cok
        System.out.println(str2 + numA+numB); //Calis23
        System.out.println(str1 + (numB - numA)); // Cok1



    }
}
