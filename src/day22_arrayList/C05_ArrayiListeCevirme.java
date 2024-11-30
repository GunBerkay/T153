package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr={3,5,4,4,1,3,4,2,8,6,4,7,6,1,2,4,};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
           sayilar.add( arr[i]);
        }

        System.out.println("sayilar listesi : "+sayilar);

        sayilar.add(20);
        sayilar.remove(0);
        System.out.println("sayilar listesi : "+sayilar);


        List<Integer> arraydenList= Arrays.asList(arr);

        System.out.println("Method ile listeye donusturulen : "+arraydenList);





    }
}
