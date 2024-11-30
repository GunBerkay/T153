package day13_forLoop;

import java.util.Scanner;

public class C10_AsalMi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        String sonuc="Sayi asal";

        for (int i = 2; i <sayi ; i++) {
            if (sayi%2==0){
                sonuc="Sayi asal degil";
            }
        }
        System.out.println(sonuc);
    }
}
