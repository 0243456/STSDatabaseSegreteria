package com.DatabaseSegreteriaApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Esami;

public interface EsamiRepository extends JpaRepository <Esami, String>{
	List<Esami> findAll();

}
