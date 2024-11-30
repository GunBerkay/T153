package day11_stringManipilations;

import java.util.Scanner;

public class C03_KullanimAdetiBulma {
    public static void main(String[] args) {

        //3- kullanicidan bir cumle arana bir metin parcasi isteyin kullanicin verdigi
//        metinlere gore asagidaki 3 cumlende birini yazdirin
//                -cumle arana metni icermiyor
//                -cumle arana metni sadece 1 adet iceriyor
//        -cumle arana metni birden fazla iceriyor

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String girilenCumle = scan.nextLine();

        System.out.println("Aranacak metbi giriniz");
        String aranacakMetin = scan.nextLine();

        int ilkIndex=girilenCumle.indexOf(aranacakMetin);
        int sonİndex=girilenCumle.lastIndexOf(aranacakMetin);

        if (ilkIndex==-1){
            System.out.println("cumle aranan metni icermiyor");
        } else if (ilkIndex==sonİndex) {
            System.out.println("cumle arana metni sadece 1 adet iceriyor");
        }else{
            System.out.println("cumle arana metni birden fazla iceriyor");
        }


    }
}
