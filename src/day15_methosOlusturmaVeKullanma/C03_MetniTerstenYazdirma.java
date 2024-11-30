package day15_methosOlusturmaVeKullanma;

public class C03_MetniTerstenYazdirma {
    public static void main(String[] args) {

        metniTerstenYazdir("Berkay");
    }

    public static void metniTerstenYazdir(String metin){

        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));
        }
        System.out.println("");

    }
}
