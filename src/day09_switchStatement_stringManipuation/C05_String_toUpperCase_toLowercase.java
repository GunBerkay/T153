package day09_switchStatement_stringManipuation;

import java.util.Locale;

public class C05_String_toUpperCase_toLowercase {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase());

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toLowerCase());

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

        str= str.toLowerCase();
        System.out.println(str);

        System.out.println(str.toUpperCase());




    }
}
