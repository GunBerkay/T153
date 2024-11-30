package day16_methodOverloading_whileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        ortalama(40,70);
        ortalama(45.7,67.8);
        ortalama(56,76.6);
        ortalama(45.7,67);
        ortalama(45.6F,34.7F);

        short sayi=46;

        ortalama(sayi,78);
        ortalama('a','b');


    }
    public static void ortalama(int a, int b){
        System.out.println("Girilen 2 tamsayinin =  "+ (a+b)/2);

    }
    public static void ortalama(double a, double b){
        System.out.println("Girilen 2 tamsayinin =  "+ (a+b)/2);
    }
    public static void ortalama(float a, int b){
        System.out.println("Float ve tamsayinin =  "+ (a+b)/2);
    }
    public static void ortalama(int a, double b){
        System.out.println("Girilen 2 tamsayinin ve ondalikli sayinin =  "+ (a+b)/2);
    }


}
