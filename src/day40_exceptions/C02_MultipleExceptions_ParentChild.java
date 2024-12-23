package day40_exceptions;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_MultipleExceptions_ParentChild {

    public static void main(String[] args)  {

        String dosyaYolu="src/day40_exceptions/Notlar.txt";

        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);

            int k =0;

            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolunda hata var, dosya bulunamadi");

        }catch (IOException e ){
            System.out.println("Dosyadaki bilgiler okunamadi");
        }


    }
}
