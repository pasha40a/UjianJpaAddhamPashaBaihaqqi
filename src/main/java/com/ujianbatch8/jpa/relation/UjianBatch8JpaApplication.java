package com.ujianbatch8.jpa.relation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.ujianbatch8.jpa.relation.entity.Dosen;
import com.ujianbatch8.jpa.relation.entity.Mahasiswa;
import com.ujianbatch8.jpa.relation.entity.MataKuliah;
import com.ujianbatch8.jpa.relation.entity.Nilai;
import com.ujianbatch8.jpa.relation.entity.Soal;
import com.ujianbatch8.jpa.relation.entity.Pertanyaan;
import com.ujianbatch8.jpa.relation.entity.PlotMatKul;
import com.ujianbatch8.jpa.relation.entity.Soal;
import com.ujianbatch8.jpa.relation.repo.DosenRepository;
import com.ujianbatch8.jpa.relation.repo.MahasiswaRepository;
import com.ujianbatch8.jpa.relation.repo.MataKuliahRepository;

import com.ujianbatch8.jpa.relation.repo.PertanyaanRepository;
import com.ujianbatch8.jpa.relation.repo.SoalRepository;
import com.ujianbatch8.jpa.relation.repo.NilaiRepository;

@SpringBootApplication
public class UjianBatch8JpaApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(UjianBatch8JpaApplication.class, args);
	}
	
	@Autowired
	DosenRepository dosenRepository;
	
	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	MataKuliahRepository mataKuliahRepository;

	
	@Autowired
	SoalRepository soalRepository;
	
	
	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Autowired
	NilaiRepository nilaiRepository;
	
	@Override
	public void run(String...args)throws Exception{
	
//		Mahasiswa mahasiswa = new Mahasiswa();
//
//		mahasiswa.setNamamahasiswa("Addahm");
//		mahasiswa.setJenkel("Lp");
//		mahasiswa.setPassword("huhahuhahauahaua");
//		this.mahasiswaRepository.save(mahasiswa);
//		
//		MataKuliah matakuliah = new MataKuliah();
//		matakuliah.setNama_matakuliah("Code");
//		this.mataKuliahRepository.save(matakuliah);
//		
//		Dosen dosen = new Dosen();
//		dosen.setNamadosen("Suarni");
//		dosen.setPassword("auauauauaua");
//		dosen.setUsername("akupastibisa");
//		this.dosenRepository.save(dosen);
//		
//		
//		PlotMatKul plotmatkul = new PlotMatKul();
//		List<PlotMatKul> plotmatkul1 = new ArrayList<PlotMatKul>();
//		plotmatkul1.add(plotmatkul);
//		
//		dosen.setPlotmatkul(plotmatkul1);
//		this.dosenRepository.save(dosen);
//		
//		mahasiswa.setPlotmatkul(plotmatkul1);
//		this.mahasiswaRepository.save(mahasiswa);
//		
//		matakuliah.setPlotmatkul(plotmatkul1);
//		this.mataKuliahRepository.save(matakuliah);

		
		Soal soal = new Soal();
		soal.setNamasoal("Inggris");
		soal.setStatus(1);
		
		Pertanyaan pertanyaan = new Pertanyaan();
		pertanyaan.setPertanyaan("2-1");
		pertanyaan.setJawaban1("6");
		pertanyaan.setJawaban2("3");
		pertanyaan.setJawaban3("2");
		pertanyaan.setJawaban4("1");
		pertanyaan.setGambar("Bunga");
		pertanyaan.setJawabanbenar("4");
		pertanyaan.setStatus(1);
		
		List<Pertanyaan> lstpertanyaan = new ArrayList<Pertanyaan>();
		lstpertanyaan.add(pertanyaan);
		soal.setPertanyaan(lstpertanyaan);
		this.soalRepository.save(soal);

		
		
		
		
	
		
		
		

		
		
		
		
		
	}

}
