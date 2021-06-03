package com.SegreteriaApplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SegreteriaApplication.DBmodel.Segreteria;


@Repository("segreteriaRepository")
public interface SegreteriaRepository extends CrudRepository <Segreteria, Long> {

}
