package com.DatabaseSegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Esame;

@Repository("esameRepository")
public interface EsameRepository extends CrudRepository <Esame, Long>{

}
