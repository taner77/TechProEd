package day21multi_dimensional_array_list;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
         //Multi Dimensional Array Olusturup Deger Atama 2.Yol
        int arr[][] ={{1, 2}, {3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(arr));

        //2, 3 ve 6 nin toplamini ekrana yazdiriniz
        int sum = arr[0][1] + arr[1][0] + arr[2][2]; // 2+3+6=11
        System.out.println(sum);

        // arr arrayindaki tum elemanlarin toplamini veren programi yaziniz
        int sum2 =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum2 += arr[i][j];
            }
        }
        System.out.println("Tum elemanlarin toplami = " + sum2);

    }
}
