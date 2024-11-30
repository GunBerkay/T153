package day25_constructors;

public class C03_CarRunner {



    public static void main(String[] args) {

        C02_Car car1=new C02_Car();

        System.out.println(car1);

        car1.marka="Opel";
        car1.model="Corsa";
        car1.yakit="Benzin";
        car1.yil=2010;
        car1.fiyat=3000;
        System.out.println(car1);

        C02_Car car2=new C02_Car("Nissan","Note","Benzin",2015,3500);

        System.out.println("Car2 "+car2);

        C02_Car car3=new C02_Car("BMW","5.20","Dizel",2005,9000);
        System.out.println("Car3 "+car3);

        C02_Car car4=new C02_Car("Volvo","S60","Benzin",2017,20000);
        System.out.println(car4);







    }
}
