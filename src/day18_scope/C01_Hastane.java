package day18_scope;

public class C01_Hastane {
    static String hastaneismi="Java Hastanesi";
    static String hastaneTel="03122343434";
    static String hastaneAdresi="Cankaya";
    static String bashekim="Dr Yusuf";

    String persIsmi="Isim atanmadi";
    String persTel="Telefon atanmadi";
    String persAdresi="Adres atanmadi";

    public static void main(String[] args) {

        System.out.println(hastaneismi);
        System.out.println(hastaneTel);
        System.out.println(hastaneAdresi);
        System.out.println(bashekim);

        hastaneAdresi="Yenimahalle";
        System.out.println(hastaneAdresi);


//        System.out.println(persIsmi);
//        System.out.println(perTel);
//        System.out.println(perAdresi);

        C01_Hastane pers1=new C01_Hastane();
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persTel);
        System.out.println(pers1.persAdresi);

        pers1.persIsmi="Aldemir";
        pers1.persTel="5325323232";
        pers1.persAdresi="Cevizlidere";

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persTel);
        System.out.println(pers1.persAdresi);

        C01_Hastane pers2=new C01_Hastane();
        System.out.println(pers2.persIsmi);
        System.out.println(pers2.persTel);
        System.out.println(pers2.persAdresi);

        pers2.persIsmi="Yigit";
        pers2.persTel="56434525";
        pers2.persAdresi="Balgat";

        System.out.println(pers1.persIsmi);
        System.out.println(pers2.persIsmi);

        C01_Hastane pers3=new C01_Hastane();
        pers3.persIsmi="Mehmet";
        pers3.persTel="5642131";
        pers3.persAdresi="Saskatoon";

        System.out.println(pers1.persIsmi);
        System.out.println(pers2.persIsmi);
        System.out.println(pers3.persIsmi);

        pers3.bashekim="Dr. Canan";
        System.out.println(pers3.bashekim);

        System.out.println(pers1.bashekim);
        System.out.println(pers2.bashekim);
        System.out.println(pers3.bashekim);

        pers2.hastaneAdresi="Balgat";

        System.out.println(pers1.hastaneAdresi);
        System.out.println(pers2.hastaneAdresi);
        System.out.println(pers3.hastaneAdresi);
        System.out.println(hastaneAdresi);










    }

    public static void staticMethod(){

    }

    public void staticOlmayanMethod(){

    }
}
