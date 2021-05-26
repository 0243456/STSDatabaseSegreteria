package com.DatabaseSegreteriaApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;
import com.DatabaseSegreteriaApplication.dto.CorsoRequest;

@Repository
public interface CorsoRepository extends JpaRepository <Corso, String>{
//	List<Corso> findAll();
	public void save(CorsoRequest corsoRequest);
}
