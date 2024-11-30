package day17_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Basalngic ve bitis icin harf giriniz: ");
        char baslangic=scan.next().charAt(0);
        char bitis=scan.next().charAt(0);

        for (char i = baslangic; i <=bitis ; i++) {
            System.out.println(i+" ");
        }
        System.out.println("");


        char harf=baslangic;
        while (harf<=bitis){
            System.out.println(harf+" ");
            harf++;
        }
        System.out.println("");

        harf=baslangic;
        do {
            System.out.println(harf+" ");
            harf++;
        }while (harf<=bitis);


    }
}
