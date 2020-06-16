package day19_arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // 4 elemanli char bir array olusturun. Bu array'e elemanlar yerlestirin
        // Tum elemanlari for dongusu kullanarak ekrana yazdirin.
        // Sadece son elemani ekrana yazdirin.


        char arr[] = new char[4];

        arr[0]= 'A';
        arr[1]= 'D';
        arr[2]= 'E';
        arr[3]= 'M';

        for (int i=0; i<4; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(arr[3]);

        // Array'in length'ini bulmak icin  "ArrayIsmi.length" yazmak yeterlidir
        // String'lerde de length methodu kullanilir ama String'lerde kullanilan length
        // methodu parantezlidir.
        //
        // Yani String'lerde ==> length()
        //      Array'lerde ==>  length
        System.out.println(arr.length); //4

        //Array'deki son elemani yazdirmak icin length kullaniniz
        System.out.println(arr[arr.length-1]); // M



    }
}
