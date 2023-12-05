import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
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
        ArrayList<Integer> totalHarga = new ArrayList<>();

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
        input.setBounds(250, 130, 150, 30);
        input.setFont(new Font("Consolas", Font.PLAIN, 20));

        JTextArea daftarBelanja = new JTextArea();
        daftarBelanja.setLineWrap(true);
        daftarBelanja.setEditable(false);

        JButton tombolOK = new JButton("Pilih");
        tombolOK.setBounds(410, 130, 60, 30);
        tombolOK.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String getIndexList = input.getText();
                try{
                    int indexList = Integer.parseInt(getIndexList);
                    if(indexList >0 && indexList <= indexProduk.length){
                        indexList -=1;
                        indexPembelian.add(indexList);
                        String getInputQuantity = JOptionPane.showInputDialog(null, indexProduk[indexList]+" dengan harga : Rp"+hargaProduk[indexList]+". Berapa jumlah produk yang ingin anda beli?", "Jumlah Pembelian", JOptionPane.OK_OPTION);
                        try{
                            int inputQuantity = Integer.parseInt(getInputQuantity);
                            jumlahProduk.add(inputQuantity);
                            tampilkanBelanja.append(" "+indexProduk[indexList]+"    Rp"+hargaProduk[indexList]+" x"+inputQuantity+"\n");
                            daftarBelanja.setText(tampilkanBelanja.toString());
                            totalHarga.add(hargaProduk[indexList]*inputQuantity);
                        }catch(NumberFormatException y){
                            JOptionPane.showMessageDialog(null, "Input salah!", "Peringarab", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Menu tidak tersedia!", "Peringarab", JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException x){
                    input.setText("");
                    JOptionPane.showMessageDialog(null, "Input salah!", "Peringarab", JOptionPane.ERROR_MESSAGE);
                }
                    
            }
        });

        JScrollPane listBelanja = new JScrollPane(daftarBelanja);
        listBelanja.setFont(new Font("Arial", Font.PLAIN, 30));
        listBelanja.setBounds(250, 200, 210, 390);
        listBelanja.setBorder(null);
        listBelanja.getViewport().getView().setBackground(new Color(50, 50, 50));
        listBelanja.getViewport().getView().setForeground(new Color(200, 200, 200));
        listBelanja.getVerticalScrollBar().setBackground(new Color(50, 50, 50));
        listBelanja.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors(){
                this.thumbColor = new Color(80, 80, 80);
            }
        });

        JButton tombolBayar = new JButton("Bayar");
        tombolBayar.setBounds(280, 600, 150, 30);
        tombolBayar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int totHarga = 0;
                int totalBarang = 0;
                for(int calc : indexPembelian){
                    totalBarang += calc;
                }
                for(int calc : totalHarga){
                    totHarga += calc;
                }
                if(totalBarang >= 0 && totalBarang < 5){
                    JOptionPane.showMessageDialog(null, "Total harga = "+totHarga);
                    System.exit(0);
                }else if(totalBarang >= 5 && totalBarang <= 10){
                    totHarga *= 5 / 100;
                    JOptionPane.showMessageDialog(null, "Total harga setelah diskon = "+totHarga);
                    System.exit(0);
                }else if(totalBarang > 10 && totalBarang <= 20){
                    totHarga *= 10 / 100;
                    JOptionPane.showMessageDialog(null, "Total harga setelah diskon = "+totHarga);
                    System.exit(0);
                }else{
                    totHarga *= 20 / 100;
                    JOptionPane.showMessageDialog(null, "Total harga setelah diskon = "+totHarga);
                    System.exit(0);
                }
            }
        });

        frame.add(tombolBayar);
        frame.add(listBelanja);
        frame.add(tombolOK);
        frame.add(input);
        frame.add(listMenu);
        frame.add(menuTitle);
        frame.add(title3);
        frame.add(title2);
        frame.add(title);

    }
    
}