package day02_variable_scanner;

import java.util.Scanner;

public class C07_Odev2 {

    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
       // girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi  giriniz...");
        String girilenIsim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lutfen yasinizi girin");
        int girilenYas = scan.nextInt();

        System.out.println(
                "girilen bilgiler: " + girilenIsim.toUpperCase().charAt(0) +
                        " " + girilenSoyisim +
                        ", " + girilenYas
        );
    }
}
