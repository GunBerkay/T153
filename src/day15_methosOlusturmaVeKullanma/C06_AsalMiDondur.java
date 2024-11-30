package day15_methosOlusturmaVeKullanma;

public class C06_AsalMiDondur {
    public static void main(String[] args) {

        System.out.println(isAsal(23));


    }

    public static boolean isAsal(int sayi){
        boolean sonuc=false;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                sonuc=false;
                break;
            }
            if (i==sayi-1){
                sonuc=true;
            }
        }
        return sonuc;
    }
}
