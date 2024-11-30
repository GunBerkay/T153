package day07_ifElseifStatement_NestedIfElse;

import java.util.Scanner;

public class C03_Sondaelseolamzsa {
    public static void main(String[] args) {
        // kullanicidan bir cumle isteyin
// cumlede ev geciyorsa "Ev gibisi yok" ,
// cumlede is geciyorsa "Calismadan olmaz"
// cumlede hem is hem ev geciyorsa "Senden krali yok" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bır cumle giriniz");
        String girilenCumle = scan.nextLine().toLowerCase();

        if (girilenCumle.contains("is") && girilenCumle.contains("ev")){
            System.out.println("Senden krali yok");
        } else if (girilenCumle.contains("ev")) {
            System.out.println("Ev gibisi yok");
        } else if (girilenCumle.contains("is")) {
            System.out.println("Calismadan olmaz");
        }


    }
}
