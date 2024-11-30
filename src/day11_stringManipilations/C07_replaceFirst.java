package day11_stringManipilations;

public class C07_replaceFirst {
    public static void main(String[] args) {


        String str = "3 sen ver, 5 de ben ekleyeyim 8 olsun";

       // System.out.println(str.replaceFirst("s", "S"));

       // System.out.println(str.replaceFirst(" ", "*"));

//        \\s : space  \\S : space olmayan hersey        \\s+ : yanyana birden fazla space
//\\d : digits \\D : digit olmayan hersey
//\\w : harf, rakam veya _ \\W : harf, rakam veya _ olmayan hersey

        System.out.println(str.replaceFirst("\\d", "X"));


    }
}
