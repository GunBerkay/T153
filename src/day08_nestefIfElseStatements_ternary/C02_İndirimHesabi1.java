package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C02_İndirimHesabi1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("urun adedini girin");
        int urunAdedi = scanner.nextInt();
        System.out.println("Indirimsiz fiyatini girin");
        double urunfiyat = scanner.nextDouble();
        System.out.println("Musteri kartiniz var mi");
        char kart = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunfiyat*urunAdedi;

        if (kart=='E'){

            if (urunAdedi<0 || urunfiyat<=0){
                System.out.println("Hatali giris");
            } else if (urunAdedi==0) {
                System.out.println("Bizi tercih ettiginiz icin tesekkurler");
            } else if (urunAdedi>10) {
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }

        } else if (kart=='H') {
            if (urunAdedi<0 || urunfiyat<=0){
                System.out.println("Hatali giris");
            } else if (urunAdedi==0) {
                System.out.println("Bizi tercih ettiginiz icin tesekkurler");
            } else if (urunAdedi>10) {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }else {
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat*90/100);
            }


        }else {
            System.out.println("Hatali giris yaptiniz");
        }


    }
}
