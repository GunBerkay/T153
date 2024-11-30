package day13_forLoop;

import java.util.Scanner;

public class C03_AradakiSayilariToplma {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         // Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner scan=new Scanner(System.in);
        System.out.println("Başlangıç değeri giriniz:");
        int baslangic= scan.nextInt();
        System.out.println("Bitiş değeri giriniz:");
        int bitis=scan.nextInt();
        int toplam=0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
            System.out.println("Sayilarin toplami: "+toplam);
        }else {
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;
            }
            System.out.println("Sayilarin toplami "+toplam);
        }



    }
}
