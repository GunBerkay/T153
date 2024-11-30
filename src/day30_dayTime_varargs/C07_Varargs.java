package day30_dayTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kac tane argument yazarsak yazalim
// ilk argument haric geriye kalanlari toplayip
// bulunan toplam ile ilk argumanin carpimini yazdiran bir method olusturun

        islem(1,2,3,4,5,6,7);






    }

    public static void islem(int ilKEleman,int... geriyeKalanlar){
        int toplam=0;
        for (int i = 0; i <geriyeKalanlar.length ; i++) {
            toplam+=geriyeKalanlar[i];
        }

        System.out.println("islem sonucu : "+ilKEleman*toplam);

    }
}
