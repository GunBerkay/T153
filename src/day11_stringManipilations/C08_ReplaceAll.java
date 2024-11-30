package day11_stringManipilations;

public class C08_ReplaceAll {
    public static void main(String[] args) {

        String str = "3 sen ver, 5 de ben ekleyeyim 8 olsun";

        System.out.println(str.replaceAll("\\d", "*"));

        System.out.println(str.replace("e", "E"));


        System.out.println(str.replaceAll("\\w", "*"));


    }
}
