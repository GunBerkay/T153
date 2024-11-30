package day15_methosOlusturmaVeKullanma;

public class C07_BelirliAraliktakiAsalSayilariYazdirma {
    public static void main(String[] args) {

        for (int i = 100; i <=999 ; i++) {

            if (C06_AsalMiDondur.isAsal(i)==true){
                System.out.print(i+" ");
            }
        }

    }

}
