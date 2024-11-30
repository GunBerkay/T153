package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C04_SifreKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifre giriniz");
        String sifre = scan.nextLine();

        int sayac=0;
        if (!Character.isLowerCase(sifre.charAt(0))){
            System.out.println("Ilk harf kucuk olmali");
        }if (!Character.isDigit(sifre.charAt(sifre.length()-1))){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }if (sifre.length()<10){
            System.out.println("sıfrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }if (sayac==0){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
