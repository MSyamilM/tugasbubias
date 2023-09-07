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
public class IkutPemilu {
    public static void main(String[] args) {
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur : "));
        
        if (umur >= 17) {
            JOptionPane.showMessageDialog(null, "ANDA BOLEH MENGIKUTI PEMILU");
        } else {
            JOptionPane.showMessageDialog(null, "ANDA TIDAK BOLEH MENGIKUTI PEMILU");
        }
    }
}
