package com.SegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SegreteriaApplication.DBmodel.Corso;

@Repository("corsoRepository")
public interface CorsoRepository extends CrudRepository <Corso, Long>{

}
