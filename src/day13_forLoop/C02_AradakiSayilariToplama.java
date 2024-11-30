package day13_forLoop;

import java.util.Scanner;

public class C02_AradakiSayilariToplama {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int baslangic= scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bitis=scan.nextInt();
        int toplam=0;
        if (bitis<baslangic){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmamalidir");
        }else {
            for (int i = baslangic; i <=baslangic ; i++) {
                toplam+=i;
            }
            System.out.println("Girilen sayilarin toplami: " + toplam);
        }

    }
}
