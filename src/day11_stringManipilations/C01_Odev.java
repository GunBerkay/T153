package day11_stringManipilations;

import java.util.Scanner;

public class C01_Odev {
    public static void main(String[] args) {


        String metin = "Ali topu at, at ali at.";

        int birinciIndex = metin.indexOf('a');
        int ikinciIndex = metin.indexOf('a',birinciIndex+1);
        int ucuncuIndex = metin.indexOf('a',ikinciIndex+1);
        System.out.println("3.a nin indexi "+ucuncuIndex);









    }
}
