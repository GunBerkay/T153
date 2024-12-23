package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C04_TreeMapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",34);
        harfler.put("T",25);
        harfler.put("L",15);
        harfler.put("S",97);
        harfler.put("E",20);

        System.out.println(harfler);


        TreeMap<String,Integer> letters = new TreeMap<>();

        letters.put("A",34);
        letters.put("T",25);
        letters.put("L",15);
        letters.put("S",97);
        letters.put("E",20);

        System.out.println(letters);




    }
}
