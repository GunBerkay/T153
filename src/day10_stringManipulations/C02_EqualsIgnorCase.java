package day10_stringManipulations;

public class C02_EqualsIgnorCase {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str6 = "ali";
        String str7 = "ALI";
        String str8 = "ALİ";
        String str9 = "Ali";
        String str10 = "ALİ.";

        System.out.println(str1.equalsIgnoreCase(str6));
        System.out.println(str1.equalsIgnoreCase(str7));
        System.out.println(str1.equalsIgnoreCase(str8));
        System.out.println(str1.equalsIgnoreCase(str9));
        System.out.println(str1.equalsIgnoreCase(str10));






    }
}
