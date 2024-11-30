package day11_stringManipilations;

import java.util.Scanner;

public class C09_MetniTemizleme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = scan.nextLine();

        metin=metin.replaceAll("\\s+"," ");
        metin=metin.replaceAll("\\d","");
        metin=metin.replaceAll("\\W","");

        metin=metin.replace(" ","4");
        metin=metin.replace("4"," ");

        metin=metin.substring(0,1).toUpperCase() +
                metin.substring(1).toLowerCase();
        if (metin.charAt(metin.length()-1)!= '.'){
            metin+=".";
        }




        System.out.println("Metnin son hali : " + metin);













    }
}
