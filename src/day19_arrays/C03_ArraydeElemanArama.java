package day19_arrays;

import java.util.Scanner;

public class C03_ArraydeElemanArama {
    public static void main(String[] args) {

        int[] sayilar = {1, 6, 8, 7, 5, 6, 8, 8, 8};

        elemanAra(sayilar,9);




}

public static void elemanAra(int[] sayilar, int arananSayi){
    int sayac = 0;

    for (int i = 0; i < sayilar.length; i++) {
        if (sayilar[i] == arananSayi){
            sayac++;
        }

    }

    if (sayac > 0) {
        System.out.println(arananSayi + " sayısı dizide " + sayac + " defa bulunmakta.");
    } else {
        System.out.println(arananSayi + " sayısı dizide bulunmamaktadır.");
    }

}


}
