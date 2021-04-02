package com.ujianbatch8.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ujianbatch8.jpa.relation.entity.Dosen;

public interface DosenRepository extends CrudRepository<Dosen, Long>  {

}
