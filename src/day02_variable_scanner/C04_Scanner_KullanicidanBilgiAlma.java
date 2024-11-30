package day02_variable_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ismninizi giriniz...");
        String girilenIsim = scanner.nextLine();

        System.out.println("Girilen ismin buyuk harflerler yazilmis hali : " + girilenIsim.toUpperCase());





    }
}
