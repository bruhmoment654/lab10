package org.example;

import lombok.Data;

import java.util.*;

@Data
public class Course {

	public String name;
	public int id;
	public float hours;


	Collection<Lecturer> teaches;

}