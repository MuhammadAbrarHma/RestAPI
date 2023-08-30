package com.example.day6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6.model.QueryModal;

import com.example.day6.service.Queryserv;

@RestController
@RequestMapping("/")
public class Querycontroller {
	@Autowired
Queryserv serv;
	
	@PostMapping("/save")
	public QueryModal saveDetails(@RequestBody QueryModal us) {
		return serv.saveDet(us);
	}

}
