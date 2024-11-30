package day03_dataCasting_wrapperClases;

public class C01_DataCasting {
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

//        byt = shrt;
//        byt = sayiInt;
//        byt = lng;
//        byt = flt;
//        byt = dbl;

        shrt = byt;
        //shrt = sayiInt;

        sayiInt = byt;
        sayiInt = shrt;
        //sayiInt = lng;




    }
}
