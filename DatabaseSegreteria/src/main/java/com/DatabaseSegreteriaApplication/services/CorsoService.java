package com.DatabaseSegreteriaApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.DatabaseSegreteriaApplication.dto.CorsoRequest;
import lombok.*;
@Configuration
@AutoConfigureAfter
@Data
@Transactional
@Service



public class CorsoService {

	public void create(CorsoRequest corsoRequest) {
		
	}

}

