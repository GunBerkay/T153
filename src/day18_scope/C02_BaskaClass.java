package day18_scope;

public class C02_BaskaClass {
    public static void main(String[] args) {

        System.out.println(C01_Hastane.hastaneismi);
        C01_Hastane.staticMethod();

        C01_Hastane pers1=new C01_Hastane();
        System.out.println(pers1.persAdresi);
        pers1.staticOlmayanMethod();

        C01_Hastane.bashekim="Aldemir";


    }

}
