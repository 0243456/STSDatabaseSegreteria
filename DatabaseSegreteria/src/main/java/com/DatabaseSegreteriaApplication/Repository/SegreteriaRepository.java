package com.DatabaseSegreteriaApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Segreteria;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface SegreteriaRepository extends JpaRepository <Segreteria, Long> {
	List<Segreteria> findAll();

}
