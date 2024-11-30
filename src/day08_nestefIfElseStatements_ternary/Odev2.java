package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

        // kullanicidan gun numarasini alin
        // sayi olarak girilen gunun ismini yazdirin
        // 1- pazartesi ..... 7-pazar
        // 1-7 arasi rakamlar disinda bir deger girilirse, hata mesaji verin

        Scanner scan = new Scanner(System.in);
        System.out.println("gun numarasini giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:{
                System.out.println("Gecerli gun numarasi giriniz");
            }
        }



    }
}
