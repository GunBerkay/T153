package day24_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {


    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        Random rnd=new Random();


        C02_Hemsire hemsire1=new C02_Hemsire();
        hemsire1.isim="Canan";
        hemsire1.adres="Balgat";

        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.adres);
        System.out.println(hemsire1.tel);


        C02_Hemsire hemsire2=new C02_Hemsire();

        hemsire2.isim="Sumeyra";


        System.out.println(new C02_Hemsire().isim);

        C02_Hemsire hemsire3;
        C02_Hemsire hemsire4=null;
        System.out.println(hemsire4.isim);



    }
}
