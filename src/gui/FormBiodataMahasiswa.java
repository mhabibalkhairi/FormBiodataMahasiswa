package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodataMahasiswa {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textJenjangPendidikan;
    private JTextField textTahunMasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJenisKelamin;
    private JTextField textNomorUrut;
    private JButton SimpanButton;
    private JPanel rootPanel;
    private JLabel Hasil;

    public FormBiodataMahasiswa() {
        SimpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                String jenjang = textJenjangPendidikan.getText();
                String masuk = textTahunMasuk.getText();
                String fakultas = textFakultas.getText();
                String jurusan = textJurusan.getText();
                String jenis = textJenisKelamin.getText();
                String urut = textNomorUrut.getText();

                Mahasiswa std = new Mahasiswa();
                std.setNama(nama);
                std.setNim(nim);
                std.setJenjang(jenjang);
                std.setMasuk(masuk);
                std.setFakultas(fakultas);
                std.setJurusan(jurusan);
                std.setJenis(jenis);
                std.setUrut(urut);

                System.out.println(std.toString());

                Hasil.setText(std.toString());


            }
        });
    }
    public JPanel getRootPanel() {
        return rootPanel;
    }
}

