package team2;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {

        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz");
//        int girilenSayi= scan.nextInt();
//        int rakamlarToplami=0;
//
//        do {
//            rakamlarToplami+=girilenSayi%10;
//            girilenSayi/=10;
//        }while (!(girilenSayi==0));
//
//        System.out.println(rakamlarToplami);



        /*2---
    1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
    */

//        for (int i = 1; i <=20 ; i++) {
//            System.out.println(i);
//
//        }



        /*3----
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz");
//        int sayi= scan.nextInt();
//
//        for (int i = 1; i <=10 ; i++) {
//            int sonuc= sayi*i;
//            System.out.println(sayi+" x "+i+" = "+sonuc);
//
//        }


        /*4----
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

     Beklenen çıktı:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */
//        for (int i = 1; i <=10 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
//        int uzunluk=7;
//                     // üst kısım
//        for (int i = 0; i < uzunluk; i++) {
//
//            for (int j = 0; j < uzunluk-i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <2*i+1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//                     // Alt Kisim
//        for (int i = uzunluk-2; i >=0 ; i--) {
//            for (int j = 0; j < uzunluk-i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2*i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



         /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */

//        Scanner scan = new Scanner(System.in);
//        String girilen = scan.next();
//        String sesli = "aeiouAEIOU";
//        if (girilen.length() == 1) {
//            if (girilen.charAt(0) >= 'A' && girilen.charAt(0) <= 'Z'
//                    || girilen.charAt(0) >= 'a' && girilen.charAt(0) <= 'z') {
//                for (int i = 0; i < sesli.length(); i++) {
//                    if (girilen.charAt(0) == sesli.charAt(i)) {
//                        System.out.println("girilen harf seslidir.");
//                        break;
//                    }
//                    if (girilen.charAt(0)!=sesli.charAt(i)) {
//                        System.out.println("Girilen harf sessizdir");
//                        //break;
//                    }
//
//
//                }
//            } else
//                System.out.println("doğru karakter giriniz.");
//        } else
//            System.out.println("harf giriniz. ");
//
//    }



        /*7-----
    Ugly Number:

    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:
    13

    Beklenen çıktı:
    ugly number  degildir

    Test Data:
    25
    Beklenen Çıktı:

    ugly number

    */


         /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("bir kelime giriniz");
//        String str=scan.nextLine();
//        String tersStr="";
//
//        for (int i = str.length(); i >=1 ; i--) {
//            tersStr+=str.substring(i-1,i);
//        }
//        System.out.println(tersStr);


        /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    String str1 = "Java is";
        String str2 = "fun";

        String result = str1 + " " + str2;

        System.out.println(result);

    */

        /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */
//        Scanner scanner = new Scanner(System.in);
//
//        // Kullanıcıdan ana metni al
//        System.out.println("Lütfen bir metin girin:");
//        String girilenMetin = scanner.nextLine();
//
//        // Kullanıcıdan aranan metni al
//        System.out.println("Lütfen aranan metni girin:");
//        String searchString = scanner.nextLine();
//
//        // Aranan metnin ana metin içerisinde olup olmadığını kontrol et
//        boolean result = girilenMetin.contains(searchString);
//
//        // Sonucu yazdır
//        System.out.println("Aranan String (" + searchString + "): " + result);



    }
}
