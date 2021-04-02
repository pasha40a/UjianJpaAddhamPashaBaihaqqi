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
@Table(name ="dosen")
public class Dosen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_dosen;
	
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	private String namadosen;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_dosen", referencedColumnName = "id_dosen")
	List<PlotMatKul>plotmatkul = new ArrayList<PlotMatKul>();

	

}
