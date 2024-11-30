package day25_constructors;

public class C01_DefaultConstructorsKullanimi {

    String isim="isim atanmamis";
    int yas=40;
    String adres="Yenimahalle";



    public static void main(String[] args) {

        C01_DefaultConstructorsKullanimi obj1=new C01_DefaultConstructorsKullanimi();

        System.out.println(obj1.yas);
        System.out.println(obj1.adres);
        System.out.println(obj1.isim);

        obj1.isim="Yigit";
        obj1.adres="Romanya";

        System.out.println(obj1.yas);
        System.out.println(obj1.adres);
        System.out.println(obj1.isim);

        C01_DefaultConstructorsKullanimi obj2=new C01_DefaultConstructorsKullanimi();

        obj2.isim="Murat";
        obj2.yas= 32;
        obj2.adres= "Cankaya";



    }
}
