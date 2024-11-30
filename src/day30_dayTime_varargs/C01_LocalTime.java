package day30_dayTime_varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalTime localTimeJaponya=LocalTime.now(ZoneId.of("Japan"));
        System.out.println(localTimeJaponya);

        LocalTime istenenZaman1=LocalTime.of(10,20,13);
        System.out.println(istenenZaman1);

        System.out.println(localTime.getHour());




    }
}
