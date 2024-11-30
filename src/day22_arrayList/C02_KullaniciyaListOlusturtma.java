package day22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciyaListOlusturtma {
    public static void main(String[] args) {

        System.out.println(isimListOlustur());

    }

    public static List<String> isimListOlustur(){
        Scanner scan=new Scanner(System.in);
        List<String>isimList=new ArrayList<>();
        String girilenIsim="";

        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("Listeye eklemek icin bir isim girin\nBitirmek icin Q'ya basin");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimList.add(girilenIsim);
            }
        }
        return isimList;

    }
}
