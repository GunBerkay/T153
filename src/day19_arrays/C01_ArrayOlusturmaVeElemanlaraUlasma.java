package day19_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeElemanlaraUlasma {
    public static void main(String[] args) {



        int[] arr ={5,6,7,9};
        String[] isimler=new String[5];

        System.out.println(arr[2]);
        System.out.println(arr[0]);

        System.out.println(arr[1]+arr[2]);

        int[] sayilar={10,11,41,45};
        System.out.println(sayilar[2]);
        sayilar[1]=40;
        sayilar[3]=20;

        System.out.println(Arrays.toString(sayilar));

        String str="Java Candir";
        String[] kelimeler={"e","r","t"};
        System.out.println(str.length());
        System.out.println(kelimeler.length);





    }
}
