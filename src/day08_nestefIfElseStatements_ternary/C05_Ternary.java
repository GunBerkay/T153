package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk", degilse "ikinci sayi 50'den buyuk degil"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati", degilse "ikinci sayi 5'in tam kati degil"

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        System.out.println(sayi1<sayi2 ? "birinci sayi daha kucuk" : "birinci sayi daha kucuk degil");

        System.out.println(sayi1>0 ? "birinci sayi sifirdan buyuk" : "birinci sayi sıfırdan buyuk degil");

        System.out.println(sayi2>50 ? "ikinci sayi 50'den buyuk" : "ikinci sayi 50'den buyuk degil");

        System.out.println(sayi2%5==0 ? "ikinci sayi 5'in tam kati" : "ikinci sayi 5'in tam kati degil");



    }
}
