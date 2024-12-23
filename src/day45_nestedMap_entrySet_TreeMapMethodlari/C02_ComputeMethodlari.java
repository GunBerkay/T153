package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C02_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",34);
        harfler.put("T",25);
        harfler.put("L",15);
        harfler.put("S",97);
        harfler.put("E",20);

        System.out.println(harfler);

        int eskiDeger=harfler.get("E");

        harfler.put("E",eskiDeger+10);


        if (harfler.containsKey("K")){
            eskiDeger=harfler.get("K");
            harfler.replace("K",eskiDeger*2);
        }


        if (harfler.containsKey("L")){
            eskiDeger=harfler.get("L");
            harfler.replace("L",2*eskiDeger);
        }


        if (!harfler.containsKey("H")){
            harfler.put("H",75);
        }


        harfler.putIfAbsent("S",45);


        harfler.compute("E",(k,v) -> v+10);

        //harfler.compute("R",(k,v)->v+10);

        harfler.computeIfPresent("K",(k,v)->v*2);


        harfler.computeIfPresent("L",(k,v)->v*2);


        harfler.putIfAbsent("C",15);


        harfler.computeIfAbsent("C",v->15);





        System.out.println(harfler);


    }

}
