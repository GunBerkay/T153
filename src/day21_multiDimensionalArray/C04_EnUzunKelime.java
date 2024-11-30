package day21_multiDimensionalArray;

public class C04_EnUzunKelime {
    public static void main(String[] args) {

        String[][] isimler={{"Yusuf","Emre","Faig"},{"Yigit","Sumeyra","Ahmet"}};

        String enUzunKelime=isimler[0][0];

        for (int i = 0; i < isimler.length; i++) {
            for (int j = 0; j < isimler[i].length; j++) {

                if (isimler[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=isimler[i][j];
                }
            }
        }
        System.out.println("Arreyde ki en uzun kelime "+enUzunKelime);


    }

    public static class C05_HarfinKullanimAdediniBulma {
        public static void main(String[] args) {




        }
    }
}
