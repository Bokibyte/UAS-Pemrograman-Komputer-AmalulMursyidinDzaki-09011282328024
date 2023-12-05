import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

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
        StringBuilder tampilkanBelanja = new StringBuilder();

        JFrame frame = new JFrame("Kantin Online v.911");
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(80, 80, 80));
        
        JLabel title = new JLabel("Kantin");
        title.setOpaque(true);
        title.setForeground(new Color(150, 150, 150));
        title.setBackground(new Color(50, 50, 50));
        title.setFont(new Font("Consolas", Font.PLAIN, 80));
        title.setBounds(0, 10, 500, 80);

        JLabel title2 = new JLabel("online");
        title2.setForeground(new Color(200, 200, 200));
        title2.setFont(new Font("Arial", Font.PLAIN, 40));
        title2.setBounds(240, 20, 250, 80);

        JLabel title3 = new JLabel("teraasa mahal di akhir bulan");
        title3.setForeground(new Color(150, 150, 150));
        title3.setFont(new Font("Consolas", Font.PLAIN, 15));
        title3.setBounds(0, 38, 500, 80);

        JLabel menuTitle = new JLabel("Menu Makanan:");
        menuTitle.setForeground(new Color(200, 200, 200));
        title2.setFont(new Font("Arial", Font.PLAIN, 30));
        menuTitle.setBounds(10, 100, 490, 20);

        StringBuilder list = new StringBuilder();
        for(int i = 0; i < indexProduk.length; i++){
            list.append(" "+(i+1)+".   "+indexProduk[i]+"\n");
        }

        JTextArea daftarMenu = new JTextArea();
        daftarMenu.setLineWrap(true);
        daftarMenu.setEditable(false);
        daftarMenu.setText(list.toString());

        JScrollPane listMenu = new JScrollPane(daftarMenu);
        listMenu.setFont(new Font("Arial", Font.PLAIN, 30));
        listMenu.setBounds(10, 130, 210, 500);
        listMenu.setBorder(null);
        listMenu.getViewport().getView().setBackground(new Color(50, 50, 50));
        listMenu.getViewport().getView().setForeground(new Color(200, 200, 200));
        listMenu.getVerticalScrollBar().setBackground(new Color(50, 50, 50));
        listMenu.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors(){
                this.thumbColor = new Color(80, 80, 80);
            }
        });

        JTextField input = new JTextField();
        input.setBounds(250, 130, 100, 30);
        input.setFont(new Font("Consolas", Font.PLAIN, 20));

        frame.add(input);
        frame.add(listMenu);
        frame.add(menuTitle);
        frame.add(title3);
        frame.add(title2);
        frame.add(title);

    }
}