package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        // Kullanicidan bir rakam isteyim ( 0 - 9)
        // kullanicinin rakam olarak girdigi degeri
        // metin olarak yazdirin
        // orn : kullanici 7'ye basarsa, "Girilen rakam : yedi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int girilenRakam = scan.nextInt();

        if (girilenRakam==0){
            System.out.println("Girilen rakam : sifir");
        } else if (girilenRakam==1) {
            System.out.println("Girilen rakam : bir");
        } else if (girilenRakam==2) {
            System.out.println("Girilen rakam : iki");
        } else if (girilenRakam==3) {
            System.out.println("Girilen rakam : uc");
        } else if (girilenRakam==4) {
            System.out.println("Girilen rakam : dort");
        } else if (girilenRakam==5) {
            System.out.println("Girilen rakam : bes");
        } else if (girilenRakam==6) {
            System.out.println("Girilen rakam : alti");
        } else if (girilenRakam==7) {
            System.out.println("Girilen rakam : yedi");
        } else if (girilenRakam==8) {
            System.out.println("Girilen rakam : sekiz");
        } else if (girilenRakam==9) {
            System.out.println("Girilen rakam : dokuz");
        }else {
            System.out.println("Gecersiz bir rakam girdiniz");
        }


    }
}
