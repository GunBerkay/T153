package day24_constructors;

public class C04_Araba {

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


    public static void main(String[] args) {

    }
}
