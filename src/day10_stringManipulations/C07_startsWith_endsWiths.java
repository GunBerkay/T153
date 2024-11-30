package day10_stringManipulations;

public class C07_startsWith_endsWiths {
    public static void main(String[] args) {

        String str = "Java cok guzel, cok.";

        System.out.println(str.startsWith("cok"));

        System.out.println(str.endsWith("cok"));

        System.out.println(str.endsWith("cok."));

        System.out.println(str.startsWith("java"));

        System.out.println(str.startsWith("guzel"));
        System.out.println(str.endsWith("guzel"));

        System.out.println(str.contains("guzel"));

        System.out.println(str.startsWith("cok"));
        System.out.println(str.startsWith("cok", 5));




    }
}
