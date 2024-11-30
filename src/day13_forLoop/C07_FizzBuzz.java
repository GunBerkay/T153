package day13_forLoop;

import java.util.Scanner;

public class C07_FizzBuzz {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz: ");
        int girilenSayi= scan.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%3==0&&i%5==0){
                System.out.println((" fizzBuzz"));
            } else if (i%5==0) {
                System.out.println(" buzz ");
            } else if (i%3==0) {
                System.out.println(" fizz ");
            }else {
                System.out.println(i+" ");
            }
        }

    }
}
