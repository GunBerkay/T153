package day14_nestefForLoops_methodKullanma;

import java.util.Scanner;

public class C07_KendiSubstringMethodumuz {
    public static void main(String[] args) {

        /*
    Kullanicidan baslangic ve bitis degerlerini alin
    ve baslangic index'i dahil, bitis index'i haric olacak sekilde
    str'daki baslangic ve bitis index'leri arasindaki karakterleri yazdirin
    - eger kullanicinin verdigi index'ler negatif veya str'in sinirlari disinda ise
      uyari mesaji yazdirin
    - baslangic degeri bitis degerinden buyuk olursa
      hata mesaji yazdirin
 */

        String str="Java her gecen gun daha da guzellesiyor";

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int baslangic= scan.nextInt();
        System.out.println("Bitis degeri giriniz");
        int bitis= scan.nextInt();

        if (baslangic<0 || bitis<0 || baslangic>str.length() || bitis>str.length()){
            System.out.println("Indexler metnin sinirlari icinde olmali");
        } else if (baslangic>bitis) {
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
            
        }else {
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
        }

        System.out.println(str.substring(baslangic, bitis));

        /*

         */

    }
}
