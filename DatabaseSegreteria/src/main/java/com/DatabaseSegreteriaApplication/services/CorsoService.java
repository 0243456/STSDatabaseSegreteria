package com.DatabaseSegreteriaApplication.services;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import javax.transaction.Transactional;

import com.DatabaseSegreteriaApplication.dto.CorsoRequest;
import lombok.*;
@Configuration
@AutoConfigureAfter
@Data
@Transactional

public class CorsoService {

	public void create(CorsoRequest corsoRequest) {
		
	}

}

