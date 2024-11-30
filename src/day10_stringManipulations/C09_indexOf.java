package day10_stringManipulations;

public class C09_indexOf {
    public static void main(String[] args) {

        String str = "Java bana cok mantikli geliyor";

        System.out.println(str.contains("cok"));
        System.out.println(str.startsWith("cok"));
        System.out.println(str.endsWith("cok"));
        System.out.println(str.equals("cok"));
        System.out.println(str.equalsIgnoreCase("cok"));


        System.out.println(str.contains("a"));
        System.out.println(str.indexOf("a"));

        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf("mantik"));

        System.out.println(str.indexOf('a', 1));

        System.out.println(str.indexOf('a', 2));

        System.out.println(str.indexOf('a', 4));

        System.out.println(str.indexOf("B"));






    }
}
