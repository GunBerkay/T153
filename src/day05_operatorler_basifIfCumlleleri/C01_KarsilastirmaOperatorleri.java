package day05_operatorler_basifIfCumlleleri;

import java.util.Scanner;

public class C01_KarsilastirmaOperatorleri {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(sayi % 2 ==0);

        System.out.println(sayi % 23 == 0);



        }

    }

