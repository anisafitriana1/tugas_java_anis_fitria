/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author OWNER
 */
public class tugas_bufferedreader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nama = "";
        String alamat= "";
        String pekerjaan= "";
        String jenisklamin="";
        String hobi="";
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
       
        System.out.println("siapa nama anda");
        nama = br.readLine();
        
        System.out.println("dimana alamat anda");
        alamat = br.readLine();
        
        System.out.println("dimana anda bekerjs");
        pekerjaan = br.readLine();
        
        System.out.println("apa jenis klamin anda");
        jenisklamin = br.readLine();
                
         System.out.println("apa hobi anda");   
         hobi = br.readLine();
         
         System.out.println("nama anda adalah " + nama);
         System.out.println("alamat anda adalah " + alamat);
         System.out.println("pekerjaan anda adalah " + pekerjaan);
         System.out.println("jenis klamin anda adalah " + jenisklamin);
         System.out.println("hobi anda adalah " + hobi);
 
    }
    
}
