package day21_multiDimensionalArray;

import day19_arrays.C08_ArrayeElemanEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ArrayList {
    public static void main(String[] args) {

        int[] arr={5,7,9};

       arr = C08_ArrayeElemanEkleme.arrayeElemanEkle(arr,3);

        System.out.println(Arrays.toString(arr));

        List<Integer> sayilar=new ArrayList<>();


    }
}
