package day27_staticKeywprd_passByValue;

import day26_parametreliConstruclar_constructorCall.C03;

public class C03_StaticBlocks {
    C03_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");


    }

    static {
        System.out.println("static blok calisti");
    }

    public static void method1(){
        System.out.println("method1 calisti");
    }


}
