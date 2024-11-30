package day29_mutable_ImmutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ImmutableClasess {

    public static void main(String[] args) {

        String isim="Canan";

        isim.toUpperCase();
        System.out.println(isim);

        isim.substring(1,3);
        System.out.println(isim);

        List<String> isimler=new ArrayList<>(Arrays.asList("Sumeyra","Yusuf","Faig","Canan"));
        System.out.println(isimler);

        isimler.remove(1);



    }
}
