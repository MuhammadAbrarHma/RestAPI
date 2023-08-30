package com.example.day6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day6.model.QueryModal;
import com.example.day6.repository.QueryRepo;

@Service
public class Queryserv {
	@Autowired
	QueryRepo qrepo;
	
	public QueryModal saveDet( QueryModal us) {
		return qrepo.save(us);
	}

}
