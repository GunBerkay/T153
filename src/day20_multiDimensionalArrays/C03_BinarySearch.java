package day20_multiDimensionalArrays;

import java.util.Arrays;

public class C03_BinarySearch {
    public static void main(String[] args) {

        int[] arr={3,11,5,0,8,29};

        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 29));
        System.out.println(Arrays.binarySearch(arr, 0));

        String[] srr={"K","Q","B","C","E"};
        Arrays.sort(srr);
        System.out.println(Arrays.binarySearch(srr, "S"));



    }
}
