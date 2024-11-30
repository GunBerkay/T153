package day15_methosOlusturmaVeKullanma;

import java.util.Scanner;

public class C08_AradakiSayilariToplama {
    public static void main(String[] args) {
        System.out.println(aradakiSayilarinToplami(1, 4));

    }

    public static int aradakiSayilarinToplami(int baslangic, int bitis){
        int toplam=0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
        }
        else {
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;
            }
            System.out.println("Sayilarin toplami "+toplam);
        }
        return toplam;


    }
}
