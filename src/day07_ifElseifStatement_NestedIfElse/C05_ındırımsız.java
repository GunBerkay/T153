package day07_ifElseifStatement_NestedIfElse;

import java.util.Scanner;

public class C05_ındırımsız {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("urun adedini girin");
        int urunAdedi = scanner.nextInt();
        System.out.println("Indirimsiz fiyatini girin");
        double urunfiyat = scanner.nextDouble();
        System.out.println("Musteri kartiniz var mi");
        char kart = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunfiyat*urunAdedi;

        if (kart == 'E' && urunAdedi>10){
            System.out.println("%20 indirimli fiyat : " + indirimsizToplamFiyat*80/100);
        } else if (kart=='E' && urunAdedi<=10) {
            System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100 );
        } else if (kart=='H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
        } else if (kart=='H' && urunAdedi<=10) {
            System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat*90/100);
        }

    }
}
