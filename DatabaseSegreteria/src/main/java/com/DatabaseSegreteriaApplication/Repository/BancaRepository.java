package com.DatabaseSegreteriaApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Banca;

import java.util.List;

@Repository
public interface BancaRepository extends JpaRepository <Banca, String> {
	List<Banca> findAll();

}
