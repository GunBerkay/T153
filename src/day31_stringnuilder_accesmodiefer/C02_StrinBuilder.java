package day31_stringnuilder_accesmodiefer;

public class C02_StrinBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Ali");

        sb.append(" Can");
        sb.append(" Yataruyumaz");

        System.out.println(sb);

        String str="Java Candir";
        sb.append(str,4,11);

        System.out.println(sb);

        sb.deleteCharAt(20);

        System.out.println(sb);

        sb.delete(19,24);
        System.out.println(sb);

        sb.insert(7,"er");
        System.out.println(sb);




    }
}
