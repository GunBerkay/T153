package day19_arrays;

public class C02_ArrayinTumElemanlarinaUlasma {
    public static void main(String[] args) {

        int[] sayilar={1,6,8,7,5};

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("Tum elemanlarin toplami : " + toplam);


        int sayac=0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2==0){
                sayac++;
            }


        }
        System.out.println("cift sayi adedi : " + sayac);



        toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2!=0){
                toplam+=sayilar[i];
            }
        }
        System.out.println("Tek sayi adedi : " + sayac);


        int enBuyuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>enBuyuk){
                enBuyuk=sayilar[i];
            }
        }
        System.out.println("En buyuk sayi : " + enBuyuk);





    }
}
