package day17_doWhileLoop_scope;

public class C06_ınstanceVariabler {

    static  String strS="Hava";
    static int sayiS;
    static char chrS='t';
    static  boolean blS;

    String strI;
    int sayiI;
    char chrI;
    boolean blI;

    public static void main(String[] args) {

        C06_ınstanceVariabler obj=new C06_ınstanceVariabler();
        System.out.println(obj.strI);
        System.out.println(obj.chrI);
        System.out.println(obj.sayiI);
        System.out.println(obj.blI);




    }
}
