package com.ujianbatch8.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="mahasiswa")
public class Mahasiswa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NIM")
	private long nim;
	
	@Column(name="Password")
	private String password;
	@Column (name="Jenis_Kelamin")
	private String jenkel;
	private String namamahasiswa;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="nim", referencedColumnName = "nim")
	List<PlotMatKul>plotmatkul = new ArrayList<PlotMatKul>();

	

}
