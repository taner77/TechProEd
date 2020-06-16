package day16_overloading;

public class Student {
//    String name;
//    int age;
//    String phone;
//
//    Student(){}
//    Student (String name, int age, String phone){
//        this.phone = phone;
//        this.name = name;
//    }
//
//    public static void main(String[] args){
//        Student s1 = new Student();
//        Student s2 = new Student("Jonh", 25, "029-998877");
//        System.out.println(s2.name + ", "+ s2.age+ ", "+ s2.phone);
 //   }

    String name ="ali";
    int age, weight, grade;




    Student (String name, int age){
        this.name = name;
        this.age = age;

    }
    Student(){


    }
    Student(String name, int grade, int weight){
        this.name  = name;
        this.grade = grade;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name + s1.age +"boyunda");


        Student s2 = new Student("taner", 80, 170);
        System.out.println(s2.name);
        System.out.println(s2.grade);
        System.out.println(s2.weight);


        Student s3 =new Student("ayse", 17);
        System.out.println(s3.name +" "+ s3.age + " yasinda");

    }


}
