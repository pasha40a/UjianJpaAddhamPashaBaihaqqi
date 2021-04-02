package com.ujianbatch8.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name ="mata_kuliah")
public class MataKuliah {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_matakuliah;
	
	private String nama_matakuliah;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_matakuliah", referencedColumnName = "id_matakuliah")
	private List<PlotMatKul>plotmatkul = new ArrayList<PlotMatKul>();



}
