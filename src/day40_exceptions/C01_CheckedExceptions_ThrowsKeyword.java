package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions_ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {


        String dosyaYolu="src/day40_exceptions/Notlar.txt";

        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);


    }
}
