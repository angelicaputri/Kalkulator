/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class Alamat extends JFrame {
    JFrame frame = new JFrame("ALAMAT");
    
    JButton tampil,back;
    JTextArea tfNama;
    JLabel label1, label2, title;
    
    public Alamat(){
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1 = new JLabel("Rumah lu dimane: ");
        tfNama = new JTextArea();
        label2 = new JLabel();
        tampil = new JButton("TAMPILKAN");
        back = new JButton("KEMBALI");
        title = new JLabel("ALAMAT ORANG");
        
        frame.add(label1);
        frame.add(tfNama);
        frame.add(label2);
        frame.add(tampil);
        frame.add(title);
        frame.add(back);

        tampil.addActionListener((ActionEvent e) -> {
           if (tfNama.getText().length() == 0){ JOptionPane.showMessageDialog(null, "Gaboleh kosong tong");}
           else{
               String nama = tfNama.getText();
               label2.setText(nama);
           }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IniLayout nama = new IniLayout();
                frame.dispose();//To change body of generated methods, choose Tools | Templates.
            }
        });
        
        label1.setBounds(50, 70, 150, 20);
        tfNama.setBounds(200, 70, 280, 20);
        tampil.setBounds(50, 100, 150, 20);
        label2.setBounds(50, 125, 280, 20);
        title.setBounds(250, 20, 100, 20);
        back.setBounds(220, 100, 150, 20);
    }
    }
