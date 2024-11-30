package day10_stringManipulations;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

//        1- kullanicidan aldigimiz metinde 3 den fazla a harfi oldugunu biliyorsak
//        3.a nın ındex ini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine().toLowerCase();

        int birinciKullanim = metin.indexOf("a");
        int ikinciKullanim = metin.indexOf("a",birinciKullanim+1);
        int ucuncuKullanim = metin.indexOf("a",ikinciKullanim+1);


        System.out.println("3.a nin indexi " + ucuncuKullanim);

    }
}
//Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen bir metin girin");
//String text = scan.nextLine();
//
//int a1 = text.indexOf("a", 0);
//int a2 = text.indexOf("a", a1 + 1);
//int a3 = text.indexOf("a", a2 + 1);
//
//        if (a3 > a2) {
//
//        System.out.println("Girdiginiz metinde 3. a'nin indexi : " + a3);
//
//        } else System.out.println("Girdiginiz metinde 3. a harfi bulunmuyor");