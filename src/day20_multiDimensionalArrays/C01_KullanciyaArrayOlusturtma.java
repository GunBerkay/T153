package day20_multiDimensionalArrays;

import day19_arrays.C06_KullanciyaArrayOlusturtma;
import day19_arrays.C08_ArrayeElemanEkleme;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullanciyaArrayOlusturtma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz uzunlugunu girin ");
        int arrLength=scan.nextInt();

        int[] arr=new  int[1];
        System.out.println("Lutfen array'in ilk elemanini girin ");
        arr[0]=scan.nextInt();

        for (int i = 1; i < arrLength; i++) {
            System.out.println("arr e eklemek uzere bir tamsayi girin");
            int eklenecekSayi=scan.nextInt();
            arr= C08_ArrayeElemanEkleme.arrayeElemanEkle(arr,eklenecekSayi);
        }

        System.out.println("Olusturdugunuz arr : " + Arrays.toString(arr));








    }

}
