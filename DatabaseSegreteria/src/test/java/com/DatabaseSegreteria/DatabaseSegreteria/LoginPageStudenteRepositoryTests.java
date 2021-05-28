package com.DatabaseSegreteria.DatabaseSegreteria;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.tomcat.jni.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.DatabaseSegreteriaApplication.DBmodel.LoginPageStudente;
import com.DatabaseSegreteriaApplication.Repository.LoginPageStudenteRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LoginPageStudenteRepositoryTests {
	
	@Autowired
	private LoginPageStudenteRepository loginPageStudenteRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreaUtente() {
		LoginPageStudente studenti = new LoginPageStudente();
		studenti.setEmail("mario@gmail.com");
		studenti.setPassword("mario2020");
		studenti.setNome("Mario");
		studenti.setCognome("Rossi");
		
		LoginPageStudente utentiSalvati=loginPageStudenteRepository.save(studenti);
		LoginPageStudente  utentiEsistenti = entityManager.find(LoginPageStudente.class, utentiSalvati.getId());
		
		assertThat(utentiEsistenti.getEmail()).isEqualTo(studenti.getEmail());
	}
}
