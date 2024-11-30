package day07_ifElseifStatement_NestedIfElse;

import java.util.Scanner;

public class C05_kiloKontrolu {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kilonuzu girin");
        double kilo = scan.nextDouble();
        System.out.println("boyunuzu girin");
        int boy = scan.nextInt();
        double vki = kilo*10000/(boy*boy);
        if (vki>30){
            System.out.println("obez");
        } else if (vki>25) {
            System.out.println("kilolu");
        } else if (vki>20) {
            System.out.println("normal");
        }else {
            System.out.println("zayif");
        }

    }
}
