package tiu_verbal_tes_sinonim;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class soal extends JFrame{
	
	//variabel
	JPanel soal1 = new JPanel();
	JPanel soal2 = new JPanel();
	JPanel soal3 = new JPanel();
	JPanel soal4 = new JPanel();
	JPanel soal5 = new JPanel();
	JPanel soal6 = new JPanel();
	JPanel soal7 = new JPanel();
	JPanel soal8 = new JPanel();
	JPanel soal9 = new JPanel();
	JPanel soal10 = new JPanel();
	JPanel soal11 = new JPanel();
	JPanel soal12 = new JPanel();
	JPanel soal13 = new JPanel();
	JPanel soal14 = new JPanel();
	JPanel soal15 = new JPanel();
	JPanel soal16 = new JPanel();
	JPanel soal17 = new JPanel();
	JPanel soal18 = new JPanel();
	JPanel soal19 = new JPanel();
	JPanel soal20 = new JPanel();
	JPanel soal21 = new JPanel();
	JPanel soal22 = new JPanel();
	JPanel soal23 = new JPanel();
	JPanel soal24 = new JPanel();
	JPanel soal25 = new JPanel();
	JPanel soal26 = new JPanel();
	JPanel soal27 = new JPanel();
	JPanel soal28 = new JPanel();
	JPanel soal29 = new JPanel();
	JPanel soal30 = new JPanel();
	JPanel soal31 = new JPanel();
	JPanel soal32 = new JPanel();
	JPanel soal33 = new JPanel();
	JPanel soal34 = new JPanel();
	JPanel soal35 = new JPanel();
	JPanel soal36 = new JPanel();
	JPanel soal37 = new JPanel();
	JPanel soal38 = new JPanel();
	JPanel soal39 = new JPanel();
	JPanel soal40 = new JPanel();
	JPanel soal41 = new JPanel();
	JPanel soal42 = new JPanel();
	JPanel soal43 = new JPanel();
	JPanel soal44 = new JPanel();
	JPanel soal45 = new JPanel();
	JPanel soal46 = new JPanel();
	JPanel soal47 = new JPanel();
	JPanel soal48 = new JPanel();
	JPanel soal49 = new JPanel();
	JPanel soal50 = new JPanel();
	JPanel result = new JPanel();
	JLabel hasil;
	JTabbedPane tab = new JTabbedPane();
	Container konten = getContentPane();
	JLabel judul;
	JLabel petunjuk;
	Font f = new Font("BookMan Old Style", Font.CENTER_BASELINE, 18);
	Font fp = new Font("BookMan Old Style", Font.CENTER_BASELINE, 13);
	Font fn = new Font("Book Antiqua", Font.BOLD, 15);
	JLabel per;
	JRadioButton rba;
	JRadioButton rbb;
	JRadioButton rbc;
	JRadioButton rbd;
	JRadioButton rbe;
	Icon play = new ImageIcon(getClass().getResource("Play Image.png"));
	Icon exemple = new ImageIcon(getClass().getResource("Exemple Image.png"));
	Icon playback = new ImageIcon(getClass().getResource("Playback Image.png"));
	Icon exit = new ImageIcon(getClass().getResource("Exit Image.png"));
	Icon smile = new ImageIcon(getClass().getResource("smile.png"));
	
	JButton next = new JButton("Next [>>>");
	JButton next1 = new JButton("Next [>>>");
	JButton next2 = new JButton("Next [>>>");
	JButton next3 = new JButton("Next [>>>");
	JButton next4 = new JButton("Next [>>>");
	JButton next5 = new JButton("Next [>>>");
	JButton next6 = new JButton("Next [>>>");
	JButton next7 = new JButton("Next [>>>");
	JButton next8 = new JButton("Next [>>>");
	JButton next9 = new JButton("Next [>>>");
	JButton next10 = new JButton("Next [>>>");
	JButton next11 = new JButton("Next [>>>");
	JButton next12 = new JButton("Next [>>>");
	JButton next13 = new JButton("Next [>>>");
	JButton next14 = new JButton("Next [>>>");
	JButton next15 = new JButton("Next [>>>");
	JButton next16 = new JButton("Next [>>>");
	JButton next17 = new JButton("Next [>>>");
	JButton next18 = new JButton("Next [>>>");
	JButton next19 = new JButton("Next [>>>");
	JButton next20 = new JButton("Next [>>>");
	JButton next21 = new JButton("Next [>>>");
	JButton next22 = new JButton("Next [>>>");
	JButton next23 = new JButton("Next [>>>");
	JButton next24 = new JButton("Next [>>>");
	JButton next25 = new JButton("Next [>>>");
	JButton next26 = new JButton("Next [>>>");
	JButton next27 = new JButton("Next [>>>");
	JButton next28 = new JButton("Next [>>>");
	JButton next29 = new JButton("Next [>>>");
	JButton next30 = new JButton("Next [>>>");
	JButton next31 = new JButton("Next [>>>");
	JButton next32 = new JButton("Next [>>>");
	JButton next33 = new JButton("Next [>>>");
	JButton next34 = new JButton("Next [>>>");
	JButton next35 = new JButton("Next [>>>");
	JButton next36 = new JButton("Next [>>>");
	JButton next37 = new JButton("Next [>>>");
	JButton next38 = new JButton("Next [>>>");
	JButton next39 = new JButton("Next [>>>");
	JButton next40 = new JButton("Next [>>>");
	JButton next41 = new JButton("Next [>>>");
	JButton next42 = new JButton("Next [>>>");
	JButton next43 = new JButton("Next [>>>");
	JButton next44 = new JButton("Next [>>>");
	JButton next45 = new JButton("Next [>>>");
	JButton next46 = new JButton("Next [>>>");
	JButton next47 = new JButton("Next [>>>");
	JButton next48 = new JButton("Next [>>>");
	JButton next49 = new JButton("Next [>>>");
	JButton next50 = new JButton("Kita lihat hasilnya!", smile);
	
	JButton back2 = new JButton("<<<] Back");
	JButton back3 = new JButton("<<<] Back");
	JButton back4 = new JButton("<<<] Back");
	JButton back5 = new JButton("<<<] Back");
	JButton back6 = new JButton("<<<] Back");
	JButton back7 = new JButton("<<<] Back");
	JButton back8 = new JButton("<<<] Back");
	JButton back9 = new JButton("<<<] Back");
	JButton back10 = new JButton("<<<] Back");
	JButton back11 = new JButton("<<<] Back");
	JButton back12 = new JButton("<<<] Back");
	JButton back13 = new JButton("<<<] Back");
	JButton back14 = new JButton("<<<] Back");
	JButton back15 = new JButton("<<<] Back");
	JButton back16 = new JButton("<<<] Back");
	JButton back17 = new JButton("<<<] Back");
	JButton back18 = new JButton("<<<] Back");
	JButton back19 = new JButton("<<<] Back");
	JButton back20 = new JButton("<<<] Back");
	JButton back21 = new JButton("<<<] Back");
	JButton back22 = new JButton("<<<] Back");
	JButton back23 = new JButton("<<<] Back");
	JButton back24 = new JButton("<<<] Back");
	JButton back25 = new JButton("<<<] Back");
	JButton back26 = new JButton("<<<] Back");
	JButton back27 = new JButton("<<<] Back");
	JButton back28 = new JButton("<<<] Back");
	JButton back29 = new JButton("<<<] Back");
	JButton back30 = new JButton("<<<] Back");
	JButton back31 = new JButton("<<<] Back");
	JButton back32 = new JButton("<<<] Back");
	JButton back33 = new JButton("<<<] Back");
	JButton back34 = new JButton("<<<] Back");
	JButton back35 = new JButton("<<<] Back");
	JButton back36 = new JButton("<<<] Back");
	JButton back37 = new JButton("<<<] Back");
	JButton back38 = new JButton("<<<] Back");
	JButton back39 = new JButton("<<<] Back");
	JButton back40 = new JButton("<<<] Back");
	JButton back41 = new JButton("<<<] Back");
	JButton back42 = new JButton("<<<] Back");
	JButton back43 = new JButton("<<<] Back");
	JButton back44 = new JButton("<<<] Back");
	JButton back45 = new JButton("<<<] Back");
	JButton back46 = new JButton("<<<] Back");
	JButton back47 = new JButton("<<<] Back");
	JButton back48 = new JButton("<<<] Back");
	JButton back49 = new JButton("<<<] Back");
	JButton back50 = new JButton("<<<] Back");
	
	JPanel master = new JPanel();
	JPanel awal = new JPanel();
	JButton mulai = new JButton("Mulai", play);
	JButton lihatContoh = new JButton("Lihat Contoh", exemple);
	JButton main_lagi = new JButton("Coba Lagi");
	int i = 0;
	Font fjudul = new Font("BookMan Old Style", Font.CENTER_BASELINE, 18);
	Font fsoal = new Font("BookMan Old Style", Font.CENTER_BASELINE, 13);
	JPanel master50 = new JPanel();
	
	JLabel per1 = new JLabel("1. ADAGIUM = ....");
	JRadioButton rad1a = new JRadioButton("(A) Puisi");
	JRadioButton rad1b = new JRadioButton ("(B) 	Parabel");
	JRadioButton rad1c = new JRadioButton("(C) 	Jargon");
	JRadioButton rad1d = new JRadioButton ("(D) 	Pepatah");
	JRadioButton rad1e = new JRadioButton ("(E) 	Epos");
	
	JLabel per2 = new JLabel("2. FAKSI = ....");
	JRadioButton rad2a = new JRadioButton("(A) Partai");
	JRadioButton rad2b = new JRadioButton ("(B) 	Pendapat");
	JRadioButton rad2c = new JRadioButton("(C) 	Perpecahan");
	JRadioButton rad2d = new JRadioButton ("(D) 	Individu");
	JRadioButton rad2e = new JRadioButton ("(E) 	Golongan");
	
	JLabel per3 = new JLabel("3. NANAR = ....");
	JRadioButton rad3a = new JRadioButton("(A) Berani");
	JRadioButton rad3b = new JRadioButton ("(B) 	Tajam");
	JRadioButton rad3c = new JRadioButton("(C) 	Malu");
	JRadioButton rad3d = new JRadioButton ("(D) 	Kosong");
	JRadioButton rad3e = new JRadioButton ("(E) 	Bingung");
	
	JLabel per4 = new JLabel("4. ASUMSI = ....");
	JRadioButton rad4a = new JRadioButton("(A) Kesimpulan");
	JRadioButton rad4b = new JRadioButton ("(B) 	Ramalan");
	JRadioButton rad4c = new JRadioButton("(C) 	Anggapan");
	JRadioButton rad4d = new JRadioButton ("(D) 	Perbandingan");
	JRadioButton rad4e = new JRadioButton ("(E) 	Rekaan");
	
	JLabel per5 = new JLabel("5. AFIRMASI = ....");
	JRadioButton rad5a = new JRadioButton("(A) Perjanjian");
	JRadioButton rad5b = new JRadioButton ("(B) 	Penegasan");
	JRadioButton rad5c = new JRadioButton("(C) 	Pemaksaan");
	JRadioButton rad5d = new JRadioButton ("(D) 	Pengesahan");
	JRadioButton rad5e = new JRadioButton ("(E) 	Penekanan");
	
	JLabel per6 = new JLabel("6. EGALITER = ....");
	JRadioButton rad6a = new JRadioButton("(A) Suka memerintah");
	JRadioButton rad6b = new JRadioButton ("(B) 	Militer");
	JRadioButton rad6c = new JRadioButton("(C) 	Otoriter");
	JRadioButton rad6d = new JRadioButton ("(D) 	Legal");
	JRadioButton rad6e = new JRadioButton ("(E) 	Sederajat");
	
	JLabel per7 = new JLabel("7. PERKASA = ....");
	JRadioButton rad7a = new JRadioButton("(A) Gagah");
	JRadioButton rad7b = new JRadioButton ("(B) 	Bertenaga");
	JRadioButton rad7c = new JRadioButton("(C) 	Besar");
	JRadioButton rad7d = new JRadioButton ("(D) 	Kekar");
	JRadioButton rad7e = new JRadioButton ("(E) 	Tegap");
	
	JLabel per8 = new JLabel("8. ASSESSEMENT = ....");
	JRadioButton rad8a = new JRadioButton("(A) Suka");
	JRadioButton rad8b = new JRadioButton ("(B) 	Taksiran");
	JRadioButton rad8c = new JRadioButton("(C) 	Timbang pilih");
	JRadioButton rad8d = new JRadioButton ("(D) 	Wawancara");
	JRadioButton rad8e = new JRadioButton ("(E) 	Tugas");
	
	JLabel per9 = new JLabel("9. HIBRIDA = ....");
	JRadioButton rad9a = new JRadioButton("(A) Bibit unggul");
	JRadioButton rad9b = new JRadioButton ("(B) 	Antar tanaman");
	JRadioButton rad9c = new JRadioButton("(C) 	Cangkokan");
	JRadioButton rad9d = new JRadioButton ("(D) 	Cepat berbuah");
	JRadioButton rad9e = new JRadioButton ("(E) 	Dua jalan");
	
	JLabel per10 = new JLabel("10. TENDENSI = ....");
	JRadioButton rad10a = new JRadioButton("(A) Kesamaan");
	JRadioButton rad10b = new JRadioButton ("(B) 	Kemiringan");
	JRadioButton rad10c = new JRadioButton("(C) 	Kecenderungan");
	JRadioButton rad10d = new JRadioButton ("(D) 	Ketergantungan");
	JRadioButton rad10e = new JRadioButton ("(E) 	Kekhawatiran");
	
	JLabel per11 = new JLabel("11. BAGAK = ....");
	JRadioButton rad11a = new JRadioButton("(A) Galak");
	JRadioButton rad11b = new JRadioButton ("(B) 	Kosong");
	JRadioButton rad11c = new JRadioButton("(C) 	Tidak tepat");
	JRadioButton rad11d = new JRadioButton ("(D) 	Nama burung");
	JRadioButton rad11e = new JRadioButton ("(E) 	Pemberani");
	
	JLabel per12 = new JLabel("12. BENCHMARK = ....");
	JRadioButton rad12a = new JRadioButton("(A) Tolok ukur");
	JRadioButton rad12b = new JRadioButton ("(B) 	Diagram");
	JRadioButton rad12c = new JRadioButton("(C) 	Bangku kerja");
	JRadioButton rad12d = new JRadioButton ("(D) 	Nilai maksimal");
	JRadioButton rad12e = new JRadioButton ("(E) 	Terasering");
	
	JLabel per13 = new JLabel("13. ANDAL = ....");
	JRadioButton rad13a = new JRadioButton("(A) Gesit");
	JRadioButton rad13b = new JRadioButton ("(B) 	Absah");
	JRadioButton rad13c = new JRadioButton("(C) 	Hambatan");
	JRadioButton rad13d = new JRadioButton ("(D) 	Tunjangan");
	JRadioButton rad13e = new JRadioButton ("(E) 	Tangguh");
	
	JLabel per14 = new JLabel("14. DAMPAK = ....");
	JRadioButton rad14a = new JRadioButton("(A) Perbuatan");
	JRadioButton rad14b = new JRadioButton ("(B) 	Benturan");
	JRadioButton rad14c = new JRadioButton("(C) 	Berubah");
	JRadioButton rad14d = new JRadioButton ("(D) 	Cerdas");
	JRadioButton rad14e = new JRadioButton ("(E) 	Pengaruh");
	
	JLabel per15 = new JLabel("15. KLARIFIKASI = ....");
	JRadioButton rad15a = new JRadioButton("(A) Penegasan");
	JRadioButton rad15b = new JRadioButton ("(B) 	Penjelasan");
	JRadioButton rad15c = new JRadioButton("(C) 	Permintaan");
	JRadioButton rad15d = new JRadioButton ("(D) 	Pengaturan");
	JRadioButton rad15e = new JRadioButton ("(E) 	Penentuan");
	
	JLabel per16 = new JLabel("16. INSOMNIA = ....");
	JRadioButton rad16a = new JRadioButton("(A) Tidur");
	JRadioButton rad16b = new JRadioButton ("(B) 	Cemas");
	JRadioButton rad16c = new JRadioButton("(C) 	Sedih");
	JRadioButton rad16d = new JRadioButton ("(D) 	Sulit makan");
	JRadioButton rad16e = new JRadioButton ("(E) 	Tak bisa tidur");
	
	JLabel per17 = new JLabel("17. RANAH = ....");
	JRadioButton rad17a = new JRadioButton("(A) Kampung");
	JRadioButton rad17b = new JRadioButton ("(B) 	Domain");
	JRadioButton rad17c = new JRadioButton("(C) 	Hutan");
	JRadioButton rad17d = new JRadioButton ("(D) 	Asal");
	JRadioButton rad17e = new JRadioButton ("(E) 	Tanah");
	
	JLabel per18 = new JLabel("18. MORTALITAS = ....");
	JRadioButton rad18a = new JRadioButton("(A) Tingkat");
	JRadioButton rad18b = new JRadioButton ("(B) 	Pertarungan");
	JRadioButton rad18c = new JRadioButton("(C) 	Normalitas");
	JRadioButton rad18d = new JRadioButton ("(D) 	Kelahiran");
	JRadioButton rad18e = new JRadioButton ("(E) 	Kematian");
	
	JLabel per19 = new JLabel("19. IMUN = ....");
	JRadioButton rad19a = new JRadioButton("(A) Minum");
	JRadioButton rad19b = new JRadioButton ("(B) 	Kebal");
	JRadioButton rad19c = new JRadioButton("(C) 	Ketimun");
	JRadioButton rad19d = new JRadioButton ("(D) 	Sayur");
	JRadioButton rad19e = new JRadioButton ("(E) 	Asal usul");
	
	JLabel per20 = new JLabel("20. DISPENSASI = ....");
	JRadioButton rad20a = new JRadioButton("(A) Pelarangan");
	JRadioButton rad20b = new JRadioButton ("(B) 	Kelonggaran");
	JRadioButton rad20c = new JRadioButton("(C) 	Perizinan");
	JRadioButton rad20d = new JRadioButton ("(D) 	Pencegahan");
	JRadioButton rad20e = new JRadioButton ("(E) 	Hadiah");
	
	JLabel per21 = new JLabel("21. MOTILITAS = ....");
	JRadioButton rad21a = new JRadioButton("(A) Angka kematian");
	JRadioButton rad21b = new JRadioButton ("(B) 	Angka kelahiran");
	JRadioButton rad21c = new JRadioButton("(C) 	Sebangsa hewan");
	JRadioButton rad21d = new JRadioButton ("(D) 	Gerak");
	JRadioButton rad21e = new JRadioButton ("(E) 	Pukulan");
	
	JLabel per22 = new JLabel("22. TRANSENDENTAL = ....");
	JRadioButton rad22a = new JRadioButton("(A) Bergerak");
	JRadioButton rad22b = new JRadioButton ("(B) 	Berpindah");
	JRadioButton rad22c = new JRadioButton("(C) 	Kesinambungan");
	JRadioButton rad22d = new JRadioButton ("(D) 	Abstrak");
	JRadioButton rad22e = new JRadioButton ("(E) 	Bertentangan");
	
	JLabel per23 = new JLabel("23. EKSODUS = ....");
	JRadioButton rad23a = new JRadioButton("(A) Penampilan");
	JRadioButton rad23b = new JRadioButton ("(B) 	Penguatan");
	JRadioButton rad23c = new JRadioButton("(C) 	Pengusiran");
	JRadioButton rad23d = new JRadioButton ("(D) 	Penampungan");
	JRadioButton rad23e = new JRadioButton ("(E) 	Penampakan");
	
	JLabel per24 = new JLabel("24. DIKOTOMI = ....");
	JRadioButton rad24a = new JRadioButton("(A) Dibagi dua");
	JRadioButton rad24b = new JRadioButton ("(B) 	Kembar dua");
	JRadioButton rad24c = new JRadioButton("(C) 	Dua kekuatan");
	JRadioButton rad24d = new JRadioButton ("(D) 	Dwi fungsi");
	JRadioButton rad24e = new JRadioButton ("(E) 	Banyak cara");
	
	JLabel per25 = new JLabel("25. PEDUSI = ....");
	JRadioButton rad25a = new JRadioButton("(A) Pasangan");
	JRadioButton rad25b = new JRadioButton ("(B) 	Pria");
	JRadioButton rad25c = new JRadioButton("(C) 	Perempuan");
	JRadioButton rad25d = new JRadioButton ("(D) 	Surga");
	JRadioButton rad25e = new JRadioButton ("(E) 	Suami");
	
	JLabel per26 = new JLabel("26. EKAMATRA = ....");
	JRadioButton rad26a = new JRadioButton("(A) Prinsip tunggal");
	JRadioButton rad26b = new JRadioButton ("(B) 	Fisika");
	JRadioButton rad26c = new JRadioButton("(C) 	Hitungan");
	JRadioButton rad26d = new JRadioButton ("(D) 	Matematik");
	JRadioButton rad26e = new JRadioButton ("(E) 	Numerikal");
	
	JLabel per27 = new JLabel("27. FUSI = ....");
	JRadioButton rad27a = new JRadioButton("(A) Energi");
	JRadioButton rad27b = new JRadioButton ("(B) 	Gabungan");
	JRadioButton rad27c = new JRadioButton("(C) 	Inti");
	JRadioButton rad27d = new JRadioButton ("(D) 	Reaksi");
	JRadioButton rad27e = new JRadioButton ("(E) 	Aksi");
	
	JLabel per28 = new JLabel("28. SIKLUS = ....");
	JRadioButton rad28a = new JRadioButton("(A) Melingkar");
	JRadioButton rad28b = new JRadioButton ("(B) 	Balik");
	JRadioButton rad28c = new JRadioButton("(C) 	Daur");
	JRadioButton rad28d = new JRadioButton ("(D) 	Diputar");
	JRadioButton rad28e = new JRadioButton ("(E) 	Kembali");
	
	JLabel per29 = new JLabel("29. RENOVASI = ....");
	JRadioButton rad29a = new JRadioButton("(A) Perbaikan");
	JRadioButton rad29b = new JRadioButton ("(B) 	Pelestarian");
	JRadioButton rad29c = new JRadioButton("(C) 	Pemugaran");
	JRadioButton rad29d = new JRadioButton ("(D) 	Pemeliharaan");
	JRadioButton rad29e = new JRadioButton ("(E) 	Pembongkaran");
	
	JLabel per30 = new JLabel("30. ACUAN = ....");
	JRadioButton rad30a = new JRadioButton("(A) Pacuan");
	JRadioButton rad30b = new JRadioButton ("(B) 	Peregangan");
	JRadioButton rad30c = new JRadioButton("(C) 	Pemacu");
	JRadioButton rad30d = new JRadioButton ("(D) 	Pedoman");
	JRadioButton rad30e = new JRadioButton ("(E) 	Rujukan");
	
	JLabel per31 = new JLabel("31. PROTEKSI = ....");
	JRadioButton rad31a = new JRadioButton("(A) Dilindungi");
	JRadioButton rad31b = new JRadioButton ("(B) 	Melindungi");
	JRadioButton rad31c = new JRadioButton("(C) 	Perlindungan");
	JRadioButton rad31d = new JRadioButton ("(D) 	Terlindung");
	JRadioButton rad31e = new JRadioButton ("(E) 	Alat pelindung");
	
	JLabel per32 = new JLabel("32. PANDIR = ....");
	JRadioButton rad32a = new JRadioButton("(A) Agak pintar");
	JRadioButton rad32b = new JRadioButton ("(B) 	Cerdas");
	JRadioButton rad32c = new JRadioButton("(C) 	Tidak genius");
	JRadioButton rad32d = new JRadioButton ("(D) 	Bodoh");
	JRadioButton rad32e = new JRadioButton ("(E) 	Pemandangan");
	
	JLabel per33 = new JLabel("33. PIALANG = ....");
	JRadioButton rad33a = new JRadioButton("(A) Pedagang");
	JRadioButton rad33b = new JRadioButton ("(B) 	Saham");
	JRadioButton rad33c = new JRadioButton("(C) 	Bursa");
	JRadioButton rad33d = new JRadioButton ("(D) 	Makelar");
	JRadioButton rad33e = new JRadioButton ("(E) 	Investor");
	
	JLabel per34 = new JLabel("34. KARAKTERISTIK = ....");
	JRadioButton rad34a = new JRadioButton("(A) Jiwa");
	JRadioButton rad34b = new JRadioButton ("(B) 	Watak");
	JRadioButton rad34c = new JRadioButton("(C) 	Fisik");
	JRadioButton rad34d = new JRadioButton ("(D) 	Ciri-ciri");
	JRadioButton rad34e = new JRadioButton ("(E) 	Tabiat");
	
	JLabel per35 = new JLabel("35. KLEPTOFOBIA = ....");
	JRadioButton rad35a = new JRadioButton("(A) Takut kecurian");
	JRadioButton rad35b = new JRadioButton ("(B) 	Penyakit suka mencuri");
	JRadioButton rad35c = new JRadioButton("(C) 	Tergila-gila");
	JRadioButton rad35d = new JRadioButton ("(D) 	Terbayang");
	JRadioButton rad35e = new JRadioButton ("(E) 	Berlebih-lebihan");
	
	JLabel per36 = new JLabel("36. RATIFIKASI = ....");
	JRadioButton rad36a = new JRadioButton("(A) Pembukaan");
	JRadioButton rad36b = new JRadioButton ("(B) 	Penciptaan");
	JRadioButton rad36c = new JRadioButton("(C) 	Penutupan");
	JRadioButton rad36d = new JRadioButton ("(D) 	Pembahasan");
	JRadioButton rad36e = new JRadioButton ("(E) 	Pengesahan");
	
	JLabel per37 = new JLabel("37. VLEK = ....");
	JRadioButton rad37a = new JRadioButton("(A) Kotoran");
	JRadioButton rad37b = new JRadioButton ("(B) 	Bekas");
	JRadioButton rad37c = new JRadioButton("(C) 	Bercak");
	JRadioButton rad37d = new JRadioButton ("(D) 	Noda");
	JRadioButton rad37e = new JRadioButton ("(E) 	Putih");
	
	JLabel per38 = new JLabel("38. APORISMA = ....");
	JRadioButton rad38a = new JRadioButton("(A) Apriori");
	JRadioButton rad38b = new JRadioButton ("(B) 	Maksimal");
	JRadioButton rad38c = new JRadioButton("(C) 	Bentuk");
	JRadioButton rad38d = new JRadioButton ("(D) 	Pendekatan");
	JRadioButton rad38e = new JRadioButton ("(E) 	Prima");
	
	JLabel per39 = new JLabel("39. KELOLA = ....");
	JRadioButton rad39a = new JRadioButton("(A) Rawat");
	JRadioButton rad39b = new JRadioButton ("(B) 	Urus");
	JRadioButton rad39c = new JRadioButton("(C) 	Pelihara");
	JRadioButton rad39d = new JRadioButton ("(D) 	Awasi");
	JRadioButton rad39e = new JRadioButton ("(E) 	Tata");
	
	JLabel per40 = new JLabel("40. ANONIM = ....");
	JRadioButton rad40a = new JRadioButton("(A) Nama singkat");
	JRadioButton rad40b = new JRadioButton ("(B) 	Tanpa nama");
	JRadioButton rad40c = new JRadioButton("(C) 	Nama kecil");
	JRadioButton rad40d = new JRadioButton ("(D) 	Kepanjangan dari");
	JRadioButton rad40e = new JRadioButton ("(E) 	Besar");
	
	JLabel per41 = new JLabel("41. WANODYA = ....");
	JRadioButton rad41a = new JRadioButton("(A) Waria");
	JRadioButton rad41b = new JRadioButton ("(B) 	Janda");
	JRadioButton rad41c = new JRadioButton("(C) 	Duda");
	JRadioButton rad41d = new JRadioButton ("(D) 	Setengah baya");
	JRadioButton rad41e = new JRadioButton ("(E) 	Gadis remaja");
	
	JLabel per42 = new JLabel("42. FARIK = ....");
	JRadioButton rad42a = new JRadioButton("(A) Berbeda");
	JRadioButton rad42b = new JRadioButton ("(B) 	Sama");
	JRadioButton rad42c = new JRadioButton("(C) 	Yakin");
	JRadioButton rad42d = new JRadioButton ("(D) 	Pasti");
	JRadioButton rad42e = new JRadioButton ("(E) 	Tarik");
	
	JLabel per43 = new JLabel("43. EMBARGO = ....");
	JRadioButton rad43a = new JRadioButton("(A) Penguasaan");
	JRadioButton rad43b = new JRadioButton ("(B) 	Pengiriman");
	JRadioButton rad43c = new JRadioButton("(C) 	Permusuhan");
	JRadioButton rad43d = new JRadioButton ("(D) 	Pengeluaran");
	JRadioButton rad43e = new JRadioButton ("(E) 	Perintah larangan");
	
	JLabel per44 = new JLabel("44. RAKYU = ....");
	JRadioButton rad44a = new JRadioButton("(A) Pusaka");
	JRadioButton rad44b = new JRadioButton ("(B) 	Kesaktian");
	JRadioButton rad44c = new JRadioButton("(C) 	Wahana");
	JRadioButton rad44d = new JRadioButton ("(D) 	Ilmu");
	JRadioButton rad44e = new JRadioButton ("(E) 	Hipotesis");
	
	JLabel per45 = new JLabel("45. KERABIK = ....");
	JRadioButton rad45a = new JRadioButton("(A) Robek");
	JRadioButton rad45b = new JRadioButton ("(B) 	Nikah");
	JRadioButton rad45c = new JRadioButton("(C) 	Raba");
	JRadioButton rad45d = new JRadioButton ("(D) 	Sentuh");
	JRadioButton rad45e = new JRadioButton ("(E) 	Pegang");
	
	JLabel per46 = new JLabel("46. FANTASTIS = ....");
	JRadioButton rad46a = new JRadioButton("(A) Ampuh");
	JRadioButton rad46b = new JRadioButton ("(B) 	Luar biasa");
	JRadioButton rad46c = new JRadioButton("(C) 	Sakti");
	JRadioButton rad46d = new JRadioButton ("(D) 	Bagus");
	JRadioButton rad46e = new JRadioButton ("(E) 	Biasa");
	
	JLabel per47 = new JLabel("47. DEHIDRASI = ....");
	JRadioButton rad47a = new JRadioButton("(A) Evaporasi");
	JRadioButton rad47b = new JRadioButton ("(B) 	Pengairan");
	JRadioButton rad47c = new JRadioButton("(C) 	Kemerosotan moral");
	JRadioButton rad47d = new JRadioButton ("(D) 	Penguapan");
	JRadioButton rad47e = new JRadioButton ("(E) 	Penyusutan air");
	
	JLabel per48 = new JLabel("48. META = ....");
	JRadioButton rad48a = new JRadioButton("(A) Pulang");
	JRadioButton rad48b = new JRadioButton ("(B) 	Putih");
	JRadioButton rad48c = new JRadioButton("(C) 	Jauh");
	JRadioButton rad48d = new JRadioButton ("(D) 	Awan");
	JRadioButton rad48e = new JRadioButton ("(E) 	Besar");
	
	JLabel per49 = new JLabel("49. EFEKTIF = ....");
	JRadioButton rad49a = new JRadioButton("(A) Manjur");
	JRadioButton rad49b = new JRadioButton ("(B) 	Hemat");
	JRadioButton rad49c = new JRadioButton("(C) 	Tepat sasaran");
	JRadioButton rad49d = new JRadioButton ("(D) 	Efisien");
	JRadioButton rad49e = new JRadioButton ("(E) 	Kerja");
	
	JLabel per50 = new JLabel("50. INTERMEDIARI = ....");
	JRadioButton rad50a = new JRadioButton("(A) Sales");
	JRadioButton rad50b = new JRadioButton ("(B) 	Perantara");
	JRadioButton rad50c = new JRadioButton("(C) 	Tidak susah");
	JRadioButton rad50d = new JRadioButton ("(D) 	Terus terang");
	JRadioButton rad50e = new JRadioButton ("(E) 	Langsung");
	
	ButtonGroup bt = new ButtonGroup();
	ButtonGroup bt2 = new ButtonGroup();
	ButtonGroup bt3 = new ButtonGroup();
	ButtonGroup bt4 = new ButtonGroup();
	ButtonGroup bt5 = new ButtonGroup();
	ButtonGroup bt6 = new ButtonGroup();
	ButtonGroup bt7 = new ButtonGroup();
	ButtonGroup bt8 = new ButtonGroup();
	ButtonGroup bt9 = new ButtonGroup();
	ButtonGroup bt10 = new ButtonGroup();
	ButtonGroup bt11 = new ButtonGroup();
	ButtonGroup bt12 = new ButtonGroup();
	ButtonGroup bt13 = new ButtonGroup();
	ButtonGroup bt14 = new ButtonGroup();
	ButtonGroup bt15 = new ButtonGroup();
	ButtonGroup bt16 = new ButtonGroup();
	ButtonGroup bt17 = new ButtonGroup();
	ButtonGroup bt18 = new ButtonGroup();
	ButtonGroup bt19 = new ButtonGroup();
	ButtonGroup bt20 = new ButtonGroup();
	ButtonGroup bt21 = new ButtonGroup();
	ButtonGroup bt22 = new ButtonGroup();
	ButtonGroup bt23 = new ButtonGroup();
	ButtonGroup bt24 = new ButtonGroup();
	ButtonGroup bt25 = new ButtonGroup();
	ButtonGroup bt26 = new ButtonGroup();
	ButtonGroup bt27 = new ButtonGroup();
	ButtonGroup bt28 = new ButtonGroup();
	ButtonGroup bt29 = new ButtonGroup();
	ButtonGroup bt30 = new ButtonGroup();
	ButtonGroup bt31 = new ButtonGroup();
	ButtonGroup bt32 = new ButtonGroup();
	ButtonGroup bt33 = new ButtonGroup();
	ButtonGroup bt34 = new ButtonGroup();
	ButtonGroup bt35 = new ButtonGroup();
	ButtonGroup bt36 = new ButtonGroup();
	ButtonGroup bt37 = new ButtonGroup();
	ButtonGroup bt38 = new ButtonGroup();
	ButtonGroup bt39 = new ButtonGroup();
	ButtonGroup bt40 = new ButtonGroup();
	ButtonGroup bt41 = new ButtonGroup();
	ButtonGroup bt42 = new ButtonGroup();
	ButtonGroup bt43 = new ButtonGroup();
	ButtonGroup bt44 = new ButtonGroup();
	ButtonGroup bt45 = new ButtonGroup();
	ButtonGroup bt46 = new ButtonGroup();
	ButtonGroup bt47 = new ButtonGroup();
	ButtonGroup bt48 = new ButtonGroup();
	ButtonGroup bt49 = new ButtonGroup();
	ButtonGroup bt50 = new ButtonGroup();
	
	JPanel contoh = new JPanel();
	JPanel contoh2 = new JPanel();
	JPanel contoh3 = new JPanel();
	JPanel contoh4 = new JPanel();
	JPanel contoh5 = new JPanel();
	Icon gNext = new ImageIcon(getClass().getResource("Next.png"));
	JButton btnContohNext = new JButton("Contoh 2", gNext);
	JButton btnContohNext2 = new JButton("Contoh 3", gNext);
	JButton btnContohNext3 = new JButton("Contoh 4", gNext);
	JButton btnContohNext4 = new JButton("Contoh 5", gNext);
	JButton mulai2 = new JButton("Mulai", playback);
	Icon gambarEmotikon = new ImageIcon(getClass().getResource("default.png"));
	Icon Aplus = new ImageIcon(getClass().getResource("A+.png"));
	Icon A = new ImageIcon(getClass().getResource("A.png"));
	Icon Bplus = new ImageIcon(getClass().getResource("B+.png"));
	Icon B = new ImageIcon(getClass().getResource("B.png"));
	Icon Cplus = new ImageIcon(getClass().getResource("C+.png"));
	Icon C = new ImageIcon(getClass().getResource("C.png"));
	Icon Dplus = new ImageIcon(getClass().getResource("D+.png"));
	Icon D = new ImageIcon(getClass().getResource("D.png"));
	Icon E = new ImageIcon(getClass().getResource("E.png"));
	Icon F = new ImageIcon(getClass().getResource("F.png"));
	
	JLabel imotikon = new JLabel(gambarEmotikon);
	JLabel grade = new JLabel("B+");
	JButton keluar = new JButton("Keluar");
	JLabel word = new JLabel("Great!");
	JLabel benar = new JLabel();
	JLabel salah = new JLabel();
	JButton kunci = new JButton("Kunci Jawaban");

	ButtonGroup bg1 = new ButtonGroup();
	
	public soal()
	{
		super("Aplikasi Tes Polisi Arya : TIU Verbal - Tes Sinonim");
		setIconImage(Toolkit.getDefaultToolkit().getImage(halaman_utama_sinonim.class.getResource("icon.png")));
		setLayout(new GridLayout(1,1));
		awal.setLayout(new GridLayout(5,1));
		JLabel kop = new JLabel("TIU VERBAL: TES SINONIM");
		JLabel antonim = new JLabel("Sinonim (Persamaan Kata)");
		JLabel pengertian = new JLabel("    Pada tes ini, tugas Anda adalah mencari arti kata yang sama atau mirip dengan kata yang");
		JLabel pengertian2 = new JLabel("tersedia. Jika anda tidak mengenal kata yang tersedia atau terdapat lebih dari satu jawaban yang");
		JLabel pengertian3 = new JLabel("menurut Anda benar, coba buat kata tersebut ke dalam kalimat yang paling umum, kemudian ");
		JLabel pengertian4 = new JLabel("ganti kata tersebut denga pilihan yang ada di soal. ");
		//JLabel pengertian5 = new JLabel("pada bagian ini, Anda harus mencari kata yang paling bertentangan dengan yang diberikan.");
		JPanel panelPengertian = new JPanel();
		panelPengertian.setBorder(BorderFactory.createTitledBorder(""));
		panelPengertian.setLayout(new GridLayout(4,1));
		panelPengertian.add(pengertian);
		panelPengertian.add(pengertian2);
		panelPengertian.add(pengertian3);
		panelPengertian.add(pengertian4);
		//panelPengertian.add(pengertian5);
		
		
		//awal
		JPanel grupMulai = new JPanel();
		grupMulai.setLayout(new GridLayout(1,2));
		grupMulai.add(lihatContoh);
		grupMulai.add(mulai);
		kop.setFont(new Font("BookMan Old Style", Font.BOLD, 30));
		antonim.setFont(new Font("BookMan Old Style", Font.BOLD, 19));
		Font fp = new Font("Consolas",Font.ITALIC, 12);
		pengertian.setFont(fp);
		pengertian2.setFont(fp);
		pengertian3.setFont(fp);
		pengertian3.setFont(fp);
		pengertian4.setFont(fp);
		//pengertian5.setFont(fp);
		mulai.setFont(new Font("BookMan Old Style", Font.BOLD, 15));
		lihatContoh.setFont(new Font("BookMan Old Style", Font.BOLD, 15));
		mulai.setToolTipText("Siap untuk Memuulai Tes :)");
		lihatContoh.setToolTipText("Lihat beberapa contoh soal untuk membantu kamu menyelesaikan tes ini");
		awal.add(kop);
		awal.add(antonim);
		awal.add(panelPengertian);
		awal.add(grupMulai);
		awal.add(lbl(new JLabel("ŠPlanetMars323 Software House")));
		
		//mempertebal tombol next
		next.setFont(fn);
		next2.setFont(fn);
		next3.setFont(fn);
		next4.setFont(fn);
		next5.setFont(fn);
		next6.setFont(fn);
		next7.setFont(fn);
		next8.setFont(fn);
		next9.setFont(fn);
		next10.setFont(fn);
		next11.setFont(fn);
		next12.setFont(fn);
		next13.setFont(fn);
		next14.setFont(fn);
		next15.setFont(fn);
		next16.setFont(fn);
		next17.setFont(fn);
		next18.setFont(fn);
		next19.setFont(fn);
		next20.setFont(fn);
		next21.setFont(fn);
		next22.setFont(fn);
		next23.setFont(fn);
		next24.setFont(fn);
		next25.setFont(fn);
		next26.setFont(fn);
		next27.setFont(fn);
		next28.setFont(fn);
		next29.setFont(fn);
		next30.setFont(fn);
		next31.setFont(fn);
		next32.setFont(fn);
		next33.setFont(fn);
		next34.setFont(fn);
		next35.setFont(fn);
		next36.setFont(fn);
		next37.setFont(fn);
		next38.setFont(fn);
		next39.setFont(fn);
		next40.setFont(fn);
		next41.setFont(fn);
		next42.setFont(fn);
		next43.setFont(fn);
		next44.setFont(fn);
		next45.setFont(fn);
		next46.setFont(fn);
		next47.setFont(fn);
		next48.setFont(fn);
		next49.setFont(fn);
		next50.setFont(fn);
		
		//mempertebal tombol back
		back2.setFont(fn);
		back3.setFont(fn);
		back4.setFont(fn);
		back5.setFont(fn);
		back6.setFont(fn);
		back7.setFont(fn);
		back8.setFont(fn);
		back9.setFont(fn);
		back10.setFont(fn);
		back11.setFont(fn);
		back12.setFont(fn);
		back13.setFont(fn);
		back14.setFont(fn);
		back15.setFont(fn);
		back16.setFont(fn);
		back17.setFont(fn);
		back18.setFont(fn);
		back19.setFont(fn);
		back20.setFont(fn);
		back21.setFont(fn);
		back22.setFont(fn);
		back23.setFont(fn);
		back24.setFont(fn);
		back25.setFont(fn);
		back26.setFont(fn);
		back27.setFont(fn);
		back28.setFont(fn);
		back29.setFont(fn);
		back30.setFont(fn);
		back31.setFont(fn);
		back32.setFont(fn);
		back33.setFont(fn);
		back34.setFont(fn);
		back35.setFont(fn);
		back36.setFont(fn);
		back37.setFont(fn);
		back38.setFont(fn);
		back39.setFont(fn);
		back40.setFont(fn);
		back41.setFont(fn);
		back42.setFont(fn);
		back43.setFont(fn);
		back44.setFont(fn);
		back45.setFont(fn);
		back46.setFont(fn);
		back47.setFont(fn);
		back48.setFont(fn);
		back49.setFont(fn);
		back50.setFont(fn);
		
		
		//Contoh 1
		contoh.setLayout(new GridLayout(2,1));
		JPanel panelContoh = new JPanel();
		panelContoh.setLayout(new GridLayout(8,1));
		JLabel lblContoh = new JLabel("Contoh 1");
		lblContoh.setFont(fjudul);
		JLabel cont1 = new JLabel("1. WAHANA = ....");
		JRadioButton radconta = new JRadioButton("(A) Sarana");
		JRadioButton radcontb = new JRadioButton("(B) Ide");
		JRadioButton radcontc = new JRadioButton("(C) Dunia");
		JRadioButton radcontd = new JRadioButton("(D) Planet");
		JRadioButton radconte = new JRadioButton("(E) Pandangan");
		JLabel jawaban = new JLabel("Jawaban: A");
		
		bg1.add(radconta);
		bg1.add(radcontb);
		bg1.add(radcontc);
		bg1.add(radcontd);
		bg1.add(radconte);
		jawaban.setFont(fsoal);
		panelContoh.add(lblContoh);
		panelContoh.add(cont1);
		panelContoh.add(radconta);
		panelContoh.add(radcontb);
		panelContoh.add(radcontc);
		panelContoh.add(radcontd);
		panelContoh.add(radconte);
		panelContoh.add(jawaban);
		/**
		JPanel panelTrik = new JPanel();
		JLabel trik1 = new JLabel("Amati pilihan, carilah dua jawaban");
		JLabel trik2 = new JLabel("yang berlawanan. Sering kali jawaban soal");
		JLabel trik3 = new JLabel("ANTONIM berada pada salah satu dari dua");
		JLabel trik4 = new JLabel("kata yang berlawanan tersebut");
		panelTrik.setLayout(new GridLayout(4,1));
		panelTrik.setBorder(BorderFactory.createTitledBorder("TRIK!"));
		panelTrik.add(trik1);
		panelTrik.add(trik2);
		panelTrik.add(trik3);
		panelTrik.add(trik4);
		**/
		JPanel panelGabung = new JPanel();
		JPanel panelPenjelasan = new JPanel();
		JLabel penjelasan1 = new JLabel("Wahana adalah kendaraan, alat pengangkut ");
		JLabel penjelasan2 = new JLabel("atau sarana untuk mencapai suatu tujuan.");
		btnContohNext.setFont(fsoal);
		panelPenjelasan.setLayout(new GridLayout(3,1));
		panelPenjelasan.add(penjelasan1);
		panelPenjelasan.add(penjelasan2);
		//panelGabung.add(panelTrik);
		panelGabung.add(panelPenjelasan);
		panelGabung.add(btnContohNext);
		contoh.add(panelContoh);
		contoh.add(panelGabung);
		
		//contoh 2
		contoh2.setLayout(new GridLayout(2,1));
		JPanel panelContoh2 = new JPanel();
		panelContoh2.setLayout(new GridLayout(8,1));
		JLabel lblContoh2 = new JLabel("Contoh 2");
		lblContoh2.setFont(fjudul);
		JLabel cont12 = new JLabel("2. PARAMETER = ....");
		JRadioButton radconta2 = new JRadioButton("(A) Pasukan cadangan");
		JRadioButton radcontb2 = new JRadioButton("(B) Standar ukuran");
		JRadioButton radcontc2 = new JRadioButton("(C) Tidak dapat diukur");
		JRadioButton radcontd2 = new JRadioButton("(D) Tidak berukuran");
		JRadioButton radconte2 = new JRadioButton("(E) Kecepatan");
		JLabel jawaban2 = new JLabel("Jawaban: B");
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(radconta2);
		bg2.add(radcontb2);
		bg2.add(radcontc2);
		bg2.add(radcontd2);
		bg2.add(radconte2);
		jawaban2.setFont(fsoal);
		panelContoh2.add(lblContoh2);
		panelContoh2.add(cont12);
		panelContoh2.add(radconta2);
		panelContoh2.add(radcontb2);
		panelContoh2.add(radcontc2);
		panelContoh2.add(radcontd2);
		panelContoh2.add(radconte2);
		panelContoh2.add(jawaban2);
		/**
		JPanel panelTrik2 = new JPanel();
		JLabel trik12 = new JLabel("Artikan terlebih dahulu makna kata pada");
		JLabel trik22 = new JLabel("soal, kemudian tentukan lawan katanya.");
		panelTrik2.setLayout(new GridLayout(2,1));
		panelTrik2.setBorder(BorderFactory.createTitledBorder("TRIK!"));
		panelTrik2.add(trik12);
		panelTrik2.add(trik22);
		**/
		JPanel panelGabung2 = new JPanel();
		JPanel panelPenjelasan2 = new JPanel();
		JLabel penjelasan12 = new JLabel("Parameter adalah ukuran seluruh populasi dalam penelitian");
		JLabel penjelasan22 = new JLabel("yang harus diperkirakan. Jadi, sinonim yang tepat adalah standar ukuran.");
		//JLabel penjelasan23 = new JLabel("Jadi, pilihan jawaban yang paling tepat adalah dependen.");
		btnContohNext2.setFont(fsoal);
		panelPenjelasan2.setLayout(new GridLayout(2,1));
		panelPenjelasan2.add(penjelasan12);
		panelPenjelasan2.add(penjelasan22);
		//panelPenjelasan2.add(penjelasan23);
		//panelGabung2.add(panelTrik2);
		panelGabung2.add(panelPenjelasan2);
		panelGabung2.add(btnContohNext2);
		contoh2.add(panelContoh2);
		contoh2.add(panelGabung2);
		
		//Contoh 3
				contoh3.setLayout(new GridLayout(2,1));
				JPanel panelContoh3 = new JPanel();
				panelContoh3.setLayout(new GridLayout(8,1));
				JLabel lblContoh3 = new JLabel("Contoh 3");
				lblContoh3.setFont(fjudul);
				JLabel cont3 = new JLabel("3. KONSIDERASI = ....");
				JRadioButton radconta3 = new JRadioButton("(A) Peraturan");
				JRadioButton radcontb3 = new JRadioButton("(B) Pertimbangan");
				JRadioButton radcontc3 = new JRadioButton("(C) Perhubungan");
				JRadioButton radcontd3 = new JRadioButton("(D) Permusuhan");
				JRadioButton radconte3 = new JRadioButton("(E) Perbaikan");
				JLabel jawaban3 = new JLabel("Jawaban: B");
				ButtonGroup bg3 = new ButtonGroup();
				bg3.add(radconta3);
				bg3.add(radcontb3);
				bg3.add(radcontc3);
				bg3.add(radcontd3);
				bg3.add(radconte3);
				jawaban3.setFont(fsoal);
				panelContoh3.add(lblContoh3);
				panelContoh3.add(cont3);
				panelContoh3.add(radconta3);
				panelContoh3.add(radcontb3);
				panelContoh3.add(radcontc3);
				panelContoh3.add(radcontd3);
				panelContoh3.add(radconte3);
				panelContoh3.add(jawaban3);
				/**
				JPanel panelTrik3 = new JPanel();
				JLabel trik13 = new JLabel("Lawan kata dari 'em' adalah 'im'. ");
				panelTrik3.setLayout(new GridLayout(4,1));
				panelTrik3.setBorder(BorderFactory.createTitledBorder("TRIK!"));
				panelTrik3.add(trik13);
				**/
				JPanel panelGabung3 = new JPanel();
				JPanel panelPenjelasan3 = new JPanel();
				JLabel penjelasan31 = new JLabel("Konsiderasi adalah pertimbangan");
				JLabel penjelasan32 = new JLabel("Adapun imigrasi adalah perpindahan penduduk negara lain ke negara tertentu untuk menetap.");
				btnContohNext3.setFont(fsoal);
				panelPenjelasan3.setLayout(new GridLayout(2,1));
				panelPenjelasan3.add(penjelasan31);
				//panelPenjelasan3.add(penjelasan32);
				//panelGabung3.add(panelTrik3);
				panelGabung3.add(panelPenjelasan3);
				panelGabung3.add(btnContohNext3);
				contoh3.add(panelContoh3);
				contoh3.add(panelGabung3);		
				
				//Contoh 4
				contoh4.setLayout(new GridLayout(2,1));
				JPanel panelContoh4 = new JPanel();
				panelContoh4.setLayout(new GridLayout(8,1));
				JLabel lblContoh4 = new JLabel("Contoh 4");
				lblContoh4.setFont(fjudul);
				JLabel cont4 = new JLabel("4. PAMONG = ....");
				JRadioButton radconta4 = new JRadioButton("(A) Pemimpin");
				JRadioButton radcontb4 = new JRadioButton("(B) Pengurus");
				JRadioButton radcontc4 = new JRadioButton("(C) Penunjuk");
				JRadioButton radcontd4 = new JRadioButton("(D) Pengikat");
				JRadioButton radconte4 = new JRadioButton("(E) Pengatur");
				JLabel jawaban4 = new JLabel("Jawaban: B");
				ButtonGroup bg4 = new ButtonGroup();
				bg4.add(radconta4);
				bg4.add(radcontb4);
				bg4.add(radcontc4);
				bg4.add(radcontd4);
				bg4.add(radconte4);
				jawaban4.setFont(fsoal);
				panelContoh4.add(lblContoh4);
				panelContoh4.add(cont4);
				panelContoh4.add(radconta4);
				panelContoh4.add(radcontb4);
				panelContoh4.add(radcontc4);
				panelContoh4.add(radcontd4);
				panelContoh4.add(radconte4);
				panelContoh4.add(jawaban4);
				/**
				JPanel panelTrik4 = new JPanel();
				JLabel trik14 = new JLabel("Lawan kata dari 'em' adalah 'im'. ");
				panelTrik4.setLayout(new GridLayout(4,1));
				panelTrik4.setBorder(BorderFactory.createTitledBorder("TRIK!"));
				panelTrik4.add(trik14);
				**/
				JPanel panelGabung4 = new JPanel();
				JPanel panelPenjelasan4 = new JPanel();
				JLabel penjelasan41 = new JLabel("Pamong bermakna pengasuh, pendidik (guru)");
				JLabel penjelasan42 = new JLabel("atau pengurus.");
				btnContohNext4.setFont(fsoal);
				panelPenjelasan4.setLayout(new GridLayout(3,1));
				panelPenjelasan4.add(penjelasan41);
				panelPenjelasan4.add(penjelasan42);
				//panelGabung4.add(panelTrik4);
				panelGabung4.add(panelPenjelasan4);
				panelGabung4.add(btnContohNext4);
				contoh4.add(panelContoh4);
				contoh4.add(panelGabung4);
				
				//Contoh 5
				contoh5.setLayout(new GridLayout(2,1));
				JPanel panelContoh5 = new JPanel();
				panelContoh5.setLayout(new GridLayout(8,1));
				JLabel lblContoh5 = new JLabel("Contoh 5");
				lblContoh5.setFont(fjudul);
				JLabel cont5 = new JLabel("5. PURBAWISESA = ....");
				JRadioButton radconta5 = new JRadioButton("(A) Selesai");
				JRadioButton radcontb5 = new JRadioButton("(B) Acara");
				JRadioButton radcontc5 = new JRadioButton("(C) Bergelombang");
				JRadioButton radcontd5 = new JRadioButton("(D) Hubungan");
				JRadioButton radconte5 = new JRadioButton("(E) Kekuasaan sepenuh-penuhnya");
				JLabel jawaban5 = new JLabel("Jawaban: E");
				ButtonGroup bg5 = new ButtonGroup();
				bg5.add(radconta5);
				bg5.add(radcontb5);
				bg5.add(radcontc5);
				bg5.add(radcontd5);
				bg5.add(radconte5);
				jawaban5.setFont(fsoal);
				panelContoh5.add(lblContoh5);
				panelContoh5.add(cont5);
				panelContoh5.add(radconta5);
				panelContoh5.add(radcontb5);
				panelContoh5.add(radcontc5);
				panelContoh5.add(radcontd5);
				panelContoh5.add(radconte5);
				panelContoh5.add(jawaban5);
				/**
				JPanel panelTrik5 = new JPanel();
				JLabel trik15 = new JLabel("Pilih kata yang berbeda dari pilihan jawaban yang tersedia");
				panelTrik5.setLayout(new GridLayout(4,1));
				panelTrik5.setBorder(BorderFactory.createTitledBorder("TRIK!"));
				panelTrik5.add(trik15);
				**/
				JPanel panelGabung5 = new JPanel();
				JPanel panelPenjelasan5 = new JPanel();
				JLabel penjelasan51 = new JLabel("Pubawisesa bermakna kekuasaan");
				JLabel penjelasan52 = new JLabel("sepenuh-penuhnya.");
				mulai2.setFont(fsoal);
				panelPenjelasan5.setLayout(new GridLayout(3,1));
				panelPenjelasan5.add(penjelasan51);
				panelPenjelasan5.add(penjelasan52);
				//panelGabung5.add(panelTrik5);
				panelGabung5.add(panelPenjelasan5);
				panelGabung5.add(mulai2);
				contoh5.add(panelContoh5);
				contoh5.add(panelGabung5);
		
		if(i==-0)
		{
			master.add(awal);
		}
	
		JLabel label1 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label2 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label3 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label4 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label5 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label6 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label7 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label8 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label9 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label10 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label11 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label12 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label13 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label14 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label15 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label16 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label17 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label18 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label19 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label20 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label21 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label22 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label23 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label24 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label25 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label26 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label27 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label28 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label29 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label30 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label31 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label32 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label33 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label34 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label35 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label36 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label37 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label38 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label39 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label40 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label41 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label42 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label43 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label44 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label45 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label46 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label47 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label48 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label49 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		JLabel label50 = new JLabel("LATIHAN KEMAMPUAN VERBAL SINONIM");
		label1.setFont(fjudul);
		label2.setFont(fjudul);
		label3.setFont(fjudul);
		label4.setFont(fjudul);
		label5.setFont(fjudul);
		label6.setFont(fjudul);
		label7.setFont(fjudul);
		label8.setFont(fjudul);
		label9.setFont(fjudul);
		label10.setFont(fjudul);
		label11.setFont(fjudul);
		label12.setFont(fjudul);
		label13.setFont(fjudul);
		label14.setFont(fjudul);
		label15.setFont(fjudul);
		label16.setFont(fjudul);
		label17.setFont(fjudul);
		label18.setFont(fjudul);
		label19.setFont(fjudul);
		label20.setFont(fjudul);
		label21.setFont(fjudul);
		label22.setFont(fjudul);
		label23.setFont(fjudul);
		label24.setFont(fjudul);
		label25.setFont(fjudul);
		label26.setFont(fjudul);
		label27.setFont(fjudul);
		label28.setFont(fjudul);
		label29.setFont(fjudul);
		label30.setFont(fjudul);
		label31.setFont(fjudul);
		label32.setFont(fjudul);
		label33.setFont(fjudul);
		label34.setFont(fjudul);
		label35.setFont(fjudul);
		label36.setFont(fjudul);
		label37.setFont(fjudul);
		label38.setFont(fjudul);
		label39.setFont(fjudul);
		label40.setFont(fjudul);
		label41.setFont(fjudul);
		label42.setFont(fjudul);
		label43.setFont(fjudul);
		label44.setFont(fjudul);
		label45.setFont(fjudul);
		label46.setFont(fjudul);
		label47.setFont(fjudul);
		label48.setFont(fjudul);
		label49.setFont(fjudul);
		label50.setFont(fjudul);
		
		JLabel lbl1 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl2 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl3 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl4 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl5 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl6 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl7 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl8 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl9 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl10 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl11 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl12 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl13 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl14 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl15 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl16 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl17 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl18 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl19 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl20 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl21 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl22 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl23 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl24 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl25 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl26 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl27 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl28 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl29 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl30 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl31 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl32 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl33 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl34 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl35 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl36 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl37 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl38 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl39 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl40 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl41 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl42 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl43 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl44 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl45 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl46 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl47 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl48 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl49 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		JLabel lbl50 = new JLabel("Pilihlah satu jawaban bertanda (A),(B),(C),(D), atau (E) yang mempunyai arti sama atau paling dekat dengan arti kata yang dicetak dengan huruf kapital.");
		
		lbl1.setFont(fsoal);
		lbl2.setFont(fsoal);
		lbl3.setFont(fsoal);
		lbl4.setFont(fsoal);
		lbl5.setFont(fsoal);
		lbl6.setFont(fsoal);
		lbl7.setFont(fsoal);
		lbl8.setFont(fsoal);
		lbl9.setFont(fsoal);
		lbl10.setFont(fsoal);
		lbl11.setFont(fsoal);
		lbl12.setFont(fsoal);
		lbl13.setFont(fsoal);
		lbl14.setFont(fsoal);
		lbl15.setFont(fsoal);
		lbl16.setFont(fsoal);
		lbl17.setFont(fsoal);
		lbl18.setFont(fsoal);
		lbl19.setFont(fsoal);
		lbl20.setFont(fsoal);
		lbl21.setFont(fsoal);
		lbl22.setFont(fsoal);
		lbl23.setFont(fsoal);
		lbl24.setFont(fsoal);
		lbl25.setFont(fsoal);
		lbl26.setFont(fsoal);
		lbl27.setFont(fsoal);
		lbl28.setFont(fsoal);
		lbl29.setFont(fsoal);
		lbl30.setFont(fsoal);
		lbl31.setFont(fsoal);
		lbl32.setFont(fsoal);
		lbl33.setFont(fsoal);
		lbl34.setFont(fsoal);
		lbl35.setFont(fsoal);
		lbl36.setFont(fsoal);
		lbl37.setFont(fsoal);
		lbl38.setFont(fsoal);
		lbl39.setFont(fsoal);
		lbl40.setFont(fsoal);
		lbl41.setFont(fsoal);
		lbl42.setFont(fsoal);
		lbl43.setFont(fsoal);
		lbl44.setFont(fsoal);
		lbl45.setFont(fsoal);
		lbl46.setFont(fsoal);
		lbl47.setFont(fsoal);
		lbl48.setFont(fsoal);
		lbl49.setFont(fsoal);
		lbl50.setFont(fsoal);
		
		//soal nomor 1
		soal1.setLayout(new GridLayout(10,1));
		soal1.add(label1);
		soal1.add(lbl1);
		soal1.add(per1);
		soal1.add(rad1a);
		soal1.add(rad1b);
		soal1.add(rad1c);
		soal1.add(rad1d);
		soal1.add(rad1e);
		soal1.add(next);
		bt.add(rad1a);
		bt.add(rad1b);
		bt.add(rad1c);
		bt.add(rad1d);
		bt.add(rad1e);
		JPanel master1 = new JPanel();
		master1.add(soal1);
		
		//soal nomor 2
		soal2.setLayout(new GridLayout(10,1));
		soal2.add(label2);
		soal2.add(lbl2);
		soal2.add(per2);
		soal2.add(rad2a);
		soal2.add(rad2b);
		soal2.add(rad2c);
		soal2.add(rad2d);
		soal2.add(rad2e);
		JPanel gabungnextback = new JPanel();
		gabungnextback.setLayout(new GridLayout(1,2));
		gabungnextback.add(back2);
		gabungnextback.add(next2);
		soal2.add(gabungnextback);
		bt2.add(rad2a);
		bt2.add(rad2b);
		bt2.add(rad2c);
		bt2.add(rad2d);
		bt2.add(rad2e);
		JPanel master2 = new JPanel();
		master2.add(soal2);
		
		//soal nomor 3
		soal3.setLayout(new GridLayout(10,1));
		soal3.add(label3);
		soal3.add(lbl3);
		soal3.add(per3);
		soal3.add(rad3a);
		soal3.add(rad3b);
		soal3.add(rad3c);
		soal3.add(rad3d);
		soal3.add(rad3e);
		JPanel gabungnextback3 = new JPanel();
		gabungnextback3.setLayout(new GridLayout(1,2));
		gabungnextback3.add(back3);
		gabungnextback3.add(next3);
		soal3.add(gabungnextback3);
		bt3.add(rad3a);
		bt3.add(rad3b);
		bt3.add(rad3c);
		bt3.add(rad3d);
		bt3.add(rad3e);
		JPanel master3 = new JPanel();
		master3.add(soal3);
		
		//soal nomor 4
		soal4.setLayout(new GridLayout(10,1));
		soal4.add(label4);
		soal4.add(lbl4);
		soal4.add(per4);
		soal4.add(rad4a);
		soal4.add(rad4b);
		soal4.add(rad4c);
		soal4.add(rad4d);
		soal4.add(rad4e);
		JPanel gabungnextback4 = new JPanel();
		gabungnextback4.setLayout(new GridLayout(1,2));
		gabungnextback4.add(back4);
		gabungnextback4.add(next4);
		soal4.add(gabungnextback4);
		bt4.add(rad4a);
		bt4.add(rad4b);
		bt4.add(rad4c);
		bt4.add(rad4d);
		bt4.add(rad4e);
		JPanel master4 = new JPanel();
		master4.add(soal4);
		
		//soal nomor 5
		soal5.setLayout(new GridLayout(10,1));
		soal5.add(label5);
		soal5.add(lbl5);
		soal5.add(per5);
		soal5.add(rad5a);
		soal5.add(rad5b);
		soal5.add(rad5c);
		soal5.add(rad5d);
		soal5.add(rad5e);
		JPanel gabungnextback5 = new JPanel();
		gabungnextback5.setLayout(new GridLayout(1,2));
		gabungnextback5.add(back5);
		gabungnextback5.add(next5);
		soal5.add(gabungnextback5);
		bt5.add(rad5a);
		bt5.add(rad5b);
		bt5.add(rad5c);
		bt5.add(rad5d);
		bt5.add(rad5e);
		JPanel master5 = new JPanel();
		master5.add(soal5);
		
		//soal nomor 6
		soal6.setLayout(new GridLayout(10,1));
		soal6.add(label6);
		soal6.add(lbl6);
		soal6.add(per6);
		soal6.add(rad6a);
		soal6.add(rad6b);
		soal6.add(rad6c);
		soal6.add(rad6d);
		soal6.add(rad6e);
		JPanel gabungnextback6 = new JPanel();
		gabungnextback6.setLayout(new GridLayout(1,2));
		gabungnextback6.add(back6);
		gabungnextback6.add(next6);
		soal6.add(gabungnextback6);
		bt6.add(rad6a);
		bt6.add(rad6b);
		bt6.add(rad6c);
		bt6.add(rad6d);
		bt6.add(rad6e);
		JPanel master6 = new JPanel();
		master6.add(soal6);
		
		//soal nomor 7
		soal7.setLayout(new GridLayout(10,1));
		soal7.add(label7);
		soal7.add(lbl7);
		soal7.add(per7);
		soal7.add(rad7a);
		soal7.add(rad7b);
		soal7.add(rad7c);
		soal7.add(rad7d);
		soal7.add(rad7e);
		JPanel gabungnextback7 = new JPanel();
		gabungnextback7.setLayout(new GridLayout(1,2));
		gabungnextback7.add(back7);
		gabungnextback7.add(next7);
		soal7.add(gabungnextback7);
		bt7.add(rad7a);
		bt7.add(rad7b);
		bt7.add(rad7c);
		bt7.add(rad7d);
		bt7.add(rad7e);
		JPanel master7 = new JPanel();
		master7.add(soal7);
		
		//soal nomor 8
		soal8.setLayout(new GridLayout(10,1));
		soal8.add(label8);
		soal8.add(lbl8);
		soal8.add(per8);
		soal8.add(rad8a);
		soal8.add(rad8b);
		soal8.add(rad8c);
		soal8.add(rad8d);
		soal8.add(rad8e);
		JPanel gabungnextback8 = new JPanel();
		gabungnextback8.setLayout(new GridLayout(1,2));
		gabungnextback8.add(back8);
		gabungnextback8.add(next8);
		soal8.add(gabungnextback8);
		bt8.add(rad8a);
		bt8.add(rad8b);
		bt8.add(rad8c);
		bt8.add(rad8d);
		bt8.add(rad8e);
		JPanel master8 = new JPanel();
		master8.add(soal8);
		
		//soal nomor 9
		soal9.setLayout(new GridLayout(10,1));
		soal9.add(label9);
		soal9.add(lbl9);
		soal9.add(per9);
		soal9.add(rad9a);
		soal9.add(rad9b);
		soal9.add(rad9c);
		soal9.add(rad9d);
		soal9.add(rad9e);
		JPanel gabungnextback9 = new JPanel();
		gabungnextback9.setLayout(new GridLayout(1,2));
		gabungnextback9.add(back9);
		gabungnextback9.add(next9);
		soal9.add(gabungnextback9);
		bt9.add(rad9a);
		bt9.add(rad9b);
		bt9.add(rad9c);
		bt9.add(rad9d);
		bt9.add(rad9e);
		JPanel master9 = new JPanel();
		master9.add(soal9);
		
		//soal nomor 10
		soal10.setLayout(new GridLayout(10,1));
		soal10.add(label10);
		soal10.add(lbl10);
		soal10.add(per10);
		soal10.add(rad10a);
		soal10.add(rad10b);
		soal10.add(rad10c);
		soal10.add(rad10d);
		soal10.add(rad10e);
		JPanel gabungnextback10 = new JPanel();
		gabungnextback10.setLayout(new GridLayout(1,2));
		gabungnextback10.add(back10);
		gabungnextback10.add(next10);
		soal10.add(gabungnextback10);
		bt10.add(rad10a);
		bt10.add(rad10b);
		bt10.add(rad10c);
		bt10.add(rad10d);
		bt10.add(rad10e);
		JPanel master10 = new JPanel();
		master10.add(soal10);
		
		//soal nomor 11
		soal11.setLayout(new GridLayout(10,1));
		soal11.add(label11);
		soal11.add(lbl11);
		soal11.add(per11);
		soal11.add(rad11a);
		soal11.add(rad11b);
		soal11.add(rad11c);
		soal11.add(rad11d);
		soal11.add(rad11e);
		JPanel gabungnextback11 = new JPanel();
		gabungnextback11.setLayout(new GridLayout(1,2));
		gabungnextback11.add(back11);
		gabungnextback11.add(next11);
		soal11.add(gabungnextback11);
		bt11.add(rad11a);
		bt11.add(rad11b);
		bt11.add(rad11c);
		bt11.add(rad11d);
		bt11.add(rad11e);
		JPanel master11 = new JPanel();
		master11.add(soal11);
		
		//soal nomor 12
		soal12.setLayout(new GridLayout(10,1));
		soal12.add(label12);
		soal12.add(lbl12);
		soal12.add(per12);
		soal12.add(rad12a);
		soal12.add(rad12b);
		soal12.add(rad12c);
		soal12.add(rad12d);
		soal12.add(rad12e);
		JPanel gabungnextback12 = new JPanel();
		gabungnextback12.setLayout(new GridLayout(1,2));
		gabungnextback12.add(back12);
		gabungnextback12.add(next12);
		soal12.add(gabungnextback12);
		bt12.add(rad12a);
		bt12.add(rad12b);
		bt12.add(rad12c);
		bt12.add(rad12d);
		bt12.add(rad12e);
		JPanel master12 = new JPanel();
		master12.add(soal12);
		
		//soal nomor 13
		soal13.setLayout(new GridLayout(10,1));
		soal13.add(label13);
		soal13.add(lbl13);
		soal13.add(per13);
		soal13.add(rad13a);
		soal13.add(rad13b);
		soal13.add(rad13c);
		soal13.add(rad13d);
		soal13.add(rad13e);
		JPanel gabungnextback13 = new JPanel();
		gabungnextback13.setLayout(new GridLayout(1,2));
		gabungnextback13.add(back13);
		gabungnextback13.add(next13);
		soal13.add(gabungnextback13);
		bt13.add(rad13a);
		bt13.add(rad13b);
		bt13.add(rad13c);
		bt13.add(rad13d);
		bt13.add(rad13e);
		JPanel master13 = new JPanel();
		master13.add(soal13);
		
		//soal nomor 14
		soal14.setLayout(new GridLayout(10,1));
		soal14.add(label14);
		soal14.add(lbl14);
		soal14.add(per14);
		soal14.add(rad14a);
		soal14.add(rad14b);
		soal14.add(rad14c);
		soal14.add(rad14d);
		soal14.add(rad14e);
		JPanel gabungnextback14 = new JPanel();
		gabungnextback14.setLayout(new GridLayout(1,2));
		gabungnextback14.add(back14);
		gabungnextback14.add(next14);
		soal14.add(gabungnextback14);
		bt14.add(rad14a);
		bt14.add(rad14b);
		bt14.add(rad14c);
		bt14.add(rad14d);
		bt14.add(rad14e);
		JPanel master14 = new JPanel();
		master14.add(soal14);
		
		//soal nomor 15
		soal15.setLayout(new GridLayout(10,1));
		soal15.add(label15);
		soal15.add(lbl15);
		soal15.add(per15);
		soal15.add(rad15a);
		soal15.add(rad15b);
		soal15.add(rad15c);
		soal15.add(rad15d);
		soal15.add(rad15e);
		JPanel gabungnextback15 = new JPanel();
		gabungnextback15.setLayout(new GridLayout(1,2));
		gabungnextback15.add(back15);
		gabungnextback15.add(next15);
		soal15.add(gabungnextback15);
		bt15.add(rad15a);
		bt15.add(rad15b);
		bt15.add(rad15c);
		bt15.add(rad15d);
		bt15.add(rad15e);
		JPanel master15 = new JPanel();
		master15.add(soal15);
		
		//soal nomor 16
		soal16.setLayout(new GridLayout(10,1));
		soal16.add(label16);
		soal16.add(lbl16);
		soal16.add(per16);
		soal16.add(rad16a);
		soal16.add(rad16b);
		soal16.add(rad16c);
		soal16.add(rad16d);
		soal16.add(rad16e);
		JPanel gabungnextback16 = new JPanel();
		gabungnextback16.setLayout(new GridLayout(1,2));
		gabungnextback16.add(back16);
		gabungnextback16.add(next16);
		soal16.add(gabungnextback16);
		bt16.add(rad16a);
		bt16.add(rad16b);
		bt16.add(rad16c);
		bt16.add(rad16d);
		bt16.add(rad16e);
		JPanel master16 = new JPanel();
		master16.add(soal16);
		
		//soal nomor 17
		soal17.setLayout(new GridLayout(10,1));
		soal17.add(label17);
		soal17.add(lbl17);
		soal17.add(per17);
		soal17.add(rad17a);
		soal17.add(rad17b);
		soal17.add(rad17c);
		soal17.add(rad17d);
		soal17.add(rad17e);
		JPanel gabungnextback17 = new JPanel();
		gabungnextback17.setLayout(new GridLayout(1,2));
		gabungnextback17.add(back17);
		gabungnextback17.add(next17);
		soal17.add(gabungnextback17);
		bt17.add(rad17a);
		bt17.add(rad17b);
		bt17.add(rad17c);
		bt17.add(rad17d);
		bt17.add(rad17e);
		JPanel master17 = new JPanel();
		master17.add(soal17);
		
				//soal nomor 18
				soal18.setLayout(new GridLayout(10,1));
				soal18.add(label18);
				soal18.add(lbl18);
				soal18.add(per18);
				soal18.add(rad18a);
				soal18.add(rad18b);
				soal18.add(rad18c);
				soal18.add(rad18d);
				soal18.add(rad18e);
				JPanel gabungnextback18 = new JPanel();
				gabungnextback18.setLayout(new GridLayout(1,2));
				gabungnextback18.add(back18);
				gabungnextback18.add(next18);
				soal18.add(gabungnextback18);
				bt18.add(rad18a);
				bt18.add(rad18b);
				bt18.add(rad18c);
				bt18.add(rad18d);
				bt18.add(rad18e);
				JPanel master18 = new JPanel();
				master18.add(soal18);
				
				//soal nomor 19
				soal19.setLayout(new GridLayout(10,1));
				soal19.add(label19);
				soal19.add(lbl19);
				soal19.add(per19);
				soal19.add(rad19a);
				soal19.add(rad19b);
				soal19.add(rad19c);
				soal19.add(rad19d);
				soal19.add(rad19e);
				JPanel gabungnextback19 = new JPanel();
				gabungnextback19.setLayout(new GridLayout(1,2));
				gabungnextback19.add(back19);
				gabungnextback19.add(next19);
				soal19.add(gabungnextback19);
				bt19.add(rad19a);
				bt19.add(rad19b);
				bt19.add(rad19c);
				bt19.add(rad19d);
				bt19.add(rad19e);
				JPanel master19 = new JPanel();
				master19.add(soal19);
				
				//soal nomor 20
				soal20.setLayout(new GridLayout(10,1));
				soal20.add(label20);
				soal20.add(lbl20);
				soal20.add(per20);
				soal20.add(rad20a);
				soal20.add(rad20b);
				soal20.add(rad20c);
				soal20.add(rad20d);
				soal20.add(rad20e);
				JPanel gabungnextback20 = new JPanel();
				gabungnextback20.setLayout(new GridLayout(1,2));
				gabungnextback20.add(back20);
				gabungnextback20.add(next20);
				soal20.add(gabungnextback20);
				bt20.add(rad20a);
				bt20.add(rad20b);
				bt20.add(rad20c);
				bt20.add(rad20d);
				bt20.add(rad20e);
				JPanel master20 = new JPanel();
				master20.add(soal20);
				
				//soal nomor 21
				soal21.setLayout(new GridLayout(10,1));
				soal21.add(label21);
				soal21.add(lbl21);
				soal21.add(per21);
				soal21.add(rad21a);
				soal21.add(rad21b);
				soal21.add(rad21c);
				soal21.add(rad21d);
				soal21.add(rad21e);
				JPanel gabungnextback21 = new JPanel();
				gabungnextback21.setLayout(new GridLayout(1,2));
				gabungnextback21.add(back21);
				gabungnextback21.add(next21);
				soal21.add(gabungnextback21);
				bt21.add(rad21a);
				bt21.add(rad21b);
				bt21.add(rad21c);
				bt21.add(rad21d);
				bt21.add(rad21e);
				JPanel master21 = new JPanel();
				master21.add(soal21);
				
				//soal nomor 22
				soal22.setLayout(new GridLayout(10,1));
				soal22.add(label22);
				soal22.add(lbl22);
				soal22.add(per22);
				soal22.add(rad22a);
				soal22.add(rad22b);
				soal22.add(rad22c);
				soal22.add(rad22d);
				soal22.add(rad22e);
				JPanel gabungnextback22 = new JPanel();
				gabungnextback22.setLayout(new GridLayout(1,2));
				gabungnextback22.add(back22);
				gabungnextback22.add(next22);
				soal22.add(gabungnextback22);
				bt22.add(rad22a);
				bt22.add(rad22b);
				bt22.add(rad22c);
				bt22.add(rad22d);
				bt22.add(rad22e);
				JPanel master22 = new JPanel();
				master22.add(soal22);
				
				//soal nomor 23
				soal23.setLayout(new GridLayout(10,1));
				soal23.add(label23);
				soal23.add(lbl23);
				soal23.add(per23);
				soal23.add(rad23a);
				soal23.add(rad23b);
				soal23.add(rad23c);
				soal23.add(rad23d);
				soal23.add(rad23e);
				JPanel gabungnextback23 = new JPanel();
				gabungnextback23.setLayout(new GridLayout(1,2));
				gabungnextback23.add(back23);
				gabungnextback23.add(next23);
				soal23.add(gabungnextback23);
				bt23.add(rad23a);
				bt23.add(rad23b);
				bt23.add(rad23c);
				bt23.add(rad23d);
				bt23.add(rad23e);
				JPanel master23 = new JPanel();
				master23.add(soal23);
				
				//soal nomor 24
				soal24.setLayout(new GridLayout(10,1));
				soal24.add(label24);
				soal24.add(lbl24);
				soal24.add(per24);
				soal24.add(rad24a);
				soal24.add(rad24b);
				soal24.add(rad24c);
				soal24.add(rad24d);
				soal24.add(rad24e);
				JPanel gabungnextback24 = new JPanel();
				gabungnextback24.setLayout(new GridLayout(1,2));
				gabungnextback24.add(back24);
				gabungnextback24.add(next24);
				soal24.add(gabungnextback24);
				bt24.add(rad24a);
				bt24.add(rad24b);
				bt24.add(rad24c);
				bt24.add(rad24d);
				bt24.add(rad24e);
				JPanel master24 = new JPanel();
				master24.add(soal24);
				
				//soal nomor 25
				soal25.setLayout(new GridLayout(10,1));
				soal25.add(label25);
				soal25.add(lbl25);
				soal25.add(per25);
				soal25.add(rad25a);
				soal25.add(rad25b);
				soal25.add(rad25c);
				soal25.add(rad25d);
				soal25.add(rad25e);
				JPanel gabungnextback25 = new JPanel();
				gabungnextback25.setLayout(new GridLayout(1,2));
				gabungnextback25.add(back25);
				gabungnextback25.add(next25);
				soal25.add(gabungnextback25);
				bt25.add(rad25a);
				bt25.add(rad25b);
				bt25.add(rad25c);
				bt25.add(rad25d);
				bt25.add(rad25e);
				JPanel master25 = new JPanel();
				master25.add(soal25);
				
				//soal nomor 26
				soal26.setLayout(new GridLayout(10,1));
				soal26.add(label26);
				soal26.add(lbl26);
				soal26.add(per26);
				soal26.add(rad26a);
				soal26.add(rad26b);
				soal26.add(rad26c);
				soal26.add(rad26d);
				soal26.add(rad26e);
				JPanel gabungnextback26 = new JPanel();
				gabungnextback26.setLayout(new GridLayout(1,2));
				gabungnextback26.add(back26);
				gabungnextback26.add(next26);
				soal26.add(gabungnextback26);
				bt26.add(rad26a);
				bt26.add(rad26b);
				bt26.add(rad26c);
				bt26.add(rad26d);
				bt26.add(rad26e);
				JPanel master26 = new JPanel();
				master26.add(soal26);
				
				//soal nomor 27
				soal27.setLayout(new GridLayout(10,1));
				soal27.add(label27);
				soal27.add(lbl27);
				soal27.add(per27);
				soal27.add(rad27a);
				soal27.add(rad27b);
				soal27.add(rad27c);
				soal27.add(rad27d);
				soal27.add(rad27e);
				JPanel gabungnextback27 = new JPanel();
				gabungnextback27.setLayout(new GridLayout(1,2));
				gabungnextback27.add(back27);
				gabungnextback27.add(next27);
				soal27.add(gabungnextback27);
				bt27.add(rad27a);
				bt27.add(rad27b);
				bt27.add(rad27c);
				bt27.add(rad27d);
				bt27.add(rad27e);
				JPanel master27 = new JPanel();
				master27.add(soal27);
				
				//soal nomor 28
				soal28.setLayout(new GridLayout(10,1));
				soal28.add(label28);
				soal28.add(lbl28);
				soal28.add(per28);
				soal28.add(rad28a);
				soal28.add(rad28b);
				soal28.add(rad28c);
				soal28.add(rad28d);
				soal28.add(rad28e);
				JPanel gabungnextback28 = new JPanel();
				gabungnextback28.setLayout(new GridLayout(1,2));
				gabungnextback28.add(back28);
				gabungnextback28.add(next28);
				soal28.add(gabungnextback28);
				bt28.add(rad28a);
				bt28.add(rad28b);
				bt28.add(rad28c);
				bt28.add(rad28d);
				bt28.add(rad28e);
				JPanel master28 = new JPanel();
				master28.add(soal28);
				
				//soal nomor 29
				soal29.setLayout(new GridLayout(10,1));
				soal29.add(label29);
				soal29.add(lbl29);
				soal29.add(per29);
				soal29.add(rad29a);
				soal29.add(rad29b);
				soal29.add(rad29c);
				soal29.add(rad29d);
				soal29.add(rad29e);
				JPanel gabungnextback29 = new JPanel();
				gabungnextback29.setLayout(new GridLayout(1,2));
				gabungnextback29.add(back29);
				gabungnextback29.add(next29);
				soal29.add(gabungnextback29);
				bt29.add(rad29a);
				bt29.add(rad29b);
				bt29.add(rad29c);
				bt29.add(rad29d);
				bt29.add(rad29e);
				JPanel master29 = new JPanel();
				master29.add(soal29);
				
				//soal nomor 30
				soal30.setLayout(new GridLayout(10,1));
				soal30.add(label30);
				soal30.add(lbl30);
				soal30.add(per30);
				soal30.add(rad30a);
				soal30.add(rad30b);
				soal30.add(rad30c);
				soal30.add(rad30d);
				soal30.add(rad30e);
				JPanel gabungnextback30 = new JPanel();
				gabungnextback30.setLayout(new GridLayout(1,2));
				gabungnextback30.add(back30);
				gabungnextback30.add(next30);
				soal30.add(gabungnextback30);
				bt30.add(rad30a);
				bt30.add(rad30b);
				bt30.add(rad30c);
				bt30.add(rad30d);
				bt30.add(rad30e);
				JPanel master30 = new JPanel();
				master30.add(soal30);
				
				//soal nomor 31
				soal31.setLayout(new GridLayout(10,1));
				soal31.add(label31);
				soal31.add(lbl31);
				soal31.add(per31);
				soal31.add(rad31a);
				soal31.add(rad31b);
				soal31.add(rad31c);
				soal31.add(rad31d);
				soal31.add(rad31e);
				JPanel gabungnextback31 = new JPanel();
				gabungnextback31.setLayout(new GridLayout(1,2));
				gabungnextback31.add(back31);
				gabungnextback31.add(next31);
				soal31.add(gabungnextback31);
				bt31.add(rad31a);
				bt31.add(rad31b);
				bt31.add(rad31c);
				bt31.add(rad31d);
				bt31.add(rad31e);
				JPanel master31 = new JPanel();
				master31.add(soal31);
				
				//soal nomor 32
				soal32.setLayout(new GridLayout(10,1));
				soal32.add(label32);
				soal32.add(lbl32);
				soal32.add(per32);
				soal32.add(rad32a);
				soal32.add(rad32b);
				soal32.add(rad32c);
				soal32.add(rad32d);
				soal32.add(rad32e);
				JPanel gabungnextback32 = new JPanel();
				gabungnextback32.setLayout(new GridLayout(1,2));
				gabungnextback32.add(back32);
				gabungnextback32.add(next32);
				soal32.add(gabungnextback32);
				bt32.add(rad32a);
				bt32.add(rad32b);
				bt32.add(rad32c);
				bt32.add(rad32d);
				bt32.add(rad32e);
				JPanel master32 = new JPanel();
				master32.add(soal32);
				
				//soal nomor 33
				soal33.setLayout(new GridLayout(10,1));
				soal33.add(label33);
				soal33.add(lbl33);
				soal33.add(per33);
				soal33.add(rad33a);
				soal33.add(rad33b);
				soal33.add(rad33c);
				soal33.add(rad33d);
				soal33.add(rad33e);
				JPanel gabungnextback33 = new JPanel();
				gabungnextback33.setLayout(new GridLayout(1,2));
				gabungnextback33.add(back33);
				gabungnextback33.add(next33);
				soal33.add(gabungnextback33);
				bt33.add(rad33a);
				bt33.add(rad33b);
				bt33.add(rad33c);
				bt33.add(rad33d);
				bt33.add(rad33e);
				JPanel master33 = new JPanel();
				master33.add(soal33);
				
				//soal nomor 34
				soal34.setLayout(new GridLayout(10,1));
				soal34.add(label34);
				soal34.add(lbl34);
				soal34.add(per34);
				soal34.add(rad34a);
				soal34.add(rad34b);
				soal34.add(rad34c);
				soal34.add(rad34d);
				soal34.add(rad34e);
				JPanel gabungnextback34 = new JPanel();
				gabungnextback34.setLayout(new GridLayout(1,2));
				gabungnextback34.add(back34);
				gabungnextback34.add(next34);
				soal34.add(gabungnextback34);
				bt34.add(rad34a);
				bt34.add(rad34b);
				bt34.add(rad34c);
				bt34.add(rad34d);
				bt34.add(rad34e);
				JPanel master34 = new JPanel();
				master34.add(soal34);
				
				//soal nomor 35
				soal35.setLayout(new GridLayout(10,1));
				soal35.add(label35);
				soal35.add(lbl35);
				soal35.add(per35);
				soal35.add(rad35a);
				soal35.add(rad35b);
				soal35.add(rad35c);
				soal35.add(rad35d);
				soal35.add(rad35e);
				JPanel gabungnextback35 = new JPanel();
				gabungnextback35.setLayout(new GridLayout(1,2));
				gabungnextback35.add(back35);
				gabungnextback35.add(next35);
				soal35.add(gabungnextback35);
				bt35.add(rad35a);
				bt35.add(rad35b);
				bt35.add(rad35c);
				bt35.add(rad35d);
				bt35.add(rad35e);
				JPanel master35 = new JPanel();
				master35.add(soal35);
				
				//soal nomor 36
				soal36.setLayout(new GridLayout(10,1));
				soal36.add(label36);
				soal36.add(lbl36);
				soal36.add(per36);
				soal36.add(rad36a);
				soal36.add(rad36b);
				soal36.add(rad36c);
				soal36.add(rad36d);
				soal36.add(rad36e);
				JPanel gabungnextback36 = new JPanel();
				gabungnextback36.setLayout(new GridLayout(1,2));
				gabungnextback36.add(back36);
				gabungnextback36.add(next36);
				soal36.add(gabungnextback36);
				bt36.add(rad36a);
				bt36.add(rad36b);
				bt36.add(rad36c);
				bt36.add(rad36d);
				bt36.add(rad36e);
				JPanel master36 = new JPanel();
				master36.add(soal36);
				
				//soal nomor 37
				soal37.setLayout(new GridLayout(10,1));
				soal37.add(label37);
				soal37.add(lbl37);
				soal37.add(per37);
				soal37.add(rad37a);
				soal37.add(rad37b);
				soal37.add(rad37c);
				soal37.add(rad37d);
				soal37.add(rad37e);
				JPanel gabungnextback37 = new JPanel();
				gabungnextback37.setLayout(new GridLayout(1,2));
				gabungnextback37.add(back37);
				gabungnextback37.add(next37);
				soal37.add(gabungnextback37);
				bt37.add(rad37a);
				bt37.add(rad37b);
				bt37.add(rad37c);
				bt37.add(rad37d);
				bt37.add(rad37e);
				JPanel master37 = new JPanel();
				master37.add(soal37);
				
				//soal nomor 38
				soal38.setLayout(new GridLayout(10,1));
				soal38.add(label38);
				soal38.add(lbl38);
				soal38.add(per38);
				soal38.add(rad38a);
				soal38.add(rad38b);
				soal38.add(rad38c);
				soal38.add(rad38d);
				soal38.add(rad38e);
				JPanel gabungnextback38 = new JPanel();
				gabungnextback38.setLayout(new GridLayout(1,2));
				gabungnextback38.add(back38);
				gabungnextback38.add(next38);
				soal38.add(gabungnextback38);
				bt38.add(rad38a);
				bt38.add(rad38b);
				bt38.add(rad38c);
				bt38.add(rad38d);
				bt38.add(rad38e);
				JPanel master38 = new JPanel();
				master38.add(soal38);
				
				//soal nomor 39
				soal39.setLayout(new GridLayout(10,1));
				soal39.add(label39);
				soal39.add(lbl39);
				soal39.add(per39);
				soal39.add(rad39a);
				soal39.add(rad39b);
				soal39.add(rad39c);
				soal39.add(rad39d);
				soal39.add(rad39e);
				JPanel gabungnextback39 = new JPanel();
				gabungnextback39.setLayout(new GridLayout(1,2));
				gabungnextback39.add(back39);
				gabungnextback39.add(next39);
				soal39.add(gabungnextback39);
				bt39.add(rad39a);
				bt39.add(rad39b);
				bt39.add(rad39c);
				bt39.add(rad39d);
				bt39.add(rad39e);
				JPanel master39 = new JPanel();
				master39.add(soal39);
				
				//soal nomor 40
				soal40.setLayout(new GridLayout(10,1));
				soal40.add(label40);
				soal40.add(lbl40);
				soal40.add(per40);
				soal40.add(rad40a);
				soal40.add(rad40b);
				soal40.add(rad40c);
				soal40.add(rad40d);
				soal40.add(rad40e);
				JPanel gabungnextback40 = new JPanel();
				gabungnextback40.setLayout(new GridLayout(1,2));
				gabungnextback40.add(back40);
				gabungnextback40.add(next40);
				soal40.add(gabungnextback40);
				bt40.add(rad40a);
				bt40.add(rad40b);
				bt40.add(rad40c);
				bt40.add(rad40d);
				bt40.add(rad40e);
				JPanel master40 = new JPanel();
				master40.add(soal40);
				
				//soal nomor 41
				soal41.setLayout(new GridLayout(10,1));
				soal41.add(label41);
				soal41.add(lbl41);
				soal41.add(per41);
				soal41.add(rad41a);
				soal41.add(rad41b);
				soal41.add(rad41c);
				soal41.add(rad41d);
				soal41.add(rad41e);
				JPanel gabungnextback41 = new JPanel();
				gabungnextback41.setLayout(new GridLayout(1,2));
				gabungnextback41.add(back41);
				gabungnextback41.add(next41);
				soal41.add(gabungnextback41);
				bt41.add(rad41a);
				bt41.add(rad41b);
				bt41.add(rad41c);
				bt41.add(rad41d);
				bt41.add(rad41e);
				JPanel master41 = new JPanel();
				master41.add(soal41);
				
				//soal nomor 42
				soal42.setLayout(new GridLayout(10,1));
				soal42.add(label42);
				soal42.add(lbl42);
				soal42.add(per42);
				soal42.add(rad42a);
				soal42.add(rad42b);
				soal42.add(rad42c);
				soal42.add(rad42d);
				soal42.add(rad42e);
				JPanel gabungnextback42 = new JPanel();
				gabungnextback42.setLayout(new GridLayout(1,2));
				gabungnextback42.add(back42);
				gabungnextback42.add(next42);
				soal42.add(gabungnextback42);
				bt42.add(rad42a);
				bt42.add(rad42b);
				bt42.add(rad42c);
				bt42.add(rad42d);
				bt42.add(rad42e);
				JPanel master42 = new JPanel();
				master42.add(soal42);
				
				//soal nomor 43
				soal43.setLayout(new GridLayout(10,1));
				soal43.add(label43);
				soal43.add(lbl43);
				soal43.add(per43);
				soal43.add(rad43a);
				soal43.add(rad43b);
				soal43.add(rad43c);
				soal43.add(rad43d);
				soal43.add(rad43e);
				JPanel gabungnextback43 = new JPanel();
				gabungnextback43.setLayout(new GridLayout(1,2));
				gabungnextback43.add(back43);
				gabungnextback43.add(next43);
				soal43.add(gabungnextback43);
				bt43.add(rad43a);
				bt43.add(rad43b);
				bt43.add(rad43c);
				bt43.add(rad43d);
				bt43.add(rad43e);
				JPanel master43 = new JPanel();
				master43.add(soal43);
				
				//soal nomor 44
				soal44.setLayout(new GridLayout(10,1));
				soal44.add(label44);
				soal44.add(lbl44);
				soal44.add(per44);
				soal44.add(rad44a);
				soal44.add(rad44b);
				soal44.add(rad44c);
				soal44.add(rad44d);
				soal44.add(rad44e);
				JPanel gabungnextback44 = new JPanel();
				gabungnextback44.setLayout(new GridLayout(1,2));
				gabungnextback44.add(back44);
				gabungnextback44.add(next44);
				soal44.add(gabungnextback44);
				bt44.add(rad44a);
				bt44.add(rad44b);
				bt44.add(rad44c);
				bt44.add(rad44d);
				bt44.add(rad44e);
				JPanel master44 = new JPanel();
				master44.add(soal44);
				
				//soal nomor 45
				soal45.setLayout(new GridLayout(10,1));
				soal45.add(label45);
				soal45.add(lbl45);
				soal45.add(per45);
				soal45.add(rad45a);
				soal45.add(rad45b);
				soal45.add(rad45c);
				soal45.add(rad45d);
				soal45.add(rad45e);
				JPanel gabungnextback45 = new JPanel();
				gabungnextback45.setLayout(new GridLayout(1,2));
				gabungnextback45.add(back45);
				gabungnextback45.add(next45);
				soal45.add(gabungnextback45);
				bt45.add(rad45a);
				bt45.add(rad45b);
				bt45.add(rad45c);
				bt45.add(rad45d);
				bt45.add(rad45e);
				JPanel master45 = new JPanel();
				master45.add(soal45);
				
				//soal nomor 46
				soal46.setLayout(new GridLayout(10,1));
				soal46.add(label46);
				soal46.add(lbl46);
				soal46.add(per46);
				soal46.add(rad46a);
				soal46.add(rad46b);
				soal46.add(rad46c);
				soal46.add(rad46d);
				soal46.add(rad46e);
				JPanel gabungnextback46 = new JPanel();
				gabungnextback46.setLayout(new GridLayout(1,2));
				gabungnextback46.add(back46);
				gabungnextback46.add(next46);
				soal46.add(gabungnextback46);
				bt46.add(rad46a);
				bt46.add(rad46b);
				bt46.add(rad46c);
				bt46.add(rad46d);
				bt46.add(rad46e);
				JPanel master46 = new JPanel();
				master46.add(soal46);
				
				//soal nomor 47
				soal47.setLayout(new GridLayout(10,1));
				soal47.add(label47);
				soal47.add(lbl47);
				soal47.add(per47);
				soal47.add(rad47a);
				soal47.add(rad47b);
				soal47.add(rad47c);
				soal47.add(rad47d);
				soal47.add(rad47e);
				JPanel gabungnextback47 = new JPanel();
				gabungnextback47.setLayout(new GridLayout(1,2));
				gabungnextback47.add(back47);
				gabungnextback47.add(next47);
				soal47.add(gabungnextback47);
				bt47.add(rad47a);
				bt47.add(rad47b);
				bt47.add(rad47c);
				bt47.add(rad47d);
				bt47.add(rad47e);
				JPanel master47 = new JPanel();
				master47.add(soal47);
				
				//soal nomor 48
				soal48.setLayout(new GridLayout(10,1));
				soal48.add(label48);
				soal48.add(lbl48);
				soal48.add(per48);
				soal48.add(rad48a);
				soal48.add(rad48b);
				soal48.add(rad48c);
				soal48.add(rad48d);
				soal48.add(rad48e);
				JPanel gabungnextback48 = new JPanel();
				gabungnextback48.setLayout(new GridLayout(1,2));
				gabungnextback48.add(back48);
				gabungnextback48.add(next48);
				soal48.add(gabungnextback48);
				bt48.add(rad48a);
				bt48.add(rad48b);
				bt48.add(rad48c);
				bt48.add(rad48d);
				bt48.add(rad48e);
				JPanel master48 = new JPanel();
				master48.add(soal48);
				
				//soal nomor 49
				soal49.setLayout(new GridLayout(10,1));
				soal49.add(label49);
				soal49.add(lbl49);
				soal49.add(per49);
				soal49.add(rad49a);
				soal49.add(rad49b);
				soal49.add(rad49c);
				soal49.add(rad49d);
				soal49.add(rad49e);
				JPanel gabungnextback49 = new JPanel();
				gabungnextback49.setLayout(new GridLayout(1,2));
				gabungnextback49.add(back49);
				gabungnextback49.add(next49);
				soal49.add(gabungnextback49);
				bt49.add(rad49a);
				bt49.add(rad49b);
				bt49.add(rad49c);
				bt49.add(rad49d);
				bt49.add(rad49e);
				JPanel master49 = new JPanel();
				master49.add(soal49);
				
				//soal nomor 50
				soal50.setLayout(new GridLayout(10,1));
				soal50.add(label50);
				soal50.add(lbl50);
				soal50.add(per50);
				soal50.add(rad50a);
				soal50.add(rad50b);
				soal50.add(rad50c);
				soal50.add(rad50d);
				soal50.add(rad50e);
				JPanel gabungnextback50 = new JPanel();
				gabungnextback50.setLayout(new GridLayout(1,2));
				gabungnextback50.add(back50);
				gabungnextback50.add(next50);
				soal50.add(gabungnextback50);
				bt50.add(rad50a);
				bt50.add(rad50b);
				bt50.add(rad50c);
				bt50.add(rad50d);
				bt50.add(rad50e);
				master50.add(soal50);
		
		JPanel panelHome = new JPanel();		
		tab.addTab("Home", master);			
		tab.addTab("1", master1);
		tab.addTab("2", master2);
		tab.addTab("3", master3);
		tab.addTab("4", master4);
		tab.addTab("5", master5);
		tab.addTab("6", master6);
		tab.addTab("7", master7);
		tab.addTab("8", master8);
		tab.addTab("9", master9);
		tab.addTab("10", master10);
		tab.addTab("11", master11);
		tab.addTab("12", master12);
		tab.addTab("13", master13);
		tab.addTab("14", master14);
		tab.addTab("15", master15);
		tab.addTab("16", master16);
		tab.addTab("17", master17);
		tab.addTab("18", master18);
		tab.addTab("19", master19);
		tab.addTab("20", master20);
		tab.addTab("21", master21);
		tab.addTab("22", master22);
		tab.addTab("23", master23);
		tab.addTab("24", master24);
		tab.addTab("25", master25);
		tab.addTab("26", master26);
		tab.addTab("27", master27);
		tab.addTab("28", master28);
		tab.addTab("29", master29);
		tab.addTab("30", master30);
		tab.addTab("31", master31);
		tab.addTab("32", master32);
		tab.addTab("33", master33);
		tab.addTab("34", master34);
		tab.addTab("35", master35);
		tab.addTab("36", master36);
		tab.addTab("37", master37);
		tab.addTab("38", master38);
		tab.addTab("39", master39);
		tab.addTab("40", master40);
		tab.addTab("41", master41);
		tab.addTab("42", master42);
		tab.addTab("43", master43);
		tab.addTab("44", master44);
		tab.addTab("45", master45);
		tab.addTab("46", master46);
		tab.addTab("47", master47);
		tab.addTab("48", master48);
		tab.addTab("49", master49);
		tab.addTab("50", master50);
		
		tab.setEnabledAt(1, false);
		tab.setEnabledAt(2, false);
		tab.setEnabledAt(3, false);
		tab.setEnabledAt(4, false);
		tab.setEnabledAt(5, false);
		tab.setEnabledAt(6, false);
		tab.setEnabledAt(7, false);
		tab.setEnabledAt(8, false);
		tab.setEnabledAt(9, false);
		tab.setEnabledAt(10, false);
		tab.setEnabledAt(11, false);
		tab.setEnabledAt(12, false);
		tab.setEnabledAt(13, false);
		tab.setEnabledAt(14, false);
		tab.setEnabledAt(15, false);
		tab.setEnabledAt(16, false);
		tab.setEnabledAt(17, false);
		tab.setEnabledAt(18, false);
		tab.setEnabledAt(19, false);
		tab.setEnabledAt(20, false);
		tab.setEnabledAt(21, false);
		tab.setEnabledAt(22, false);
		tab.setEnabledAt(23, false);
		tab.setEnabledAt(24, false);
		tab.setEnabledAt(25, false);
		tab.setEnabledAt(26, false);
		tab.setEnabledAt(27, false);
		tab.setEnabledAt(28, false);
		tab.setEnabledAt(29, false);
		tab.setEnabledAt(30, false);
		tab.setEnabledAt(31, false);
		tab.setEnabledAt(32, false);
		tab.setEnabledAt(33, false);
		tab.setEnabledAt(34, false);
		tab.setEnabledAt(35, false);
		tab.setEnabledAt(36, false);
		tab.setEnabledAt(37, false);
		tab.setEnabledAt(38, false);
		tab.setEnabledAt(39, false);
		tab.setEnabledAt(40, false);
		tab.setEnabledAt(41, false);
		tab.setEnabledAt(42, false);
		tab.setEnabledAt(43, false);
		tab.setEnabledAt(44, false);
		tab.setEnabledAt(45, false);
		tab.setEnabledAt(46, false);
		tab.setEnabledAt(47, false);
		tab.setEnabledAt(48, false);
		tab.setEnabledAt(49, false);
		tab.setEnabledAt(50, false);

		konten.add(tab);
				
		
		penghendel hendel = new penghendel();
		next.addActionListener(hendel);
		next2.addActionListener(hendel);
		next3.addActionListener(hendel);
		next4.addActionListener(hendel);
		next5.addActionListener(hendel);
		next6.addActionListener(hendel);
		next7.addActionListener(hendel);
		next8.addActionListener(hendel);
		next9.addActionListener(hendel);
		next10.addActionListener(hendel);
		next11.addActionListener(hendel);
		next12.addActionListener(hendel);
		next13.addActionListener(hendel);
		next14.addActionListener(hendel);
		next15.addActionListener(hendel);
		next16.addActionListener(hendel);
		next17.addActionListener(hendel);
		next18.addActionListener(hendel);
		next19.addActionListener(hendel);
		next20.addActionListener(hendel);
		next21.addActionListener(hendel);
		next22.addActionListener(hendel);
		next23.addActionListener(hendel);
		next24.addActionListener(hendel);
		next25.addActionListener(hendel);
		next26.addActionListener(hendel);
		next27.addActionListener(hendel);
		next28.addActionListener(hendel);
		next29.addActionListener(hendel);
		next30.addActionListener(hendel);
		next31.addActionListener(hendel);
		next32.addActionListener(hendel);
		next33.addActionListener(hendel);
		next34.addActionListener(hendel);
		next35.addActionListener(hendel);
		next36.addActionListener(hendel);
		next37.addActionListener(hendel);
		next38.addActionListener(hendel);
		next39.addActionListener(hendel);
		next40.addActionListener(hendel);
		next41.addActionListener(hendel);
		next42.addActionListener(hendel);
		next43.addActionListener(hendel);
		next44.addActionListener(hendel);
		next45.addActionListener(hendel);
		next46.addActionListener(hendel);
		next47.addActionListener(hendel);
		next48.addActionListener(hendel);
		next49.addActionListener(hendel);
		next50.addActionListener(hendel);
		
		back2.addActionListener(hendel);
		back3.addActionListener(hendel);
		back4.addActionListener(hendel);
		back5.addActionListener(hendel);
		back6.addActionListener(hendel);
		back7.addActionListener(hendel);
		back8.addActionListener(hendel);
		back9.addActionListener(hendel);
		back10.addActionListener(hendel);
		back11.addActionListener(hendel);
		back12.addActionListener(hendel);
		back13.addActionListener(hendel);
		back14.addActionListener(hendel);
		back15.addActionListener(hendel);
		back16.addActionListener(hendel);
		back17.addActionListener(hendel);
		back18.addActionListener(hendel);
		back19.addActionListener(hendel);
		back20.addActionListener(hendel);
		back21.addActionListener(hendel);
		back22.addActionListener(hendel);
		back23.addActionListener(hendel);
		back24.addActionListener(hendel);
		back25.addActionListener(hendel);
		back26.addActionListener(hendel);
		back27.addActionListener(hendel);
		back28.addActionListener(hendel);
		back29.addActionListener(hendel);
		back30.addActionListener(hendel);
		back31.addActionListener(hendel);
		back32.addActionListener(hendel);
		back33.addActionListener(hendel);
		back34.addActionListener(hendel);
		back35.addActionListener(hendel);
		back36.addActionListener(hendel);
		back37.addActionListener(hendel);
		back38.addActionListener(hendel);
		back39.addActionListener(hendel);
		back40.addActionListener(hendel);
		back41.addActionListener(hendel);
		back42.addActionListener(hendel);
		back43.addActionListener(hendel);
		back44.addActionListener(hendel);
		back45.addActionListener(hendel);
		back46.addActionListener(hendel);
		back47.addActionListener(hendel);
		back48.addActionListener(hendel);
		back49.addActionListener(hendel);
		back50.addActionListener(hendel);
		
		lihatContoh.addActionListener(hendel);
		mulai.addActionListener(hendel);
		main_lagi.addActionListener(hendel);
		btnContohNext.addActionListener(hendel);
		btnContohNext2.addActionListener(hendel);
		btnContohNext3.addActionListener(hendel);
		btnContohNext4.addActionListener(hendel);
		mulai2.addActionListener(hendel);
		keluar.addActionListener(hendel);
		kunci.addActionListener(hendel);
		
		//hasil
		hasil = new JLabel();
		JLabel katahasil = new JLabel("Skor   : ");
		JLabel katagrade = new JLabel("Grade : ");
		Font fontHasil = new Font("BookMan Old Style", Font.BOLD, 30);
		katahasil.setFont(fontHasil);	
		katahasil.setForeground(Color.GRAY);
		katagrade.setFont(fontHasil);
		katagrade.setForeground(Color.GRAY);
		hasil.setFont(new Font("BookMan Old Style", Font.BOLD, 30));
		grade.setFont(new Font("BookMan Old Style", Font.BOLD, 30));
		Font fresult = new Font("Consolas", Font.BOLD, 20);
		JLabel wordbenar = new JLabel("Benar : ");
		wordbenar.setFont(fresult);
		JLabel wordsalah = new JLabel("Salah : ");
		wordsalah.setFont(fresult);
		JPanel gabungBenarSalah = new JPanel();
		benar.setForeground(Color.GREEN);
		benar.setFont(fresult);
		salah.setForeground(Color.RED);
		salah.setFont(fresult);
		gabungBenarSalah.setLayout(new GridLayout(2,2));
		gabungBenarSalah.setBorder(BorderFactory.createTitledBorder("Koreksi"));
		gabungBenarSalah.add(wordbenar);
		gabungBenarSalah.add(benar);
		gabungBenarSalah.add(wordsalah);
		gabungBenarSalah.add(salah);
		JPanel panelSkorGrade = new JPanel();
		panelSkorGrade.setLayout(new GridLayout(2,2));
		panelSkorGrade.add(katahasil);
		panelSkorGrade.add(hasil);
		panelSkorGrade.add(katagrade);
		panelSkorGrade.add(grade);
		JPanel gabungKe = new JPanel();
		gabungKe.setLayout(new FlowLayout());
		gabungKe.add(panelSkorGrade);
		gabungKe.add(gabungBenarSalah);
		JPanel gabungTombol = new JPanel();
		gabungTombol.setLayout(new GridLayout(3,0));
		main_lagi.setFont(fsoal);
		kunci.setFont(fsoal);
		keluar.setFont(fsoal);
		gabungTombol.add(main_lagi);
		gabungTombol.add(kunci);
		gabungTombol.add(keluar);
	
		result.setLayout(new GridLayout(3,1));
		result.add(imotikon);
		result.add(panelSkorGrade);
		result.add(gabungBenarSalah);
		result.add(gabungTombol);
		result.add(lbl(new JLabel("ŠPlanetMars323 Software House")));
		
	}
	
	//label
	private JLabel lbl(JLabel lobol)
	{
		lobol.setToolTipText("Bisa diklik :)");
		lobol.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				profil objProfil = new profil();
				objProfil.setVisible(true);
				objProfil.setSize(593,615);
				objProfil.setLocationRelativeTo(null);
				objProfil.setResizable(false);
			}
		}
		);
		
		return lobol;
	}
	
	private class penghendel implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==lihatContoh)
			{
				master.add(contoh);
				awal.setVisible(false);
				contoh.setVisible(true);
			}
			else if(e.getSource()==btnContohNext)
			{
				master.add(contoh2);
				contoh2.setVisible(true);
				contoh.setVisible(false);
			}
			else if(e.getSource()==btnContohNext2)
			{
				master.add(contoh3);
				contoh3.setVisible(true);
				contoh2.setVisible(false);
			}
			else if(e.getSource()==btnContohNext3)
			{
				master.add(contoh4);
				contoh4.setVisible(true);
				contoh3.setVisible(false);
			}
			else if(e.getSource()==btnContohNext4)
			{
				master.add(contoh5);
				contoh5.setVisible(true);
				contoh4.setVisible(false);
			}
			else if(e.getSource()==mulai2)
			{
				tab.setSelectedIndex(1);
				next50.setEnabled(true);
				awal.setVisible(true);
				contoh.setVisible(false);
				contoh5.setVisible(false);
				enableTab();
				clearRB();
				kembaliWarnaRB();
			}
			else if(e.getSource()==keluar)
			{
				System.exit(0);
			}
			else if(e.getSource()==kunci)
			{
				tab.setSelectedIndex(1);
				next50.setEnabled(false);
				result.setVisible(false);
				awal.setVisible(true);
				
				//kunci jawaban
				
				rad1d.setForeground(Color.GREEN);
				rad2e.setForeground(Color.GREEN);
				rad3e.setForeground(Color.GREEN);
				rad4c.setForeground(Color.GREEN);
				rad5b.setForeground(Color.GREEN);
				rad6e.setForeground(Color.GREEN);
				rad7b.setForeground(Color.GREEN);
				rad8b.setForeground(Color.GREEN);
				rad9a.setForeground(Color.GREEN);
				rad10c.setForeground(Color.GREEN);
				rad11e.setForeground(Color.GREEN);
				rad12a.setForeground(Color.GREEN);
				rad13e.setForeground(Color.GREEN);
				rad14e.setForeground(Color.GREEN);
				rad15b.setForeground(Color.GREEN);
				rad16e.setForeground(Color.GREEN);
				rad17b.setForeground(Color.GREEN);
				rad18e.setForeground(Color.GREEN);
				rad19b.setForeground(Color.GREEN);
				rad20b.setForeground(Color.GREEN);
				rad21d.setForeground(Color.GREEN);
				rad22d.setForeground(Color.GREEN);
				rad23c.setForeground(Color.GREEN);
				rad24a.setForeground(Color.GREEN);
				rad25c.setForeground(Color.GREEN);
				rad26a.setForeground(Color.GREEN);
				rad27b.setForeground(Color.GREEN);
				rad28c.setForeground(Color.GREEN);
				rad29a.setForeground(Color.GREEN);
				rad30e.setForeground(Color.GREEN);
				rad31c.setForeground(Color.GREEN);
				rad32d.setForeground(Color.GREEN);
				rad33d.setForeground(Color.GREEN);
				rad34d.setForeground(Color.GREEN);
				rad35a.setForeground(Color.GREEN);
				rad36e.setForeground(Color.GREEN);
				rad37c.setForeground(Color.GREEN);
				rad38b.setForeground(Color.GREEN);
				rad39b.setForeground(Color.GREEN);
				rad40b.setForeground(Color.GREEN);
				rad41e.setForeground(Color.GREEN);
				rad42a.setForeground(Color.GREEN);
				rad43e.setForeground(Color.GREEN);
				rad44d.setForeground(Color.GREEN);
				rad45a.setForeground(Color.GREEN);
				rad46b.setForeground(Color.GREEN);
				rad47e.setForeground(Color.GREEN);
				rad48b.setForeground(Color.GREEN);
				rad49a.setForeground(Color.GREEN);
				rad50b.setForeground(Color.GREEN);
			}
			else if(e.getSource()==next)
			{
				tab.setSelectedIndex(2);
				kembali();
			}
			else if(e.getSource()==next2)
			{
				tab.setSelectedIndex(3);
				kembali();
			}
			else if(e.getSource()==next3)
			{
				tab.setSelectedIndex(4);
				kembali();
			}
			else if(e.getSource()==next4)
			{
				tab.setSelectedIndex(5);
				kembali();
			}
			else if(e.getSource()==next5)
			{
				tab.setSelectedIndex(6);
				kembali();
			}
			else if(e.getSource()==next6)
			{
				tab.setSelectedIndex(7);
				kembali();
			}
			else if(e.getSource()==next7)
			{
				tab.setSelectedIndex(8);
				kembali();
			}
			else if(e.getSource()==next8)
			{
				tab.setSelectedIndex(9);
				kembali();
			}
			else if(e.getSource()==next9)
			{
				tab.setSelectedIndex(10);
				kembali();
			}
			else if(e.getSource()==next10)
			{
				tab.setSelectedIndex(11);
				kembali();
			}
			else if(e.getSource()==next11)
			{
				tab.setSelectedIndex(12);
				kembali();
			}
			else if(e.getSource()==next12)
			{
				tab.setSelectedIndex(13);
				kembali();
			}
			else if(e.getSource()==next13)
			{
				tab.setSelectedIndex(14);
				kembali();
			}
			else if(e.getSource()==next14)
			{
				tab.setSelectedIndex(15);
				kembali();
			}
			else if(e.getSource()==next15)
			{
				tab.setSelectedIndex(16);
				kembali();
			}
			else if(e.getSource()==next16)
			{
				tab.setSelectedIndex(17);
				kembali();
			}
			else if(e.getSource()==next17)
			{
				tab.setSelectedIndex(18);
				kembali();
			}
			else if(e.getSource()==next18)
			{
				tab.setSelectedIndex(19);
				kembali();
			}
			else if(e.getSource()==next19)
			{
				tab.setSelectedIndex(20);
				kembali();
			}
			else if(e.getSource()==next20)
			{
				tab.setSelectedIndex(21);
				kembali();
			}
			else if(e.getSource()==next21)
			{
				tab.setSelectedIndex(22);
				kembali();
			}
			else if(e.getSource()==next22)
			{
				tab.setSelectedIndex(23);
				kembali();
			}
			else if(e.getSource()==next23)
			{
				tab.setSelectedIndex(24);
				kembali();
			}
			else if(e.getSource()==next24)
			{
				tab.setSelectedIndex(25);
				kembali();
			}
			else if(e.getSource()==next25)
			{
				tab.setSelectedIndex(26);
				kembali();
			}
			else if(e.getSource()==next26)
			{
				tab.setSelectedIndex(27);
				kembali();
			}
			else if(e.getSource()==next27)
			{
				tab.setSelectedIndex(28);
				kembali();
			}
			else if(e.getSource()==next28)
			{
				tab.setSelectedIndex(29);
				kembali();
			}
			else if(e.getSource()==next29)
			{
				tab.setSelectedIndex(30);
				kembali();
			}
			else if(e.getSource()==next30)
			{
				tab.setSelectedIndex(31);
				kembali();
			}
			else if(e.getSource()==next31)
			{
				tab.setSelectedIndex(32);
				kembali();
			}
			else if(e.getSource()==next32)
			{
				tab.setSelectedIndex(33);
				kembali();
			}
			else if(e.getSource()==next33)
			{
				 tab.setSelectedIndex(34);
				 kembali();
			}
			else if(e.getSource()==next34)
			{
				tab.setSelectedIndex(35);
				kembali();
			}
			else if(e.getSource()==next35)
			{
				tab.setSelectedIndex(36);
				kembali();
			}
			else if(e.getSource()==next36)
			{
				tab.setSelectedIndex(37);
				kembali();
			}
			else if(e.getSource()==next37)
			{
				tab.setSelectedIndex(38);
				kembali();
			}
			else if(e.getSource()==next38)
			{
				tab.setSelectedIndex(39);
				kembali();
			}
			else if(e.getSource()==next39)
			{
				tab.setSelectedIndex(40);
				kembali();
			}
			else if(e.getSource()==next40)
			{
				tab.setSelectedIndex(41);
				kembali();
			}
			else if(e.getSource()==next41)
			{
				tab.setSelectedIndex(42);
				kembali();
			}
			else if(e.getSource()==next42)
			{
				tab.setSelectedIndex(43);
				kembali();
			}
			else if(e.getSource()==next43)
			{
				tab.setSelectedIndex(44);
				kembali();
			}
			else if(e.getSource()==next44)
			{
				tab.setSelectedIndex(45);
				kembali();
			}
			else if(e.getSource()==next45)
			{
				tab.setSelectedIndex(46);
				kembali();
			}
			else if(e.getSource()==next46)
			{
				tab.setSelectedIndex(47);
				kembali();
			}
			else if(e.getSource()==next47)
			{
				tab.setSelectedIndex(48);
				kembali();
			}
			else if(e.getSource()==next48)
			{
				tab.setSelectedIndex(49);
				kembali();
			}
			else if(e.getSource()==next49)
			{
				tab.setSelectedIndex(50);
				kembali();
			}
			else if(e.getSource()==next50)
			{
				int point1=0, 
					point2=0,
					point3=0,
					point4=0,
					point5=0,
					point6=0,
					point7=0,
					point8=0,
					point9=0,
					point10=0,
					point11=0,
					point12=0,
					point13=0,
					point14=0,
					point15=0,
					point16=0,
					point17=0,
					point18=0,
					point19=0,
					point20=0,
					point21=0,
					point22=0,
					point23=0,
					point24=0,
					point25=0,
					point26=0,
					point27=0,
					point28=0,
					point29=0,
					point30=0,
					point31=0,
					point32=0,
					point33=0,
					point34=0,
					point35=0,
					point36=0,
					point37=0,
					point38=0,
					point39=0,
					point40=0,
					point41=0,
					point42=0,
					point43=0,
					point44=0,
					point45=0,
					point46=0,
					point47=0,
					point48=0,
					point49=0,
					point50=0,
				
				benar1=0,
				benar2=0,
				benar3=0,
				benar4=0,
				benar5=0,
				benar6=0,
				benar7=0,
				benar8=0,
				benar9=0,
				benar10=0,
				benar11=0,
				benar12=0,
				benar13=0,
				benar14=0,
				benar15=0,
				benar16=0,
				benar17=0,
				benar18=0,
				benar19=0,
				benar20=0,
				benar21=0,
				benar22=0,
				benar23=0,
				benar24=0,
				benar25=0,
				benar26=0,
				benar27=0,
				benar28=0,
				benar29=0,
				benar30=0,
				benar31=0,
				benar32=0,
				benar33=0,
				benar34=0,
				benar35=0,
				benar36=0,
				benar37=0,
				benar38=0,
				benar39=0,
				benar40=0,
				benar41=0,
				benar42=0,
				benar43=0,
				benar44=0,
				benar45=0,
				benar46=0,
				benar47=0,
				benar48=0,
				benar49=0,
				benar50=0;
				
				if(rad1d.isSelected())
				{
					point1 = 2;
					benar1 = 1;
					
				}
				if(rad2e.isSelected())
				{
					point2 = 2;
					benar2 = 1;
					
				}
				if(rad3e.isSelected())
				{
					point3 = 2;
					benar3 = 1;
				}
				if(rad4c.isSelected())
				{
					point4 = 2;
					benar4 = 1;
				}
				if(rad5b.isSelected())
				{
					point5 = 2;
					benar5 = 1;
				}
				if(rad6e.isSelected())
				{
					point6 = 2;
					benar6 = 1;
				}
				if(rad7b.isSelected())
				{
					point7 = 2;
					benar7 = 1;
				}
				if(rad8b.isSelected())
				{
					point8 = 2;
					benar8 = 1;
				}
				if(rad9a.isSelected())
				{
					point9 = 2;
					benar9 = 1;
				}
				if(rad10c.isSelected())
				{
					point10 = 2;
					benar10 = 1;
				}
				if(rad11e.isSelected())
				{
					point11 = 2;
					benar11 = 1;
				}
				if(rad12a.isSelected())
				{
					point12 = 2;
					benar12 = 1;
				}
				if(rad13e.isSelected())
				{
					point13 = 2;
					benar13 = 1;
				}
				if(rad14e.isSelected())
				{
					point14 = 2;
					benar14 = 1;
				}
				if(rad15b.isSelected())
				{
					point15 = 2;
					benar15 = 1;
				}
				if(rad16e.isSelected())
				{
					point16 = 2;
					benar16 = 1;
				}
				if(rad17b.isSelected())
				{
					point17 = 2;
					benar17 = 1;
				}
				if(rad18e.isSelected())
				{
					point18 = 2;
					benar18 = 1;
				}
				if(rad19b.isSelected())
				{
					point19 = 2;
					benar19 = 1;
				}
				if(rad20b.isSelected())
				{
					point20 = 2;
					benar20 = 1;
				}
				if(rad21d.isSelected())
				{
					point21 = 2;
					benar21 = 1;
				}
				if(rad22d.isSelected())
				{
					point22 = 2;
					benar22 = 1;
				}
				if(rad23c.isSelected())
				{
					point23 = 2;
					benar23 = 1;
				}
				if(rad24a.isSelected())
				{
					point24 = 2;
					benar24 = 1;
				}
				if(rad25c.isSelected())
				{
					point25 = 2;
					benar25 = 1;
				}
				if(rad26a.isSelected())
				{
					point26 = 2;
					benar26 = 1;
				}
				if(rad27b.isSelected())
				{
					point27 = 2;
					benar27 = 1;
				}
				if(rad28c.isSelected())
				{
					point28 = 2;
					benar28 = 1;
				}
				if(rad29a.isSelected())
				{
					point29 = 2;
					benar29 = 1;
				}
				if(rad30e.isSelected())
				{
					point30 = 2;
					benar30 = 1;
				}
				if(rad31c.isSelected())
				{
					point31 = 2;
					benar31 = 1;
				}
				if(rad32d.isSelected())
				{
					point32 = 2;
					benar32 = 1;
				}
				if(rad33d.isSelected())
				{
					point33 = 2;
					benar33 = 1;
				}
				if(rad34d.isSelected())
				{
					point34 = 2;
					benar34 = 1;
				}
				if(rad35a.isSelected())
				{
					point35 = 2;
					benar35 = 1;
				}
				if(rad36e.isSelected())
				{
					point36 = 2;
					benar36 = 1;
				}
				if(rad37c.isSelected())
				{
					point37 = 2;
					benar37 = 1;
				}
				if(rad38b.isSelected())
				{
					point38 = 2;
					benar38 = 1;
				}
				if(rad39b.isSelected())
				{
					point39 = 2;
					benar39 = 1;
				}
				if(rad40b.isSelected())
				{
					point40 = 2;
					benar40 = 1;
				}
				if(rad41e.isSelected())
				{
					point41 = 2;
					benar41 = 1;
				}
				if(rad42a.isSelected())
				{
					point42 = 2;
					benar42 = 1;
				}
				if(rad43e.isSelected())
				{
					point43 = 2;
					benar43 = 1;
				}
				if(rad44d.isSelected())
				{
					point44 = 2;
					benar44 = 1;
				}
				if(rad45a.isSelected())
				{
					point45 = 2;
					benar45 = 1;
				}
				if(rad46b.isSelected())
				{
					point46 = 2;
					benar46 = 1;
				}
				if(rad47e.isSelected())
				{
					point47 = 2;
					benar47 = 1;
				}
				if(rad48b.isSelected())
				{
					point48 = 2;
					benar48 = 1;
				}
				if(rad49a.isSelected())
				{
					point49 = 2;
					benar49 = 1;
				}
				if(rad50b.isSelected())
				{
					point50 = 2;
					benar50 = 1;
				}
				
				int o = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10 +point11 + point12 + point13 + point14 + point15 +point16 + point17 + point18 + point19 + point20 +point21 + point22 + point23 + point24 + point25 +point26 + point27 + point28 + point29 + point30 + point31 + point32 + point33 + point34 + point35 +point36 + point37 + point38 + point39 + point40 + point41 + point42 + point43 + point44 + point45 +point46 + point47 + point48 + point49 + point50 ;
				hasil.setText(""+o);
				master.add(result);
				awal.setVisible(false);
				contoh.setVisible(false);
				int u = benar1 + benar2 + benar3 + 	benar4 + benar5 + benar6 + benar7 + benar8 + benar9 + benar10 + benar11 + benar12 +	benar13 + benar14 + benar15 + benar16 + benar17 + benar18 + benar19 + benar20 + benar21 + benar22 + benar23 + benar24 + benar25 + benar26 + benar27 + benar28 + benar29 + benar30 + benar31 + benar32 + benar33 + benar34 + benar35 + benar36 + benar37 + benar38 + benar39 + benar40 + benar41 + benar42 + benar43 + benar44 + benar45 + benar46 + benar47 + benar48 + benar49 + benar50; 
				benar.setText(""+u);
				int sal = 50 - u;
				salah.setText(""+sal);
				
				//grade
				if(o<10)
				{
					imotikon.setIcon(F);
					grade.setText("F");
				}
				else if(o>=12 && o<=20)
				{
					imotikon.setIcon(E);
					grade.setText("E");
				}
				else if(o>=22 && o<=30)
				{
					imotikon.setIcon(D);
					grade.setText("D");
				}
				else if(o>=32 && o<=40)
				{
					imotikon.setIcon(Dplus);
					grade.setText("D+");
				}
				else if(o>=42 && o<=50)
				{
					imotikon.setIcon(C);
					grade.setText("C");
				}
				else if(o>=52 && o<=60)
				{
					imotikon.setIcon(Cplus);
					grade.setText("C+");
				}
				else if(o>=62 && o<=70)
				{
					imotikon.setIcon(B);
					grade.setText("B");
				}
				
				else if(o>=72 && o<=80)
				{
					imotikon.setIcon(Bplus);
					grade.setText("B+");
				}
				else if(o>=82 && o<=90)
				{
					imotikon.setIcon(A);
					grade.setText("A");
				}
				else if (o>=92 && o<=100)
				{
					imotikon.setIcon(Aplus);
					grade.setText("A+");
				}
				
				tab.setSelectedIndex(0);
				result.setVisible(true);
				
				
			}
			else if(e.getSource()==back2)
			{
				tab.setSelectedIndex(1);
				kembali();
			}
			else if(e.getSource()==back3)
			{
				tab.setSelectedIndex(2);
				kembali();
			}
			else if(e.getSource()==back4)
			{
				tab.setSelectedIndex(3);
				kembali();
			}
			else if(e.getSource()==back5)
			{
				tab.setSelectedIndex(4);
				kembali();
			}
			else if(e.getSource()==back6)
			{
				tab.setSelectedIndex(5);
				kembali();
			}
			else if(e.getSource()==back7)
			{
				tab.setSelectedIndex(6);
				kembali();
			}
			else if(e.getSource()==back8)
			{
				tab.setSelectedIndex(7);
				kembali();
			}
			else if(e.getSource()==back9)
			{
				tab.setSelectedIndex(8);
				kembali();
			}
			else if(e.getSource()==back10)
			{
				tab.setSelectedIndex(9);
				kembali();
			}
			else if(e.getSource()==back11)
			{
				tab.setSelectedIndex(10);
				kembali();
			}
			else if(e.getSource()==back12)
			{
				tab.setSelectedIndex(11);
				kembali();
			}
			else if(e.getSource()==back13)
			{
				tab.setSelectedIndex(12);
				kembali();
			}
			else if(e.getSource()==back14)
			{
				tab.setSelectedIndex(13);
				kembali();
			}
			else if(e.getSource()==back15)
			{
				tab.setSelectedIndex(14);
				kembali();
			}
			else if(e.getSource()==back16)
			{
				tab.setSelectedIndex(15);
				kembali();
			}
			else if(e.getSource()==back17)
			{
				tab.setSelectedIndex(16);
				kembali();
			}
			else if(e.getSource()==back18)
			{
				tab.setSelectedIndex(17);
				kembali();
			}
			else if(e.getSource()==back19)
			{
				tab.setSelectedIndex(18);
				kembali();
			}
			else if(e.getSource()==back20)
			{
				tab.setSelectedIndex(19);
				kembali();
			}
			else if(e.getSource()==back21)
			{
				tab.setSelectedIndex(20);
				kembali();
			}
			else if(e.getSource()==back22)
			{
				tab.setSelectedIndex(21);
				kembali();
			}
			else if(e.getSource()==back23)
			{
				tab.setSelectedIndex(22);
				kembali();
			}
			else if(e.getSource()==back24)
			{
				tab.setSelectedIndex(23);
				kembali();
			}
			else if(e.getSource()==back25)
			{
				tab.setSelectedIndex(24);
				kembali();
			}
			else if(e.getSource()==back26)
			{
				tab.setSelectedIndex(25);
				kembali();
			}
			else if(e.getSource()==back27)
			{
				tab.setSelectedIndex(26);
				kembali();
			}
			else if(e.getSource()==back28)
			{
				tab.setSelectedIndex(27);
				kembali();
			}
			else if(e.getSource()==back29)
			{
				tab.setSelectedIndex(28);
				kembali();
			}
			else if(e.getSource()==back30)
			{
				tab.setSelectedIndex(29);
				kembali();
			}
			else if(e.getSource()==back31)
			{
				tab.setSelectedIndex(30);
				kembali();
			}
			else if(e.getSource()==back32)
			{
				tab.setSelectedIndex(31);
				kembali();
			}
			else if(e.getSource()==back33)
			{
				 tab.setSelectedIndex(32);
				 kembali();
			}
			else if(e.getSource()==back34)
			{
				tab.setSelectedIndex(33);
				kembali();
			}
			else if(e.getSource()==back35)
			{
				tab.setSelectedIndex(34);
				kembali();
			}
			else if(e.getSource()==back36)
			{
				tab.setSelectedIndex(35);
				kembali();
			}
			else if(e.getSource()==back37)
			{
				tab.setSelectedIndex(36);
				kembali();
			}
			else if(e.getSource()==back38)
			{
				tab.setSelectedIndex(37);
				kembali();
			}
			else if(e.getSource()==back39)
			{
				tab.setSelectedIndex(38);
				kembali();
			}
			else if(e.getSource()==back40)
			{
				tab.setSelectedIndex(39);
				kembali();
			}
			else if(e.getSource()==back41)
			{
				tab.setSelectedIndex(40);
				kembali();
			}
			else if(e.getSource()==back42)
			{
				tab.setSelectedIndex(41);
				kembali();
			}
			else if(e.getSource()==back43)
			{
				tab.setSelectedIndex(42);
				kembali();
			}
			else if(e.getSource()==back44)
			{
				tab.setSelectedIndex(43);
				kembali();
			}
			else if(e.getSource()==back45)
			{
				tab.setSelectedIndex(44);
				kembali();
			}
			else if(e.getSource()==back46)
			{
				tab.setSelectedIndex(45);
				kembali();
			}
			else if(e.getSource()==back47)
			{
				tab.setSelectedIndex(46);
				kembali();
			}
			else if(e.getSource()==back48)
			{
				tab.setSelectedIndex(47);
				kembali();
			}
			else if(e.getSource()==back49)
			{
				tab.setSelectedIndex(48);
				kembali();
			}
			else if(e.getSource()==back50)
			{
				tab.setSelectedIndex(49);
				kembali();
			}
			else if(e.getSource()==main_lagi)
			{
				result.setVisible(false);
				awal.setVisible(true);
				contoh.setVisible(false);
				next50.setEnabled(true);
				clearRB();
				kembaliWarnaRB();
				
				
				tab.setSelectedIndex(1);
			}
			else if(e.getSource()==mulai)
			{
				tab.setSelectedIndex(1);
				next50.setEnabled(true);
				//JOptionPane.showInputDialog(null, "Masukkan nama anda ", "Mulai",JOptionPane.INFORMATION_MESSAGE, JOptionPane.);
				enableTab();
				clearRB();
				kembaliWarnaRB();
			}
				
		}
	}
	
	public void kembali()
	{
		awal.setVisible(true);
		contoh.setVisible(false);
		contoh2.setVisible(false);
		contoh3.setVisible(false);
		contoh4.setVisible(false);
		contoh5.setVisible(false);
	}
	
	public void enableTab()
	{
		tab.setEnabledAt(1, true);
		tab.setEnabledAt(2, true);
		tab.setEnabledAt(3, true);
		tab.setEnabledAt(4, true);
		tab.setEnabledAt(5, true);
		tab.setEnabledAt(6, true);
		tab.setEnabledAt(7, true);
		tab.setEnabledAt(8, true);
		tab.setEnabledAt(9, true);
		tab.setEnabledAt(10, true);
		tab.setEnabledAt(11, true);
		tab.setEnabledAt(12, true);
		tab.setEnabledAt(13, true);
		tab.setEnabledAt(14, true);
		tab.setEnabledAt(15, true);
		tab.setEnabledAt(16, true);
		tab.setEnabledAt(17, true);
		tab.setEnabledAt(18, true);
		tab.setEnabledAt(19, true);
		tab.setEnabledAt(20, true);
		tab.setEnabledAt(21, true);
		tab.setEnabledAt(22, true);
		tab.setEnabledAt(23, true);
		tab.setEnabledAt(24, true);
		tab.setEnabledAt(25, true);
		tab.setEnabledAt(26, true);
		tab.setEnabledAt(27, true);
		tab.setEnabledAt(28, true);
		tab.setEnabledAt(29, true);
		tab.setEnabledAt(30, true);
		tab.setEnabledAt(31, true);
		tab.setEnabledAt(32, true);
		tab.setEnabledAt(33, true);
		tab.setEnabledAt(34, true);
		tab.setEnabledAt(35, true);
		tab.setEnabledAt(36, true);
		tab.setEnabledAt(37, true);
		tab.setEnabledAt(38, true);
		tab.setEnabledAt(39, true);
		tab.setEnabledAt(40, true);
		tab.setEnabledAt(41, true);
		tab.setEnabledAt(42, true);
		tab.setEnabledAt(43, true);
		tab.setEnabledAt(44, true);
		tab.setEnabledAt(45, true);
		tab.setEnabledAt(46, true);
		tab.setEnabledAt(47, true);
		tab.setEnabledAt(48, true);
		tab.setEnabledAt(49, true);
		tab.setEnabledAt(50, true);
	}
	
	public void clearRB()
	{
		bt.clearSelection();
		bt2.clearSelection();
		bt3.clearSelection();
		bt4.clearSelection();
		bt5.clearSelection();
		bt6.clearSelection();
		bt7.clearSelection();
		bt8.clearSelection();
		bt9.clearSelection();
		bt10.clearSelection();
		bt11.clearSelection();
		bt12.clearSelection();
		bt13.clearSelection();
		bt14.clearSelection();
		bt15.clearSelection();
		bt16.clearSelection();
		bt17.clearSelection();
		bt18.clearSelection();
		bt19.clearSelection();
		bt20.clearSelection();
		bt21.clearSelection();
		bt22.clearSelection();
		bt23.clearSelection();
		bt24.clearSelection();
		bt25.clearSelection();
		bt26.clearSelection();
		bt27.clearSelection();
		bt28.clearSelection();
		bt29.clearSelection();
		bt30.clearSelection();
		bt31.clearSelection();
		bt32.clearSelection();
		bt33.clearSelection();
		bt34.clearSelection();
		bt35.clearSelection();
		bt36.clearSelection();
		bt37.clearSelection();
		bt38.clearSelection();
		bt39.clearSelection();
		bt40.clearSelection();
		bt41.clearSelection();
		bt42.clearSelection();
		bt43.clearSelection();
		bt44.clearSelection();
		bt45.clearSelection();
		bt46.clearSelection();
		bt47.clearSelection();
		bt48.clearSelection();
		bt49.clearSelection();
		bt50.clearSelection();
	}
	
	public void kembaliWarnaRB()
	{
		rad1d.setForeground(null);
		rad2e.setForeground(null);
		rad3e.setForeground(null);
		rad4c.setForeground(null);
		rad5b.setForeground(null);
		rad6e.setForeground(null);
		rad7b.setForeground(null);
		rad8b.setForeground(null);
		rad9a.setForeground(null);
		rad10c.setForeground(null);
		rad11e.setForeground(null);
		rad12a.setForeground(null);
		rad13e.setForeground(null);
		rad14e.setForeground(null);
		rad15b.setForeground(null);
		rad16e.setForeground(null);
		rad17b.setForeground(null);
		rad18e.setForeground(null);
		rad19b.setForeground(null);
		rad20b.setForeground(null);
		rad21d.setForeground(null);
		rad22d.setForeground(null);
		rad23c.setForeground(null);
		rad24a.setForeground(null);
		rad25c.setForeground(null);
		rad26a.setForeground(null);
		rad27b.setForeground(null);
		rad28c.setForeground(null);
		rad29a.setForeground(null);
		rad30e.setForeground(null);
		rad31c.setForeground(null);
		rad32d.setForeground(null);
		rad33d.setForeground(null);
		rad34d.setForeground(null);
		rad35a.setForeground(null);
		rad36e.setForeground(null);
		rad37c.setForeground(null);
		rad38b.setForeground(null);
		rad39b.setForeground(null);
		rad40b.setForeground(null);
		rad41e.setForeground(null);
		rad42a.setForeground(null);
		rad43e.setForeground(null);
		rad44d.setForeground(null);
		rad45a.setForeground(null);
		rad46b.setForeground(null);
		rad47e.setForeground(null);
		rad48b.setForeground(null);
		rad49a.setForeground(null);
		rad50b.setForeground(null);
		rad50b.setForeground(null);
	}
	/**
	public void soalnya(JLabel pertanyaan, JRadioButton a, JRadioButton b, JRadioButton c, JRadioButton d, JRadioButton e )
	{
		per = pertanyaan;
		rba = a;
		rbb = b;
		rbc = c;
		rbd = d;
		rbe = e;
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(rba);
		gp.add(rbb);
		gp.add(rbc);
		gp.add(rbd);
		gp.add(rbe);
	}
	**/
	
}
