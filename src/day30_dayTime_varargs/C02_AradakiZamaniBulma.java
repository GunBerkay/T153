package day30_dayTime_varargs;

import java.time.Duration;
import java.time.LocalTime;

public class C02_AradakiZamaniBulma {
    public static void main(String[] args) {

        LocalTime baslangic=LocalTime.now();

        String str="";

        for (int i = 0; i <100000 ; i++) {
            str+=i;
        }

        LocalTime bitis=LocalTime.now();

        System.out.println("baslama zamani : " + baslangic);
        System.out.println("bitis zamani : " + bitis);

        // 1 .yontem duration ile aradaki zamani bulabiliriz
        System.out.println(Duration.between(baslangic, bitis));

        // 2.Yontem saniye olarak aradaki farki bulmak isterseniz

        System.out.println(baslangic.toSecondOfDay());




    }
}
