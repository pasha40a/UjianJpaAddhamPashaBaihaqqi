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

import com.ujianbatch8.jpa.relation.entity.Pertanyaan;
import com.ujianbatch8.jpa.relation.entity.Soal;
import com.ujianbatch8.jpa.relation.repo.DosenRepository;
import com.ujianbatch8.jpa.relation.repo.MahasiswaRepository;
import com.ujianbatch8.jpa.relation.repo.MataKuliahRepository;

import com.ujianbatch8.jpa.relation.repo.PertanyaanRepository;
import com.ujianbatch8.jpa.relation.repo.SoalRepository;

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
	
	//@Autowired
	//NilaiRepository nilaiRepository;
	
	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Override
	public void run(String...args)throws Exception{
		
		Dosen dosen = new Dosen();
		dosen.setNamadosen("Pasha");
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNamamahasiswa("Addham");
		
		
		MataKuliah matakuliah = new MataKuliah();
		matakuliah.setNama_matakuliah("Bahasa_Inggris");
		
		
		List<Dosen>lstdosen = new ArrayList<Dosen>();
		lstdosen.add(dosen);
		
		this.dosenRepository.save(dosen);
		
		
		List<Mahasiswa>lstmahasiswa = new ArrayList<Mahasiswa>();
		lstmahasiswa.add(mahasiswa);
		
		this.mahasiswaRepository.save(mahasiswa);
		
		List<MataKuliah>lstmatakuliah = new ArrayList<MataKuliah>();
		lstmatakuliah.add(matakuliah);
		
		this.mataKuliahRepository.save(matakuliah);
		
//		Soal soal = new Soal();
//		soal.setNamasoal("Bahasa");
//		soal.setStatus(1);
//		
//		Pertanyaan pertanyaan = new Pertanyaan();
//		pertanyaan.setPertanyaan("3-1");
//		pertanyaan.setJawaban1("6");
//		pertanyaan.setJawaban2("2");
//		pertanyaan.setJawaban3("5");
//		pertanyaan.setJawaban4("1");
//		
//		List<Pertanyaan> lstpertanyaan = new ArrayList<Pertanyaan>();
//		lstpertanyaan.add(pertanyaan);
//		soal.setPertanyaan(lstpertanyaan);
//		this.soalRepository.save(soal);
		
		
		

		
		
		
		
		
	}

}
