package day10_stringManipulations;

import java.util.Scanner;

public class C08_sıfremi {
    public static void main(String[] args) {

//        kullanicidan bir mail alin
//        - mail @ icermiyorsa "gecersiz mail"
//                - mail @gmail.com icermiyorsa, "mail gmail olmali"
//                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
//        yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("bir mail giriniz");
        String email = scan.nextLine();

        if(!email.contains("@")){
            System.out.println("gecersiz mail");

            if (!email.contains("@gamail.com")){
                System.out.println("mail gmail olmali");
            }

            if (!email.endsWith("@gmail.com")){
                System.out.println("mailde yazim hatasi var");
            }
        }
    }
}
