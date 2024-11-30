package day26_parametreliConstruclar_constructorCall;

public class C02 {
    C02(){
        System.out.println("parametresiz constructor calisti");
    }

    C02(int a){
        System.out.println("int parametreli constructor calisti");
    }
    C02(String b){
        System.out.println("String parametreli constructor calisti");
    }
    C02(boolean bl){
        System.out.println("boolean parametreli constructor calisti");
    }


    void C02(){
        System.out.println("parametresiz method calisti");
    }

    void C02(int sayi){
        System.out.println(" int parametreli method calisti");
    }

    void C02(String str){
        System.out.println(" String parametreli method calisti");
    }

    public static void main(String[] args) {

        C02 obj=new C02();
        obj.method1();

    }

    public void method1(){
        System.out.println("method1 calisti");
        new C02(3);

        C02("Ali");

        //C02(true);

    }


}
