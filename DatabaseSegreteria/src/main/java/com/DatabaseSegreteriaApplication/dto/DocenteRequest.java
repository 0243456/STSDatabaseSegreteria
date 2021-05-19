package com.DatabaseSegreteriaApplication.dto;

import com.DatabaseSegreteriaApplication.DBmodel.Docenti;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DocenteRequest {
	private Docenti COD_DOCENTE;
}
