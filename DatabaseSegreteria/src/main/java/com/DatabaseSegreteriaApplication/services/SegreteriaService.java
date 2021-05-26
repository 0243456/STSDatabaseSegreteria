package com.DatabaseSegreteriaApplication.services;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import lombok.*;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Configuration;

import com.DatabaseSegreteriaApplication.dto.SegreteriaRequest;
@Configuration
@AutoConfigureAfter
@Data
@Transactional

public class SegreteriaService {
	public void create(SegreteriaRequest segreteriaRequest) {
		
	}

}
