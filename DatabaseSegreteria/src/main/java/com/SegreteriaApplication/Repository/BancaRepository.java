package com.SegreteriaApplication.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SegreteriaApplication.DBmodel.Banca;


@Repository("bancaRepository")
public interface BancaRepository extends CrudRepository <Banca, Long> {
	
}
