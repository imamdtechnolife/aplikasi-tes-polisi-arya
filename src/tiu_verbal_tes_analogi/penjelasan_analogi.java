package tiu_verbal_tes_analogi;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class penjelasan_analogi extends JFrame{
	JTextArea penjelasan = new JTextArea();
	String Pengertian = " Pada Tes ini, yang harus Anda cari adalah kata atau pasangan kata yang mempunyai hubungan kata yang sama atau serupa \n"
			+ "dengan pasangan kata di sebelah kiri. Cara termudah adalah dengan membuat kalimat yang dapat menghubungkan \n"
			+ " pasangan kata yang tersedia di sebelah kiri sehingga pasangan tersebut mempunyai hubungan yang sama\n"
			+ " atau serupa dengan pasangan kata di sebelah kanan.Jika pada pilihan terdapat lebih dari satu jawaban berdasarkan cara ini,\n "
			+ " perhatikan jenis katanya atau carilah hubungan yang lebih spesifik. \n "
			+ "		Peserta tes yang belum pernah menghadapi soal tes seperti ini, tentu akan kebingungan dan berpikir \n"
			+ "bahwa soal ini cukup sulit. Tetapi, bagi mereka yang sudah pernah menghadapi atau mengenali tes ini \n"
			+ ", akan mudah dalam menjawabnya. Perlu anda ketahui bahwa tes ini seluruhnya mengandalkan daya nalar Anda \n"
			+ "untuk mencari hubungan kata yang tepat. Salah satu hal terpenting adalah posisi kata pertama dan kedua\n "
			+ "tidak boleh terbolak-balik.";
	
	JButton sip = new JButton("Sip!");
	Container konten = getContentPane();
	
	public penjelasan_analogi()
	{
		super("Pengertian Analogi");
		setLayout(new FlowLayout());
		setIconImage(Toolkit.getDefaultToolkit().getImage(penjelasan_analogi.class.getResource("icon.png")));
		penjelasan.setText(Pengertian);
		penjelasan.setEditable(false);
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(penjelasan);
		sip.setFont(new Font("Bookman Antiqua", Font.BOLD, 14));
		JLabel label = new JLabel("Analogi (Padanan Hubungan)");
		label.setFont(new Font("Bookman Antiqua", Font.BOLD, 16));
		konten.add(label);
		konten.add(scroll);
		konten.add(sip);
		
	
	}
	
}
