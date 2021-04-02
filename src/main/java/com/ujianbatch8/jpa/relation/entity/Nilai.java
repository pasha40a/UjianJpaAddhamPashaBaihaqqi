package com.ujianbatch8.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="nilai")
public class Nilai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_nilai;
	private int nilai;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_soal", referencedColumnName = "id_nilai")
	private List<Soal>soal = new ArrayList<Soal>();

}
