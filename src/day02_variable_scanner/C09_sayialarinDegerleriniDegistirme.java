package day02_variable_scanner;

import java.util.Scanner;

public class C09_sayialarinDegerleriniDegistirme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1.tamsayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2.tamsayiyi giriniz");
        int sayi2 = scanner.nextInt();


        int temp = 0;
        temp = sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("İlk sayini degeri : " + sayi1 +
                "\nİkinci sayini degeri : " + sayi2);




    }
}
