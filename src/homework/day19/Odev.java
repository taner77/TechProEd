package homework.day19;

public class Odev {
    public static void main(String[] args) {
        // Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol eden
        // bir program yazınız.
        // Aynı eleman varsa “Aynı eleman var” yoksa “Aynı eleman yok” yazdırınız.

        int arr[] = {1, 2, 3, 5, 3, 6, 6};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Ayni eleman var");
        } else {
            System.out.println("Ayni eleman yok");
        }
    }
}
