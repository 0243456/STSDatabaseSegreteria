package com.DatabaseSegreteriaApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;


//@EnableJpaRepositories("foo.somepackage.repositories")
@Repository
public interface StudenteRepository extends JpaRepository <Studente, Long>{
//	List<Studente> findAll(StudenteRepository listaStudenti);
	
}
