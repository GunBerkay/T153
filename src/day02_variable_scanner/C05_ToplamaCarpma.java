package day02_variable_scanner;

import java.util.Scanner;

public class C05_ToplamaCarpma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz...");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz...");
        int tamsayi = scan.nextInt();

        System.out.println("Sayilarin toplami : " + (ondalikliSayi+tamsayi));
        System.out.println("Sayilarin carpimi : " + (ondalikliSayi*tamsayi));

    }
}
