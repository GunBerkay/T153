package day04_matematikselIslemler_Incerement;

import java.util.Scanner;

public class C02_mamtemetik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi aliniz");

        int girilenSayi = scanner.nextInt();

        int toplam = 0;

        int birlerBasamagi = girilenSayi %10;

        toplam = toplam + birlerBasamagi;
        girilenSayi = girilenSayi /10;

        birlerBasamagi = girilenSayi %10;
        toplam = toplam + birlerBasamagi;

        girilenSayi = girilenSayi/10;



    }
}
