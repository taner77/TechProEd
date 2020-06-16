package day10_string_methods;

public class StringMethod04 {
    public static void main(String[] args) {

        //contains() methodu bir String in icinde bir characterin olup olmadigini kontrol eder
        // Eger o character Stringin icinde varsa true yoksa false retur eder

        String str1 = "karakartal";
        System.out.println(str1.contains("n"));
        System.out.println(str1.contains("Kar"));


        // trim() methodu bir Stringin  sadece bas ve sonundaki bosluklari siler. Aradakileri silmez
        String str2 = "Ali Can       ";
        System.out.println("trim() kullanmadan once :" + str2);
        System.out.println("trim() kullandiktan sonra :" + str2.trim());


        //isEmpty() methodu bir Stringin icinde character olup olmadigina bakar.
        //character yoksa true, varsa false return eder.
        String str3 = "Ali";
        System.out.println(str3.isEmpty());//false cunku String bos degil

        String str4 = " ";
        System.out.println(str4.isEmpty());//false cunku space Java icin bir character

        String str5 = "";
        System.out.println(str5.isEmpty());//true cunku hicbir character yok

        //Note: isEmpty() true cikarsa length 0 demektir.


    }
}
