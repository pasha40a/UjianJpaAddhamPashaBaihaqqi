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
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="pertanyaan")
public class Pertanyaan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_pertanyaan;
	private String pertanyaan;
	private String jawaban1;
	private String jawaban2;
	private String jawaban3;
	private String jawaban4;
	private String jawabanbenar;
	private String gambar;
	private int status;
	


}