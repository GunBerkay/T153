package day09_switchStatement_stringManipuation;

import java.util.Scanner;

public class C04_mevsimler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ay numarasini giriniz");
        int ayNumarasi = scan.nextInt();

        switch (ayNumarasi){
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");

        }


    }
}
