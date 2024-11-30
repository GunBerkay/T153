package day15_methosOlusturmaVeKullanma;

import java.util.Scanner;

public class C10_MethodKullanma {
    public static void main(String[] args) {

        C01_FaktoriyelYazdirma.faktoriyelYazdir(8);

        C02_SayininRakamlarToplaminiBulma.rakamlarToplaminiYazdir(1453);

        C03_MetniTerstenYazdirma.metniTerstenYazdir("berkay gun");

        String isim="Nihat";
        String tersMetin = C04_PalindromeMu.metninTersiniDondur(isim);
        System.out.println(tersMetin);

        System.out.println(C04_PalindromeMu.metninTersiniDondur("Bu daha iyiymis"));


    }
}
