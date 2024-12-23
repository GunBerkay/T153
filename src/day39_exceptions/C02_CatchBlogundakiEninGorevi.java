package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");


        int sayi1= 0;
        int sayi2= 0;

        try {
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2==0){
                System.out.println("2.sayi 0 olmaz");
            }

            else System.out.println("Sayilarin bolumu : " + sayi1/sayi2);

        } catch (InputMismatchException e) {

            System.out.println("Tamsayi Girmelisiniz...");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();

        }


    }
}
