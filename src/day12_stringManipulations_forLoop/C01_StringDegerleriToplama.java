package day12_stringManipulations_forLoop;

public class C01_StringDegerleriToplama {
    public static void main(String[] args) {

//        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
//                input1 : “15.30 €” , input2 : “11.40 €”
//        output : 26.70 €


        String input1="15.30 £";
        String input2="11.45 £";

        // once para birimini alip kaydedelim
        int spaceIndex=input1.indexOf(" ");
        String paraBirimi=input1.substring(spaceIndex);
        input1=input1.replaceAll("\\D","");
        input2=input2.replaceAll("\\D","");

        double fiyat1=Double.parseDouble(input1);//1530
        double fiyat2=Double.parseDouble(input2);//1145

        double toplam=(fiyat1+fiyat2)/100;
        System.out.println("Verilen fiyatlarin toplami "+toplam + paraBirimi);















    }
}
