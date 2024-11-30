package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01_get_set {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(2,3,5,47,6,25,4));

        int toplam=0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+=sayilar.get(i);
        }
        System.out.println(toplam);

        System.out.println(sayilar.get(2) * sayilar.get(5));

        System.out.println("sayilar listesi : "+sayilar);

        sayilar.add(3,15);

        System.out.println(sayilar);

        sayilar.set(5,20);
        System.out.println(sayilar);

        System.out.println(sayilar.indexOf(2));
        System.out.println(sayilar.lastIndexOf(2));

        Collections.sort(sayilar);

        System.out.println(sayilar);


    }
}
