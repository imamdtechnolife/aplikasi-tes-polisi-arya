package tiu_verbal_tes_sinonim;

import javax.swing.*;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;


public class halaman_utama_sinonim {
	public static void main(String[]args)
	{
		try
		{
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.generalNoTranslucencyShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada tema : "+ex.getMessage(),"Pesan Kesalahan",JOptionPane.INFORMATION_MESSAGE);
		}
		
		soal obj = new soal();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);
		obj.setResizable(true);
		obj.setSize(1257,478);
		obj.setLocationRelativeTo(null);
		obj.setResizable(false);
	}
}
