package day19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEkleme {
    public static void main(String[] args) {

        // Verilen int bir array'e
// istenen bir elemani ekleyip
// yeni halini yazdirin

        int[] arr={3,4,5};
        int eklenecekSayi=8;

        arr=arrayeElemanEkle(arr,eklenecekSayi);
        arr=arrayeElemanEkle(arr,eklenecekSayi);
        System.out.println("arr in son hali : "+Arrays.toString(arr));


    }
    public static int[] arrayeElemanEkle(int[] arr, int eklenecekSayi){

        int[] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }

        yeniArr[yeniArr.length-1]=eklenecekSayi;

        arr=yeniArr;

        return arr;
    }

}
