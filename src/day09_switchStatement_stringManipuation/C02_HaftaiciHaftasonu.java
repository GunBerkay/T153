package day09_switchStatement_stringManipuation;

import java.util.Scanner;

public class C02_HaftaiciHaftasonu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
            case 2:
                System.out.println("sali");
            case 3:
                System.out.println("carsamba");
            case 4:
                System.out.println("persembe");
            case 5:
                System.out.println("cuma");
                System.out.println("vee haftasonu");
                break;
            case 6:
            case 7:
                System.out.println("haftasonu");
                break;
            default:
        }









    }
}
