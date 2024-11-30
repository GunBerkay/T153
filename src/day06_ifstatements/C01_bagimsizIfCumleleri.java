package day06_ifstatements;

import java.util.Scanner;

public class C01_bagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki adet tam sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1>sayi2){
            System.out.println("Ilk sayi daha buyuk");
        }
        if (sayi2 %2 == 0){
            System.out.println("ikinci sayi cift");
        }

        if (sayi1>100){
            System.out.println("sayilar cok guzel");
        }

        if (sayi2<0){
            System.out.println("negatif sayilari sevmem");
        }








    }
}
