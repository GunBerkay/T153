package day11_stringManipilations;

public class C06_replace {
    public static void main(String[] args) {

        String str= "java ogrenmek cok zevkli";

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace("zevkli", "eglenceli"));

        str = str.replace("j","J");
        System.out.println(str);

        System.out.println(str.replace("e", ""));

        System.out.println(str.replace(" ", "").length());

        System.out.println(str.replace('x', 'y'));


    }
}
