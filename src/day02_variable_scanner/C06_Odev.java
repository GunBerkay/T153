package day02_variable_scanner;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {

       // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
       // Isminiz : John
      //  Soyisminiz : Doe
      //  Yasiniz : 44
      //  Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi  giriniz...");
        String girilenIsim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lutfen yasinizi girin");
        int girilenYas = scan.nextInt();

        System.out.println("Isminiz : " + girilenIsim +
                "\nSoyisminiz: " + girilenSoyisim +
                "\nYasiniz : " + girilenYas +
                "\nKaydiniz basariyla tamamlanmistir");

    }
}
