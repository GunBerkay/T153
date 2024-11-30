package day15_methosOlusturmaVeKullanma;

import java.util.Scanner;

public class C02_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        rakamlarToplaminiYazdir(123);


    }

    public static void rakamlarToplaminiYazdir(int sayi){
        int basamakSayisi=(sayi+"").length();
        int rakamlarToplami=0;

        for (int i = 0; i <basamakSayisi ; i++) {
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        System.out.println("Verilen sayinin rakamlar toplami : "+ rakamlarToplami);


    }

}
