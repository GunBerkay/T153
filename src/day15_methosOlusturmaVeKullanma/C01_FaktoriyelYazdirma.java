package day15_methosOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_FaktoriyelYazdirma {
    public static void main(String[] args) {

        faktoriyelYazdir(5);



    }

    public static void faktoriyelYazdir(int sayi){
        long carpim=1;
        for (int i = sayi; i >=1 ; i--) {
            carpim*=i;
        }
        System.out.println(sayi +"! = " + carpim);
    }
}
