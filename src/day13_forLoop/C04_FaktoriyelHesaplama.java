package day13_forLoop;

import java.util.Scanner;

public class C04_FaktoriyelHesaplama {
    public static void main(String[] args) {

        // Kullanicidan 18’den kucuk bir sayi alip,
// bu sayinin faktoryel degerini hesaplayin.
//  5! = 5 * 4 * 3 * 2 * 1 => 120

        Scanner scan=new Scanner(System.in);
        System.out.println("18 de kucuk bir sayi giriniz");
        int girilenSayi=scan.nextInt();
        int faktoriyel=1;

        if (girilenSayi<18){
            for (int i = 1; i <=girilenSayi ; i++) {
                faktoriyel*=i;
            }
            System.out.println("Girilen sayinin faktoryel degeri: "+faktoriyel);
        }else System.out.println("Yanlis giris yaptiniz");
    }
}
