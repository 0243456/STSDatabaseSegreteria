package com.DatabaseSegreteriaApplication.Repository;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.DatabaseSegreteriaApplication.DBmodel.Studente;



@Repository("studenteRepository")

public interface StudenteRepository extends CrudRepository <Studente, Long>{

}
