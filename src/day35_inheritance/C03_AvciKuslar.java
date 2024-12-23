package day35_inheritance;

public class C03_AvciKuslar extends C02_Kuslar{

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        C03_AvciKuslar avciKartal=new C03_AvciKuslar();

        System.out.println(avciKartal.omur);
        System.out.println(avciKartal.solunum);
        System.out.println(avciKartal.cogalma);
        System.out.println(avciKartal.kanat);
        System.out.println(avciKartal.hareket);
        System.out.println(avciKartal.beslenme);
        System.out.println(avciKartal.pence);
        System.out.println(avciKartal.gaga);

        C02_Kuslar kusKartal=new C03_AvciKuslar();

        System.out.println(kusKartal.omur);
        System.out.println(kusKartal.solunum);
        System.out.println(kusKartal.cogalma);
        System.out.println(kusKartal.kanat);
        System.out.println(kusKartal.hareket);
        System.out.println(kusKartal.beslenme);
        //System.out.println(kusKartal.pence);
        System.out.println(kusKartal.gaga);

        C01_Hayvanlar hayvanKartal=new C03_AvciKuslar();

        System.out.println(hayvanKartal.omur);
        System.out.println(hayvanKartal.solunum);
        System.out.println(hayvanKartal.cogalma);
        //System.out.println(hayvanKartal.kanat);
        System.out.println(hayvanKartal.hareket);
        System.out.println(hayvanKartal.beslenme);
        //System.out.println(kusKartal.pence);
        //System.out.println(hayvanKartal.gaga);






    }

}
