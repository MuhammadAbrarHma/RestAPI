package com.example.day2.JSONIgnore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@JsonIgnoreProperties(value = {"studentId","studentName")
public class Json {
	
	public int studentId;
	public String studentName;
	@JsonIgnore
	public int age;
	public Json()
	{
		
	}
	
	@SpringBootApplication 
	
public class JsonIgnoreApplictaion{
		public static void main (String args[]) throws JsonprocessingExpression {
			SpringApplication.run(JsonIgnoreApplication.class, args)
			Json obj = new Json(1,"Abrar",20);
			
			ObjectMapper map = new ObjectMapper();
			String str = map.writeValueAsString(obj);
			System.out.println(str);
		}
	}
	public Json(int studentId, String studentName, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}
}
