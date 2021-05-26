package com.DatabaseSegreteriaApplication.services;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import com.DatabaseSegreteriaApplication.dto.BancaRequest;
import javax.transaction.Transactional;
import lombok.*;

@Configuration
@AutoConfigureAfter
@Transactional
@Data

public class BancaService {
	public void create (BancaRequest bancaRequest) {
		
	}
}
