package com.SegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SegreteriaApplication.DBmodel.Docente;

@Repository("docenteRepository")
public interface DocenteRepository extends CrudRepository <Docente, Long>{
}
