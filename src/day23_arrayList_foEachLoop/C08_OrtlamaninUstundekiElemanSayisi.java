package day23_arrayList_foEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtlamaninUstundekiElemanSayisi {
    public static void main(String[] args) {

        List<Double> notlar=new ArrayList<>(Arrays.asList(23.4, 67.8,12.1,98.0 ,87.5,78.3));
        System.out.println(notlar);

        double toplam=0;

        for (Double w:notlar){
            toplam+=w;
        }

        double ortalama=toplam/ notlar.size();

        int sayac=0;
        for (Double each :notlar){
            if (each < ortalama){
                sayac++;
            }
        }

        System.out.println("Ortalama not olan "+ortalama+" 'nin altinda "+sayac+" adet ogrenci var");


    }
}
