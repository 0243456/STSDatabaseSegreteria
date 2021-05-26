package com.DatabaseSegreteriaApplication.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.dto.CorsoRequest;



@Repository
public interface StudenteRepository extends JpaRepository <Studente, Long>{
//	List<Studente> findAll(StudenteRepository listaStudenti);
	public Optional<Studente>findById(String matricola);
	public void save();
}
