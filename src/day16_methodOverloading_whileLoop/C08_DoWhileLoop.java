package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C08_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayiAdedi = 0;

        while (true) {
            System.out.println("Lütfen bir tamsayı girin (Çıkmak için '0' basın):");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break; // Kullanıcı '0' bastığında döngüden çıkar.
            }

            toplam += sayi;
            sayiAdedi++;
        }

        System.out.println("Girilen sayı adedi: " + sayiAdedi);
        System.out.println("Girilen sayıların toplamı: " + toplam);


    }
}
