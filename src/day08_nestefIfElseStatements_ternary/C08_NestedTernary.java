package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C08_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
        int sayi = scan.nextInt();


        System.out.println(
                sayi>0 ?
                        sayi %2==0 ? "cift sayi" : "tek sayi"
                        : sayi%3==0 ? "3un kati" : "3un kati degil"
        );



    }
}
