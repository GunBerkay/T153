package day06_ifstatements;

import java.util.Scanner;

public class C06_TumSartlarinOrtakSonucunuBelirleme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayac = 0;

        if (sayi1<sayi2){
            System.out.println("birinci sayi daha buyuk");
            sayac++;
        }
        if (sayi1>0){
            System.out.println("birinci sayi pozitif");
            sayac++;
        }if (sayi2>50){
            System.out.println("ikinci sayi 50 den buyuk");
            sayac++;
        }if (sayi2%5==0){
            System.out.println("ikinci sayi 5 ile bolunebiliyor");
            sayac++;
        }if (sayac==4){
            System.out.println("Mukemmel sayi");
        }if(sayac==0){
            System.out.println("Nasil sayi sectiniz");
        }
        }

    }

