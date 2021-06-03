package com.DatabaseSegreteriaApplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Segreteria;


@Repository("segreteriaRepository")
public interface SegreteriaRepository extends CrudRepository <Segreteria, Long> {

}
