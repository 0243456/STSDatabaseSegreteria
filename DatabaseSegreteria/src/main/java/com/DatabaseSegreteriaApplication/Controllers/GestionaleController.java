package com.DatabaseSegreteriaApplication.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GestionaleController {
	@GetMapping("")
	public String viewLoginPageStudente() {
		return "login";
	}
}