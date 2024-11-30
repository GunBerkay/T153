package day14_nestefForLoops_methodKullanma;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {

//       Kullanicidan satir sayisini alip
//        asagidaki sekli java dilinde for loop kullanarak yaz
//
//            1
//           1 1
//          1 2 1
//         1 2 2 1
//        1 2 3 2 1
//       1 2 3 3 2 1
//
//

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satir sayisini girin: ");
        int satir = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= satir; i++) {
            // Boşlukları yazdır
            for (int j = 1; j <= satir - i; j++) {
                System.out.print(" ");
            }

            // Sol yarıyı yazdır
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Sağ yarıyı yazdır
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println(); // Bir sonraki satıra geç
        }

    }
}
