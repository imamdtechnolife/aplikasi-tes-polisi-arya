package tiu_logis_tes_silogisme;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.Toolkit;
import java.lang.*;

public class profil extends JFrame{
	
	Icon fotoku = new ImageIcon(getClass().getResource("Foto ku.png"));
	JLabel bingkai = new JLabel(fotoku);
	JLabel kataFounder = new JLabel("Founder");
	Font font = new Font("Book Antiqua",Font.HANGING_BASELINE, 15);
	JLabel kataFacebook = new JLabel("FB      : imam.afry");
	JLabel kataTwitter = new JLabel ("Twitter : @ImamAfriyadi");
	JLabel kataBlog = new JLabel    ("Blog    : planetmars323.blogspot.com");
	
	profil()
	{
		super("About");
		setIconImage(Toolkit.getDefaultToolkit().getImage(profil.class.getResource("icon.png")));
		setLayout(new FlowLayout());
		
		//foto
		JPanel panelFoto = new JPanel();
		kataFounder.setFont(new Font("BookMan Old Style", Font.CENTER_BASELINE, 30));
		panelFoto.add(bingkai);
		
		//alamat
		JPanel panelAlamat = new JPanel();
		panelAlamat.setLayout(new GridLayout(3,1));
		panelAlamat.setBorder(BorderFactory.createTitledBorder("Imam Afriyadi"));
		kataFacebook.setFont(font);
		kataTwitter.setFont(font);
		kataBlog.setFont(font);
		panelAlamat.add(kataFacebook);
		panelAlamat.add(kataTwitter);
		panelAlamat.add(kataBlog);
		
		//deskripsi
		JPanel panelDeskripsi = new JPanel();
		panelDeskripsi.setLayout(new FlowLayout());
		panelDeskripsi.add(panelAlamat);
		panelDeskripsi.add(panelFoto);
		
		//konten
		add(kataFounder);
		add(panelDeskripsi);
		
	}

}
