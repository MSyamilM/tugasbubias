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
public class NolPositifNegatif {
    public static void main(String[] args) {
        int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan : "));
        
        if (bilangan == 0) {
            JOptionPane.showMessageDialog(null, "BILANGAN NOL");
        } else if (bilangan > 0) {
            JOptionPane.showMessageDialog(null, "BILANGAN POSITIF");
        } else {
            JOptionPane.showMessageDialog(null, "BILANGAN NEGATIF");
        }
    }
}
