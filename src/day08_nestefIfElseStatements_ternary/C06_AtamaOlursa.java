package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C06_AtamaOlursa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("tamsayi giriniz");
        int sayi = scan.nextInt();

        sayi = sayi>0 ? sayi*2 : sayi-100;

        System.out.println("sayinin yeni degeri : " + sayi);

       sayi= sayi%2 == 0 ? sayi/2 : sayi*2;





    }
}
