package com.DatabaseSegreteriaApplication.services;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

import com.DatabaseSegreteriaApplication.dto.EsameRequest;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;

import lombok.Data;
@Configuration
@AutoConfigureAfter
@Transactional
@Data
public class EsamiService {
	public void create(EsameRequest esameRequest) {
		
	}
}
