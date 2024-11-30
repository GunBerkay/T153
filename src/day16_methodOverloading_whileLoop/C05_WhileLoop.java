package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayiAdedi = 0;

        while (toplam < 500) {
            System.out.println("Lütfen toplamak üzere pozitif bir tam sayı girin:");
            int sayi = scanner.nextInt();

            if (sayi > 0) {
                toplam += sayi;
                sayiAdedi++;
            } else {
                System.out.println("Lütfen pozitif bir tam sayı girin. 0 veya negatif sayılar kabul edilmez.");
            }
        }

        System.out.println("Toplam sınırı geçtiniz!");
        System.out.println("Girilen pozitif sayı adedi: " + sayiAdedi);
        System.out.println("Sayıların toplamı: " + toplam);



    }


}
