package day25_constructors;

public class C05_Araba {
    String marka="Marka atanmadi";
    String model="mmodel atanmadi";
    String yakit="Yakit atanmadi";
    int yil= 1900;
    int fiyat=0;

    public C05_Araba(String marka , String model , int fiyat){
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;

    }
     public C05_Araba(){

    }

    public C05_Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
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

    public static void main(String[] args) {




    }


}
