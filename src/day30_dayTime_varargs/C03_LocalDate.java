package day30_dayTime_varargs;

import java.time.LocalDate;
import java.time.ZoneId;

public class C03_LocalDate
{
    public static void main(String[] args) {

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalDate japonyaTarih=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(japonyaTarih);


    }
}
