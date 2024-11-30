package day13_forLoop;

import java.util.Scanner;

public class C09_MetninTersiniKaydetme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String str= scan.nextLine();
        String tersStr="";

        for (int i = str.length(); i >=1 ; i--) {
            tersStr+=str.substring(i-1,i);
            str=tersStr;
        }
        System.out.println(tersStr);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Girilen metin PALINDROME");
        }else {
            System.out.println("Girilen metin Palindrome degil");
        }

    }
}
