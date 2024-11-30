package day07_ifElseifStatement_NestedIfElse;

import java.util.Scanner;

public class C01_bolunebilmeKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%3==0 && sayi%5==0) {
            System.out.println("mukemmel");
        }
        else if (sayi%3==0){
            System.out.println("3un kati");
        } else if (sayi%5==0) {
            System.out.println("5in kati");
        }
        else {
            System.out.println("kotu");
        }


    }
}
