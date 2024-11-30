package day14_nestefForLoops_methodKullanma;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j-1+" ");
            }
            System.out.println("");

        }


    }
}
