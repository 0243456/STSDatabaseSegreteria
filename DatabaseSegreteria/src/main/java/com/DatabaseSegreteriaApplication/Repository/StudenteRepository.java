package com.DatabaseSegreteriaApplication.Repository;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.dto.CorsoRequest;
import com.DatabaseSegreteriaApplication.DBmodel.Studente;



@Repository
@EnableJpaRepositories

public interface StudenteRepository extends JpaRepository <Studente, Long>{
//	List<Studente> findAll(StudenteRepository listaStudenti);
	public Optional<Studente>findById(String matricola);
//	public  void save(esame);
}
