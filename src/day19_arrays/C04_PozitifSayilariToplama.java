package day19_arrays;

public class C04_PozitifSayilariToplama {
    public static void main(String[] args) {

        int[] sayilar = {1, -6, 8, 7, 5, -3, 2, 0};

        int toplam = pozitifSayilariTopla(sayilar);
        System.out.println("Dizideki pozitif tam sayıların toplamı: " + toplam);

    }
    public static int pozitifSayilariTopla(int[] sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            if (sayi > 0) {
                toplam += sayi;
            }
        }
        return toplam;
    }
}
