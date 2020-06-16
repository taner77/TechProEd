package day19_arrays;

 class Test {
     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 50};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(" " + arr[i]);
//
//         }

//         int arr1[] = {1,2,3};
//         int arr2[] = {1,2,3};
//         if(arr1==arr2){
//             System.out.println("Same");
//         }else{
//             System.out.println("not same");
//         }
//


//         String[] cities ={"London", "Paris", "Rome", "New York" };
//         System.out.println(cities[cities.length-2]);
         int arr[] = {3, 2, 23, 5, 3, 8, 2, 7, 9, 5, 4};
         int arr1[] = new int[arr.length];
         int count = 0;

         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[i] == arr[j]) {
                     arr1[count] = arr[i];
                     count++;
                 }
             }
         }
         if (count > 0) {
             System.out.print("Aynı eleman var ("+count + " tane elemanın aynısından var).\n");
             System.out.print("Bu elemanlar : ");
             for (int m = 0; m < count; m++) {
                 System.out.print(arr1[m] + " ");
             }
         } else {
             System.out.println("Aynı eleman yok");
         }

     }
 }