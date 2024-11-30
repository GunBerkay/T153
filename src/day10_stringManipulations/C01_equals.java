package day10_stringManipulations;

public class C01_equals {
    public static void main(String[] args) {

        int sayi = 8;
        int a = 8;

        if(sayi==a){
            System.out.println("yasasin");
        }

        char cinsiyet = 'E';

        if (cinsiyet=='E') System.out.println("emekli olabilirsin");


        String str1 = "Ali";
        String str2 = "Ali";
        String s = "A";
        String t = "li";
        String str3 = s+t;
        String str4 = "A" + "li";
        String str5 = new String("Ali");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1==str5);
        System.out.println(str1=="Ali");

        System.out.println("=================");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals("Ali"));
        System.out.println("========================");
        String str6 = "ali";
        String str7 = "ALI";
        String str8 = "ALİ";
        String str9 = "Ali";
        String str10 = "ALİ.";

        System.out.println(str1.equals(str6));
        System.out.println(str1.equals(str7));
        System.out.println(str1.equals(str8));
        System.out.println(str1.equals(str9));
        System.out.println(str1.equals(str6));






    }
}
