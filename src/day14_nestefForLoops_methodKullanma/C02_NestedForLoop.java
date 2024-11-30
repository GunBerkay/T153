package day14_nestefForLoops_methodKullanma;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir= scan.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i+j-1+" ");
            }
            System.out.println("");

        }


    }
}
