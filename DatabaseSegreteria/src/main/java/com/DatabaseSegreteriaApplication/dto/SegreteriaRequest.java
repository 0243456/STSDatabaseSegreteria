package com.DatabaseSegreteriaApplication.dto;

import com.DatabaseSegreteriaApplication.DBmodel.Segreteria;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class SegreteriaRequest {
	private Segreteria codSegreteria;
}
