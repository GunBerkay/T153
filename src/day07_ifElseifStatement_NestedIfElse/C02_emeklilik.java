package day07_ifElseifStatement_NestedIfElse;

import java.util.Scanner;

public class C02_emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi girin");
        int yas = scan.nextInt();

        if (yas<20 || yas>80){
            System.out.println("girilen yas icin emeklilik hesaplanamaz");
        }
         else if (yas>=65){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("emekli olmak icin daha " + (65-yas) + " yil daha calismalisin");
        }


    }
}
