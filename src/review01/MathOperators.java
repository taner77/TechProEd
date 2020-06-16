package review01;

public class MathOperators {
    public static void main(String[] args) {
        int a =11;
        int b =5;
        double pi = 3.14;

        System.out.println("a*b = " + a*b);
        System.out.println("a*pi = " + a*pi);
        System.out.println("a/b = " + a/b);
        System.out.println("a*b/pi= " + a*b/pi);
        System.out.println("a+b+pi= " + (a+b+pi));
        System.out.println("a+b= " + (a+b));
        System.out.println("a-b= " + (a-b));
        System.out.println("-pi/a= " +(pi/a));
        System.out.println("(a+b)/pi= " + (a+b)/pi);


        /*
        hi 21
        hi Harun
        5TechProEd203
        TechProEd305
        7TechProEd305
         EKRANA YAZDIR */
        System.out.println("hi " + 21);
        System.out.println("hi Harun");

        System.out.println(5+"TechProEd"+203);
        System.out.println(2+0+3+"TechProEd"+2+0+3); //String den oncesi mat islemi
                // String den sonrai birlestirme seklinde yapar

        System.out.println("TechProEd"+305);
        System.out.println(7 +"TechProEd" +305);


        /* TASK
        a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3
         */
        System.out.println(-5 + 8 * 6); //43
        System.out.println((55+9) % 9);  //1
        System.out.println(20 + -3*5 / 8); //19
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); //13

        System.out.println(Math.pow(2, 3)); // 2 ussu 3 = 8.0 DEMEK
        System.out.println(Math.sqrt(144));  // 12.0  KARAKOK
        System.out.println(Math.round(3.8)); //4 YUVARLAMA YAPAR
        System.out.println(Math.round(2.1)); //2



    }
}
