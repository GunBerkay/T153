package day03_dataCasting_wrapperClases;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        byt = (byte) shrt;
        byt = (byte) sayiInt;

        int sayi1 = 50;
        int sayi2 = 150;
        int sayi3 = 1500;

        byte byt1 = (byte) sayi1;
        byte byt2 = (byte) sayi2;
        byte byt3 = (byte) sayi3;

    }
}
