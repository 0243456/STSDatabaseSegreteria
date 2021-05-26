package com.DatabaseSegreteriaApplication.services;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;

import org.springframework.context.annotation.Configuration;
import javax.transaction.Transactional;
import lombok.*;

import com.DatabaseSegreteriaApplication.dto.DocenteRequest;
@Configuration
@AutoConfigureAfter
@Transactional
@Data

public class DocenteService {
	public void create(DocenteRequest docenteRequest) {
		
	}
	
}
