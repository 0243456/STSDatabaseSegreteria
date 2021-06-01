package com.DatabaseSegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;

@Repository("corsoRepository")
public interface CorsoRepository extends CrudRepository <Corso, Long>{

}
