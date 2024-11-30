package day28_passByValue;

public class C01_PassByValue {


    public static void main(String[] args) {

        int sayi=20;
        kareYazdir(sayi);

        int a=10;
        kareYazdir(a);





    }

    public static void kareYazdir(int sayi){
        sayi=sayi*sayi;
        System.out.println(sayi);

    }

}
