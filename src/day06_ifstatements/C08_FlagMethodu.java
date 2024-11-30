package day06_ifstatements;

import java.util.Scanner;

public class C08_FlagMethodu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int flag = 24;

        if (sayi1 < sayi2) {
            System.out.println("birinci sayi daha buyuk");
            flag=34;
        }
        if (sayi1 > 0) {
            System.out.println("birinci sayi pozitif");
            flag=34;
        }
        if (sayi2 > 50) {
            System.out.println("ikinci sayi 50 den buyuk");
            flag=34;
        }
        if (sayi2 % 5 == 0) {
            System.out.println("ikinci sayi 5 ile bolunebiliyor");
            flag=34;
        }if (flag==24){
            System.out.println("Nasil sayi sectiniz");
        }


    }}