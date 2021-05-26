package com.DatabaseSegreteriaApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Docente;

@Repository
public interface DocenteRepository extends JpaRepository <Docente, String>{
	List<Docente> findAll();
}