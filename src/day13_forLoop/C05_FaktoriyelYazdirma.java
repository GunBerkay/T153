package day13_forLoop;

import java.util.Scanner;

public class C05_FaktoriyelYazdirma {
    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan=new Scanner(System.in);
        System.out.println("17 den küçük bir sayi giriniz:");
        int girilenSayi= scan.nextInt();
        int faktoriyel=1;
        String aradakiler="";

        for (int i = girilenSayi; i >=1 ; i--) {
            faktoriyel*=i;
            aradakiler+=i;

            if (i != 1){
                aradakiler+=" * ";
            }
        }
        System.out.println(girilenSayi+"!="+aradakiler+"= "+faktoriyel);
    }
}
