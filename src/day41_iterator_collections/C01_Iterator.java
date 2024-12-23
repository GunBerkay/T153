package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(3,8,2,4,5,6,2,1));

        int toplam=0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);

        }

        System.out.println("Elemanlarin toplami for loop : " + toplam);

        toplam=0;

        for (Integer each : sayilar){
            toplam+=each;

        }
        System.out.println("Elemanlarin toplami for each loop : " + toplam);


        for (int i = 0; i < sayilar.size(); i++) {

            int eskiDeger = sayilar.get(i);

            sayilar.set(i,eskiDeger+1);

        }

        System.out.println(sayilar);


        List<Integer> numaralar = new ArrayList<>(Arrays.asList(4,5,7,3,9));

        Iterator iterator=numaralar.iterator();
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());

        iterator.remove();


    }
}
