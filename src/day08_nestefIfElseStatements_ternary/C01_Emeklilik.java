package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C01_Emeklilik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        double yas = scanner.nextDouble();
        System.out.println("Cinsiyetinizi giriniz");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        if (cinsiyet=='K'){
            if (yas<20 || yas>80){
                System.out.println("Hatali giris yaptiniz");
            } else if (yas>=60) {
                System.out.println("60 yasindan buyuk kadinlar emekli olabilir");
            }else {
                System.out.println("Emekli olabilmek icin daha " +(60-yas) + " yil calismalisin.");
            }

        } else if (cinsiyet=='E') {
            if (yas<20 || yas>80){
                System.out.println("Hatali giris yaptiniz");
            } else if (yas>=65) {
                System.out.println("65 yasindan buyuk kadinlar emekli olabilir");
            }else {
                System.out.println("Emekli olabilmek icin daha " +(65-yas) + " yil calismalisin.");
            }


        }else {
            System.out.println("Cinsiyet icin K veya E secmelisiniz");
        }

    }
}
