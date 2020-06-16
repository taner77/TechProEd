package day19_arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // Integer Array olusturalim
        int arr1[] =new int[5];

       // System.out.println(arr1);--> Array'in reference 'ini ekrana yazdirir
       // System.out.println(arr1[2]); --> Array'in indexi 2 olan elemanini ekrana yazdirir

        System.out.println(arr1[4]); //0

        arr1[0] = 12;
        System.out.println(arr1[0]);

        arr1[1] = -5;
        System.out.println(arr1[1]);

        arr1[2] = 22;
        System.out.println(arr1[2]);

        arr1[3] = 50;
        System.out.println(arr1[3]);

        // Array'daki elemanlari ekrana yazdirmak icin for loop kullaniniz
        for (int i = 0; i <5 ; i++) {
            System.out.print(arr1[i]+ " ");

        }

        //Array'da olmayan index'e deger atamasi yapilirsa Run Time Error alinir
        // Array'da olmayan index'i kullanmaya calisirsak "ArrayIndexOutOfBoundsException" aliriz
        arr1[5] = 23;
        System.out.println(arr1[5]);

    }
}
