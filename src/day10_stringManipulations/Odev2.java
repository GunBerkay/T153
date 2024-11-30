package day10_stringManipulations;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

//        2-kullanicidan aldıginiz bir metinde
//        3 veya daha fazla e olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String girilenMetin = scan.nextLine().toLowerCase();

        int birinIndex = girilenMetin.indexOf("e");
        int ikinciIndex = girilenMetin.indexOf("e",birinIndex+1);
        int ucuncuIndex = girilenMetin.indexOf("e",ikinciIndex+1);

        if (birinIndex>=0 && ikinciIndex>0 && ucuncuIndex>0){
            System.out.println("3 den fazla e vardir");
        }else {
            System.out.println("Girilen cumlede 3 den az e vardir");
        }



    }
}
