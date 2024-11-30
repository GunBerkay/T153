package day16_methodOverloading_whileLoop;

public class C06_RakamlarToplami {
    public static void main(String[] args) {

        int sayi = 12345;  // Örnek sayı
        int toplam = rakamlarToplaminiHesapla(sayi);
        System.out.println("Rakamların toplamı: " + toplam);

    }

    public static int rakamlarToplaminiHesapla(int sayi) {
        int toplam = 0;
        // Sayı sıfırdan büyük olduğu sürece döngü devam eder
        while (sayi > 0) {
            // Son basamağı alır ve toplama ekler
            toplam += sayi % 10;
            // Son basamağı çıkarmak için sayıyı 10'a böler
            sayi = sayi / 10;
        }
        return toplam;
}
}
