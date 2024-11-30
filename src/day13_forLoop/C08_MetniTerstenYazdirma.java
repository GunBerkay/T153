package day13_forLoop;

import java.util.Scanner;

public class C08_MetniTerstenYazdirma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String str = scan.nextLine();
        String tersStr="";

        for (int i = str.length(); i >=1 ; i--) {
            tersStr+=str.substring(i-1,i);
        }
        System.out.println(tersStr);

    }
}
