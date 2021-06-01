package com.DatabaseSegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Docente;

@Repository("docenteRepository")
public interface DocenteRepository extends CrudRepository <Docente, Long>{
}
