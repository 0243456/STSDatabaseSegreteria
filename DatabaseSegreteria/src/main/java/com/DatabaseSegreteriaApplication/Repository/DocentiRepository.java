package com.DatabaseSegreteriaApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Docenti;

public interface DocentiRepository extends JpaRepository <Docenti, String>{
	List<Docenti> findAll();
}
