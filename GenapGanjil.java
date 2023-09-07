/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbuaul;

import javax.swing.JOptionPane;

/**
 *
 * @author MOKLET010
 */
public class GenapGanjil {
    public static void main(String[] args) {
        int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan : "));
        
        if (bilangan%2 == 0) {
            JOptionPane.showMessageDialog(null, "BILANGAN GENAP");
        } else {
            JOptionPane.showMessageDialog(null, "BILANGAN GANJIL");
        }
    }
}
