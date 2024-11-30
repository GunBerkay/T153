package day14_nestefForLoops_methodKullanma;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=4 ; j++) { // her bir satirdaki sütünlari kontrol eder

                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
}
