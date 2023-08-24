package com.example.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value(value = "${age:18}")
	public int regNum;
	@Value(value = "${myName}")
	public String name;
	
	@GetMapping("/display")
	public String display()
	{
		return "My Name is "+name +" Reg number is " +regNum;
	}
}
