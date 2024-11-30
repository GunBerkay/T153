package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenmeyenIsimleriSilme {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Cem","Canan"));
        String istenmeyenHarf="C";

        for (int i = 0; i <isimler.size() ; i++) {
            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));
                i--;
            }
        }
        System.out.println(isimler);





    }

}
