package day31_stringnuilder_accesmodiefer;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println("sb1 lengt : "+sb1.length());
        System.out.println("sb1 capacity : "+sb1.capacity());


        StringBuilder sb2=new StringBuilder(5);
        System.out.println("sb2 lengt : "+sb2.length());
        System.out.println("sb2 capacity : "+sb2.capacity());


        StringBuilder sb3=new StringBuilder("Ali Can");
        System.out.println("sb3 lengt : "+sb3.length());
        System.out.println("sb3 capacity : "+sb3.capacity());

        sb3.append(" Yanbatar");


    }
}
