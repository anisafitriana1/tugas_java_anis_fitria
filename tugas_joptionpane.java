/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class tugas_joptionpane {
    public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog("siapa pendiri universitas anda");
        JOptionPane.showMessageDialog(null, "pendirinya adalah " + tanya);
        
        tanya = JOptionPane.showInputDialog("prodi apa saja yang ada di universitas anda");
        JOptionPane.showMessageDialog(null, "prodi anda adalah " + tanya);
        
        tanya = JOptionPane.showInputDialog("tahun brapa universitas anda di resmikan");
        JOptionPane.showMessageDialog(null, "tahun peresmian universitas : " + tanya);
        
        tanya = JOptionPane.showInputDialog("apa rencana anda setelah lulus kuliah");
        JOptionPane.showMessageDialog(null, "rencananya adalah "+ tanya);
        
        tanya = JOptionPane.showInputDialog("prodi apa yang tervavorit di universitas anda");
        JOptionPane.showMessageDialog(null, " "+ tanya);
        
    }
 
}
