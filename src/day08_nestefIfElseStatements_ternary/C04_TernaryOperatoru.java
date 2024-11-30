package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C04_TernaryOperatoru {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");

        System.out.println(sayi>99 && sayi<1000 ? "3 basamakli" : "3 basamakli degil");



    }
}
