package day34_inheritance;

public class C03_Child extends C02_P{

    C03_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }
    C03_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }
    C03_Child(int a){
        // super();
        System.out.println("C int parametreli constructor calisti");
    }

    public static void main(String[] args) {
        //C03_Child child1 = new C03_Child();

        //C03_Child child2=new C03_Child("a");

        C03_Child child3=new C03_Child(25);


    }

}
