package day18_static_keyword.calisma;
 class Test1 {
//     public static void main(String[] args) {
//         int x =20;
//         System.out.println(x);
//     }
//     static{
//         int x=10;
//         System.out.print(x + " ");
//     }

//     int x =10;
//
//     public static void main(String[] args) {
//         Test1 t1 =new Test1();
//         Test1 t2 =new Test1();
//
//         t1.x =20;
//         System.out.print(t1.x + " ");
//         System.out.println(t2.x);
//     }

  static int i=1;

     public static void main(String[] args) {
         int i=1;
         for (Test1.i = 1; Test1.i <10 ; Test1.i++) {
             i+=2;
             System.out.print(i + " ");
         }
     }






}
