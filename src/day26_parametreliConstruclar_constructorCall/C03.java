package day26_parametreliConstruclar_constructorCall;

public class C03 {
    C03(){
        this(5);
        System.out.println("parametresiz constructor calisti");
    }

    C03(int a){
        System.out.println("int parametreli constructor calisti");
    }


    public static void main(String[] args) {

        C03 obj1=new C03(5);

        C03 obj2=new C03();


    }
}
