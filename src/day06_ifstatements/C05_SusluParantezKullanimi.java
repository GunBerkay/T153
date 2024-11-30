package day06_ifstatements;

import java.util.Scanner;

public class C05_SusluParantezKullanimi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayi girinzi");
        int sayi = scan.nextInt();

        if (sayi%3==0){
            System.out.println("sayi 3 un tam kati");
        }
        if (sayi%5==0){
            System.out.println("sayi 5 in tam kati");
        }

        if (sayi%7==0){
            System.out.println("sayi 7 ile bolunuyor");
            System.out.println("guzel sayi");
        }



    }
}
