package day23_arrayList_foEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr={3,6,7,8};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];
        }
        System.out.println(toplam);


        List<String> isimler=new ArrayList<>(Arrays.asList("Yigit","Elif","Yusuf","Tugba"));

        toplam=0;

        for (int i = 0; i < isimler.size(); i++) {

            toplam+=isimler.get(i).length();

        }
        System.out.println("Isimlerdeki toplam harf sayisi : "+toplam);

        System.out.println(Arrays.toString(arr));

        toplam=0;

        for (int each :arr){
            toplam+=each;
        }
        System.out.println("arryde'ki sayilarin toplami "+toplam);


        System.out.println(isimler);
        toplam=0;
        for (String each :isimler){
            toplam+=each.length();
        }




    }
}
