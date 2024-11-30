package day15_methosOlusturmaVeKullanma;

public class C05_FaktoriyelDondur {
    public static void main(String[] args) {

        faktoriyelDondur(5);

        long faktoriyel7=faktoriyelDondur(7);
        System.out.println(faktoriyel7);

    }

    public static long faktoriyelDondur(int sayi){
        long carpim=1;
        for (int i = sayi; i >=1 ; i--) {
            carpim*=i;
        }
     return carpim;
    }

}
