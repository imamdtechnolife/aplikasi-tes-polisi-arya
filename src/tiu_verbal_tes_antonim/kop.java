package tiu_verbal_tes_antonim;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;


public class kop {
	JLabel lblJudul; 
	JLabel lblPetunjuk;
	JLabel lblPetunjuk2;

	public JLabel kopjudul()
	{
		lblJudul = new JLabel("LATIHAN KEMAMPUAN HERBAL ANTONIM");
		lblJudul.setFont(new Font("BookMan Old Style", Font.CENTER_BASELINE, 18));
		return lblJudul;		
	}	
	
	public JLabel koppetunjuk()
	{
		lblPetunjuk = new JLabel("Setiap soal terdiri atas satu kata yang dicetak dengan huruf kapital diikuti lima kemungkinan jawaban.");
		return lblPetunjuk;
	}
	
	public JLabel koppetunjuk2()
	{
		lblPetunjuk2 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti berlawanan atau paling jauh dengan arti kata yang dicetak dengan huruf kapital");
		lblPetunjuk2.setFont(new Font("BookMan Old Style", Font.CENTER_BASELINE, 13));
		lblPetunjuk2.setForeground(Color.BLUE);
		return lblPetunjuk2;
	}
	
}


