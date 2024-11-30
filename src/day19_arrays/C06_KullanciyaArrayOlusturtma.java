package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullanciyaArrayOlusturtma {
    public static void main(String[] args) {

        //Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.
        int[] kullanciArrayi=intArrayOlustur();
        System.out.println(Arrays.toString(kullanciArrayi));
        System.out.println(C04_PozitifSayilariToplama.pozitifSayilariTopla(kullanciArrayi));


    }


    public static int[] intArrayOlustur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arrayin boyutunu giriniz...");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Array'in " + i + ".indexi icin bir deger giriniz...");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

}
