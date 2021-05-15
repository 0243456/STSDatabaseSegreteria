package com.DatabaseSegreteria.DatabaseSegreteria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteria.DatabaseSegreteria.DBmodel.Banca;

import java.util.List;


public interface BancaRepository extends JpaRepository <Banca, String> {
	List<Banca> findAll();

}
