package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_MetniDuzenle {
    public static void main(String[] args) {

        // Kullanicidan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin girin");
        String metin = scanner.nextLine();

        int metinUzunlugu=metin.length();

        if (metinUzunlugu%2==0){
            System.out.println(metin.substring(0,metinUzunlugu/2)+":)"+metin.substring(metinUzunlugu/2));
    }
        else {
            System.out.println(metin.substring(0,metinUzunlugu/2)+":("+metin.substring(metinUzunlugu/2));
        }
    }
}
