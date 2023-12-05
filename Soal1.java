import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class Soal1{
    public static void main(String[]args){
        String[] indexProduk = {"Pempek",
                                "Batagor",
                                "Gorengan",
                                "Nasi Goreng Fasilkom",
                                "Nasi Ayam Fasilkom",
                                "Nasi Telur Fasilkom",
                                "Mie Rebus Fasilkom",
                                "Mie Goreng Fasilkom",
                                "Mie Nasi Fasilkom",
                                "Es Teh Fasilkom",
                                "Es Cappucino Fasilkom",
                                "Es Jeruk Fasilkom",
                                "Es Seduh Fasilkom",
                                "Roti Fasilkom",
                                "Jajanan Fasilkom",
                                "Mie Ayam Fisip",
                                "Bakso Fisip",
                                "Nasi Goreng Fisip",
                                "Nasi Ayam Fisip",
                                "Nasi Telur Fisip",
                                "Mie Rebus Fisip",
                                "Mie Goreng Fisip",
                                "Mie Nasi Fisip",
                                "Es Teh Fisip",
                                "Es Cappucino Fisip",
                                "Es Jeruk Fisip",
                                "Es Seduh Fisip",
                                "Roti Fisip",
                                "Jajanan Fisip",
                                "Nasi Goreng Ekonomi",
                                "Nasi Ayam Ekonomi",
                                "Nasi Telur Ekonomi",
                                "Mie Rebus Ekonomi",
                                "Mie Goreng Ekonomi",
                                "Mie Nasi Ekonomi",
                                "Es Teh Ekonomi",
                                "Es Cappucino Ekonomi",
                                "Es Jeruk Ekonomi",
                                "Es Seduh Ekonomi",
                                "Roti Ekonomi",
                                "Jajanan Ekonomi"};
        int[] hargaProduk = {1000,
                            10000,
                            1000,
                            12000,
                            12000,
                            10000,
                            10000,
                            10000,
                            10000,
                            5000,
                            5000,
                            5000,
                            2000,
                            2500,
                            2500,
                            10000,
                            10000,
                            1000,
                            12000,
                            12000,
                            10000,
                            10000,
                            10000,
                            10000,
                            5000,
                            5000,
                            5000,
                            2000,
                            2500,
                            2500,
                            1000,
                            12000,
                            12000,
                            10000,
                            10000,
                            10000,
                            10000,
                            5000,
                            5000,
                            5000,
                            2000,
                            2500,
                            2500};
        ArrayList<Integer> jumlahProduk = new ArrayList<>();
        ArrayList<Integer> indexPembelian = new ArrayList<>();
        ArrayList<String> tampilkanProduk = new ArrayList<>();

        JFrame frame = new JFrame("Kantin Online v.911");
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(80, 80, 80));

    }
}