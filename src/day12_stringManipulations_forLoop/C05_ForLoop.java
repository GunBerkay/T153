package day12_stringManipulations_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("");

        int toplam=0;
        for (int i = 1; i <5 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        System.out.println("");


        for (int i = 1220; i <1445 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        System.out.println("");


        for (int i = 100; i <=250 ; i+=17) {
            System.out.print(i+" ");
        }
        System.out.println("");

        for (int i = 100; i >0 ; i-=3) {
            System.out.print(i+" ");
        }
        System.out.println("");

        for (int i = 100; i <1000 ; i++) {
            if (i%137==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");

        for (int i = 23457; i <=26234 ; i++) {
            if (i%113==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");



    }
}
