package day30_dayTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        islem(1,2,3,4,5,6,7);



    }

    public static void islem(int...tumSayilar){
        int toplam=0;
        for (int i = 0; i <tumSayilar.length-1 ; i++) {
            toplam+=tumSayilar[i];
        }
        System.out.println(tumSayilar[tumSayilar.length-1]*toplam);

    }
}
