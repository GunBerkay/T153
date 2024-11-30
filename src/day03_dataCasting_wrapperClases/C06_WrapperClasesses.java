package day03_dataCasting_wrapperClases;

import java.util.Scanner;

public class C06_WrapperClasesses {
    public static void main(String[] args) {

        String str = "Java Candir";

        int sayi = 20;

        String fiyat1 = "23.44";
        String fiyat2 = "45.18";

        System.out.println(fiyat1+fiyat2);

        System.out.println(Double.parseDouble(fiyat1) + Double.parseDouble(fiyat2));


        fiyat1 ="34";
        fiyat2 = "41";

        System.out.println(Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2));

        char k1 = 'd';
        System.out.println(Character.toUpperCase(k1));

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char karakter = scanner.next().charAt(0);

        System.out.println(Character.isLetter(karakter));//harf mi?

        System.out.println(Character.isDigit(karakter));

        System.out.println(Character.isUpperCase(karakter));

        System.out.println(Character.isAlphabetic(karakter));




    }
}
