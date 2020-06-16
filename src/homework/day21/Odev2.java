package homework.day21;

public class Odev2 {
    public static void main(String[] args) {
        // Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana yazdıran
        //bir program yazınız { {1,2,3}, {4,5}, {6} }

        int arr[][] = { {1,2,3}, {4,5}, {6} };

        int product = 1;
        for (int i = 0; i <arr.length ; i++) {
                product *= arr[i][arr[i].length - 1];
        }
        System.out.println("son elemanlar carpimi = " +product);

        //ilk elemanlar carpimi
         product = 1;
        for (int i = 0; i <arr.length ; i++) {
            product *= arr[i][0];
        }
        System.out.println("ilk elemanlar carpimi = " +product);
    }
}
