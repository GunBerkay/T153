package day17_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoopVsDoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        int sayac=0;

        do{
            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            girilenSayi=scan.nextInt();
            if (girilenSayi !=0){
                toplam+=girilenSayi;
                sayac++;
            }

        }while (girilenSayi!=0);

        System.out.println("Girilen " + sayac + " sayi toplami: " + toplam);



    }
}
