package day08_nestefIfElseStatements_ternary;

import java.util.Scanner;

public class C09_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("rakam giriniz");
        int rakam = scan.nextInt();

        switch (rakam){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                    System.out.println("iki");
                    break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Gecersiz sayi");
                break;

        }


    }
}
