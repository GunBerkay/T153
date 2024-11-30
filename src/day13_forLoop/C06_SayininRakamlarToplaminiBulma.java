package day13_forLoop;

import java.util.Scanner;

public class C06_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı giriniz:");
        int sayi= scan.nextInt();
        int basamakSayisi=(sayi+"").length();
        int rakamlarToplami=0;

        for (int i = 0; i <basamakSayisi ; i++) {
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        System.out.println(rakamlarToplami);





    }
}
