package com.SegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SegreteriaApplication.DBmodel.Esame;

@Repository("esameRepository")
public interface EsameRepository extends CrudRepository <Esame, Long>{

}
