package day15_methosOlusturmaVeKullanma;

public class C04_PalindromeMu {
    public static void main(String[] args) {

        ispalindrome("madam");


    }

    public static void ispalindrome(String metin){

        String tersMetin = metninTersiniDondur(metin);
        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girdiginiz metin palindrome");
        }else System.out.println("Girdiginiz metin palindrome degil");

    }

    public static String metninTersiniDondur(String metin){
        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }
        return tersMetin;
    }

}
