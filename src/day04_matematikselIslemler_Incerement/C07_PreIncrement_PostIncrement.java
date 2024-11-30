package day04_matematikselIslemler_Incerement;

public class C07_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 40;

        int b= a++;
        System.out.println("a : " + a + " b " + b );

        int c = 2* a + ++b;

        System.out.println("a : " + a + " b " + b +  " c  " + c );


        int k = 10;
        int m = 2*k--;

        System.out.println(k+" " + m);

        int p = --k + 2 * m ;

        System.out.println(k+ " " + m + " " + p );


    }
}
