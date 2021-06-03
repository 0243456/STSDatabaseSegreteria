package com.SegreteriaApplication.Repository;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SegreteriaApplication.DBmodel.Studente;



@Repository("studenteRepository")

public interface StudenteRepository extends CrudRepository <Studente, Long>{

}
