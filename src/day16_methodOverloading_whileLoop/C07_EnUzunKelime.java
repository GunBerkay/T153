package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_EnUzunKelime {
    public static void main(String[] args) {
        String enUzunKelime = enUzunKelimeyiBul();
        System.out.println("Girilen en uzun kelime: " + enUzunKelime);

    }

    public static String enUzunKelimeyiBul() {
        Scanner scanner = new Scanner(System.in);
        String enUzunKelime = "";
        String girilenKelime;

        while (true) {
            System.out.println("Lütfen bir kelime girin (Çıkmak için 'Q' ya da 'q' basın):");
            girilenKelime = scanner.next();
            // Kullanici Q ya da q bastiginda döngüyü kır.
            if (girilenKelime.equalsIgnoreCase("Q")) {
                break;
            }
            // Girilen kelimenin uzunluğunu kontrol et ve gerekirse en uzun kelimeyi güncelle.
            if (girilenKelime.length() > enUzunKelime.length()) {
                enUzunKelime = girilenKelime;
            }
        }

        return enUzunKelime;
    }



}
