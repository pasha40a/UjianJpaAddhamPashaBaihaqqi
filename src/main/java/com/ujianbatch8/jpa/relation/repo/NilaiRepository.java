package com.ujianbatch8.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ujianbatch8.jpa.relation.entity.Nilai;
import com.ujianbatch8.jpa.relation.entity.Soal;

public interface NilaiRepository extends JpaRepository<Nilai, Long> {

}
