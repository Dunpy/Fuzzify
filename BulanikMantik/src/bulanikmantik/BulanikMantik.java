/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikmantik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.util.Scanner;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

/**
 *
 * @author Yusuf
 */
public class BulanikMantik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException {
        // TODO code application logic here
        File f = new File("data.txt");
        Scanner scan =new Scanner(f);
        double toplam=0;
        double toplam2=0;
        while(scan.hasNext())
        
       { 
        String a=scan.next();
        double b=Double.parseDouble(a);
        String e=scan.next();
        double d=Double.parseDouble(e);
        String k=scan.next();
        String g=scan.next();
        String h=scan.next();
        String i=scan.next();
        String j=scan.next();
        String l=scan.next();
        Restorant r=new Restorant(b,d);
        System.out.print(r+"    ");
        String deneme=r.toString();
        String[] parts = deneme.split("\t");
        String part4=parts[4];
        double sonuc=Double.parseDouble(part4);
        int sayi=(int) Math.round(sonuc);
        System.out.print("Beklenen tür:");
        
        int c=Integer.parseInt(l);
          System.out.print(c+"  ");
          System.out.print("Tür:"+sayi);
          toplam+=(c-sayi)/c;
          toplam2+=Math.pow(c-sayi,2);
          System.out.println();
          
        }
           
       System.out.println("MAPE:"+Math.abs(toplam*100/210));
       System.out.println("MSE:"+Math.abs(toplam2*1/210));     
       
    }
    
}
