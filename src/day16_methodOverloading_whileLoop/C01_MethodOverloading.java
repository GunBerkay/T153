package day16_methodOverloading_whileLoop;

public class C01_MethodOverloading {
    public static void main(String[] args) {
        ortalama(45,56);

        ortalama( 34.4,  76.7);



    }

    public static void ortalama(int a, int b){
        System.out.println("Girilen 2 tamsayinin =  "+ (a+b)/2);

    }
    public static void ortalama(double a, double b){
        System.out.println("Girilen 2 tamsayinin =  "+ (a+b)/2);
    }
    public static void ortalama(int sayi1){
        System.out.println("Girilen 2 tamsayinin =  "+ sayi1);
    }
}
