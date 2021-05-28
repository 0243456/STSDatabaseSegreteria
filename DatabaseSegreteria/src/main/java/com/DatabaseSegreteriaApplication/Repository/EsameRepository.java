package com.DatabaseSegreteriaApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.DatabaseSegreteriaApplication.DBmodel.Esame;

@Repository
@EnableJpaRepositories
public interface EsameRepository extends JpaRepository <Esame, String>{
//	List<Esami> findAll();

}
