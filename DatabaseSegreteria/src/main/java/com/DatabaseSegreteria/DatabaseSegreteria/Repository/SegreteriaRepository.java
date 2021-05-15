package com.DatabaseSegreteria.DatabaseSegreteria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteria.DatabaseSegreteria.DBmodel.Segreteria;

import java.util.List;


public interface SegreteriaRepository extends JpaRepository <Segreteria, Long> {
	List<Segreteria> findAll();

}
