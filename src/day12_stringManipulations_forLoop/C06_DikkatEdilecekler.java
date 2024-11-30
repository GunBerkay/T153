package day12_stringManipulations_forLoop;

public class C06_DikkatEdilecekler {
    public static void main(String[] args) {
        int toplam=0;


        for (int i = 100; i <=999 ; i++) {
            if (i%17==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);

        for (int i = 10; i < 0 ; i++) {
            System.out.println("Yasasin "+i);

        }




    }
}
