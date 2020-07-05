/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author OWNER
 */
public class percabangan_switch_case {
   public static void main(String[] args) {
        int aktivitas = 1;
         
        switch(aktivitas){
            case 1 :
                System.out.println("mandi"); 
                break;
            case 2 :  
                System.out.println("tidur");
                break;
            case 3 :  
                System.out.println("jalan-jalan");
                break;
            case 4 : 
                System.out.println("makan");
                break;
            default: 
                System.out.println("rebahan");    
        }
    }    
} 

