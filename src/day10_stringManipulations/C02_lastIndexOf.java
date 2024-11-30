package day10_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String metin="Bu java halledilece.";

        System.out.println(metin.indexOf('a'));
        System.out.println(metin.lastIndexOf('a'));
        System.out.println(metin.indexOf('a',5));//6


        System.out.println(metin.lastIndexOf('a',8));



        System.out.println(metin.indexOf("java"));

        System.out.println(metin.lastIndexOf("java"));

        System.out.println(metin.indexOf('h'));
        System.out.println(metin.lastIndexOf('h'));

        System.out.println(metin.indexOf("java"));


    }
}
