package gui;

import javax.swing.*;

public class RunFormBiodataMahasiswa {
    public static void main(String[] args) {
        JFrame y = new JFrame ("Form Biodata Mahasiswa");
        y .setContentPane(new FormBiodataMahasiswa().getRootPanel());
        y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        y.setLocationRelativeTo(null);
        y.setSize(400,300);
        y.setVisible(true);
    }
}
