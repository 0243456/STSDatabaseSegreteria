package com.DatabaseSegreteria.DatabaseSegreteria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteria.DatabaseSegreteria.DBmodel.Corsi;

public interface CorsiRepository extends JpaRepository <Corsi, String>{
	List<Corsi> findAll();
}
