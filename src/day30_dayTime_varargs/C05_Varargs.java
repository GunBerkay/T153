package day30_dayTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        topla(5,7);

        topla(1,3,5);

        topla(3,4,5,6,1);



    }

    private static void topla(int a, int b, int c) {
        System.out.println("Uc tamsayini toplami : "+(a+b+c));
    }

    public static void topla(int a,int b){
        System.out.println("Iki tamsayinin toplami: "+(a+b));
    }

    public static void topla(int... a){

        int toplam=0;
        for (int i = 0; i <a.length ; i++) {
            toplam+=a[i];
        }
        System.out.println("Verilen ");

    }

}
