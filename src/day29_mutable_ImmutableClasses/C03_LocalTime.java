package day29_mutable_ImmutableClasses;

import java.time.LocalTime;

public class C03_LocalTime {

    public static void main(String[] args) {

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);


        String s = "";
        for (int i = 0; i <1000000 ; i++) {
            s+=i;
        }

    }
}
