package day23_arrayList_foEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C07_EnKisaKelimeyiBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle=scan.nextLine();

        String[] kelimeler=cumle.split(" ");

        System.out.println(Arrays.toString(kelimeler));

        String enKisaKelime=kelimeler[0];

        for (String each:kelimeler){
            if (each.length()<enKisaKelime.length()){
                enKisaKelime=each;
            }
        }

        System.out.println("Girilen cumledeki en kisa kelime : "+enKisaKelime);

    }
}
