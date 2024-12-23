package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C01_FarkliDataTurleriIleNestedMap {

    public static void main(String[] args) {


        /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi" }  */


        Map<String, Object> rezervasyonMapi=new HashMap<>();

        rezervasyonMapi.put("firstname","Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid",false);

        Map<String,String> bookingdatesMapi = new HashMap<>();
        bookingdatesMapi.put("checkin","2024-07-21");
        bookingdatesMapi.put("checout","2024-08-10");

        rezervasyonMapi.put("bookingdates",bookingdatesMapi);
        rezervasyonMapi.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMapi.get("firstname"));

        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin"));
        System.out.println(((Map<?, ?>) rezervasyonMapi.get("bookingdates")).get("checout"));


    }
}
