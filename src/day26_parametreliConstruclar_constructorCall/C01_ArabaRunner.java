package day26_parametreliConstruclar_constructorCall;

import day25_constructors.C05_Araba;

public class C01_ArabaRunner {
    public static void main(String[] args) {

        C05_Araba araba1=new C05_Araba();
        System.out.println(araba1);

        C05_Araba araba2=new C05_Araba("Audi","Q5",20000);
        System.out.println(araba2);

        C05_Araba araba3=new C05_Araba("Opel","Corsa",40000);
        System.out.println(araba3);


    }
}
