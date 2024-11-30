package day25_constructors;

public class C02_Car {

    public C02_Car(String mrk, String mdl, String ykt, int yl, int fyt) {
        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;
    }

    public C02_Car() {

    }

    @Override
    public String toString() {
        return "Ozellikler " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat
                ;
    }

    String marka="Marka atanmadi";
    String model="mmodel atanmadi";
    String yakit="Yakit atanmadi";
    int yil= 1900;
    int fiyat=0;

}
