/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class tugas_scanner {
    public static void main(String[] args) {
        int umur;
        int tanggallahir;
        int sepatu;
        int noWa;
        int noBaju;
        
        System.out.println("brapa umur anda ?");
        Scanner inputUser = new Scanner (System.in);
        umur = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("brapa tanggal lahir anda ?");
        Scanner User  = new Scanner (System.in);
        tanggallahir = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("brapa nomer sepatu anda ?");
        inputUser = new Scanner (System.in);
        sepatu = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("brapa nomer wa anda ?");
        inputUser = new Scanner (System.in);
        noWa = Integer.parseInt (inputUser.nextLine());
        
        System.out.println("brapa nomer baju anda ?");
        inputUser = new Scanner (System.in);
        noBaju = Integer.parseInt (inputUser.nextLine());
        
        System.out.println("umur anda adalah "+ umur);
        System.out.println("tanggal lahir anda adalah "+ tanggallahir);
        System.out.println("nomer sepatu anda adalah "+ sepatu);
        System.out.println("nomer wa anda adalah "+ noWa);
        System.out.println("nomer baju anda adalah "+ noBaju);
        
        
        
        
    }
  
}
