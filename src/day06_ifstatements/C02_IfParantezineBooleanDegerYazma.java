package day06_ifstatements;

import java.util.Scanner;

public class C02_IfParantezineBooleanDegerYazma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();
        boolean sonuc = yas>=65;

        if (sonuc){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Enekli olamazsin");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini girin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        }










    }
}
