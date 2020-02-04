package latihan;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


public class IniLayout extends JFrame {

    JButton tombol1, tombol2, tombol3, tombol4, tombol5, tombol6, tombol7, tombol8, tombol9, tombol10, tombol11, tombol12;
    JLabel Label1, Label2, Label3;
    JPanel panelLabel, panel1, panel2, panel3;

    public IniLayout() {
        setTitle("MULTI LAYOUT");

        panelLabel = new JPanel(null); //dasar
        Label1 = new JLabel("Flow Layout");
        Label2 = new JLabel("None Layout");
        Label3 = new JLabel("Grid Layout");

        panel1 = new JPanel(new FlowLayout()); //panel untuk flow layout
        tombol1 = new JButton("Nama"); //komponen yang ada didalam flow layout
        tombol2 = new JButton("Alamat");
        tombol3 = new JButton("Universitas");
        tombol4 = new JButton("No HP");

        panel2 = new JPanel(null); //panel untuk null layout
        tombol5 = new JButton("Nama"); //komponen yang ada didalam null layout
        tombol6 = new JButton("Alamat");
        tombol7 = new JButton("Universitas");
        tombol8 = new JButton("No HP");

        panel3 = new JPanel(new GridLayout(2, 2));
        tombol9 = new JButton("Nama"); //panel untuk grid layout
        tombol10 = new JButton("Alamat"); //komponen yang ada didalam grid layout
        tombol11 = new JButton("Universitas");
        tombol12 = new JButton("No HP");

        setLayout(new BorderLayout()); //deklarasi border layout
        add(panel1, "West"); //masukin panel1 yang adalah panelnya flow layout ke dalam border layout
        panel1.add(tombol1); //masukin komponen2nya
        panel1.add(tombol2);
        panel1.add(tombol3);
        panel1.add(tombol4);
        add(panel2, "Center");//masukin panel2 yang adalah panelnya null layout ke dalam border layout
        panel2.add(tombol5);
        panel2.add(tombol6);
        panel2.add(tombol7);
        panel2.add(tombol8);
        add(panel3, "East");//masukin panel3 yang adalah panelnya null layout ke dalam border layout
        panel3.add(tombol9);
        panel3.add(tombol10);
        panel3.add(tombol11);
        panel3.add(tombol12);

        Label2.setBounds(225, -5, 80, 25);
        Label3.setBounds(345, -5, 80, 25);
        //atur posisinya komponen yang ada di null layout
        tombol5.setBounds(30, 15, 80, 25);
        tombol6.setBounds(30, 40, 80, 25);
        tombol7.setBounds(30, 65, 80, 25);
        tombol8.setBounds(30, 90, 80, 25);
        
        //pengaturan framenya
        setSize(750, 400);
        setVisible(true);
        setResizable(true); //bisa diminimize/maximize
        setLocation(450, 300);//pas di run, windownya kebuka di titik itu
        setDefaultCloseOperation(3);
        
        tombol1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nama nama = new Nama(); 
                
            }
        });
        tombol5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nama nama = new Nama();
                dispose();
            }
        });
        tombol9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nama nama = new Nama(); 
                dispose();
            }
        });
        tombol2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alamat alamat = new Alamat(); 
                dispose();
            }
        });
        tombol6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Alamat alamat = new Alamat();
                 dispose();
            }
        });
        tombol10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Alamat alamat = new Alamat();
                 dispose();
            }
        });
        tombol3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Universitas univ = new Universitas(); 
                 dispose();
            }
        });
        tombol7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Universitas univ = new Universitas(); 
                dispose();
            }
        });
        tombol11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Universitas univ = new Universitas(); 
                 dispose();
            }
        });
    }

}
