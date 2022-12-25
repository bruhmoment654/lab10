package org.example;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Project {

	public String name;
	public LocalDate start;
	public LocalDate end;

}