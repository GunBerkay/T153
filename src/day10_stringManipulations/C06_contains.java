package day10_stringManipulations;

public class C06_contains {
    public static void main(String[] args) {

        String str = "Bugun cok ama cok mutluyum";

        System.out.println(str.contains("u"));

        System.out.println(str.contains("b"));

        System.out.println(str.contains("cok ama"));

        System.out.println(str.contains("n a"));

        System.out.println(str.contains(""));

        System.out.println(str.toUpperCase().contains("B"));
        System.out.println(str.toLowerCase().contains("b"));




    }
}
