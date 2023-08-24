package com.example.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.day7.model.Fruits;
import com.example.day7.repository.FruitRepo;

@Service

public class FruitService {
	@Autowired
	public FruitRepo frepo;
	
	//post mapping
	
	public String saveFruits (Fruits f)
	{
		frepo.save(f);
		return "The Data given has been saved";
	}
	
	//sorting by asc
	
		public List<Fruits> sortByAsc(String name)
		{
			return frepo.findAll(org.springframework.data.domain.Sort.by(name).ascending());
		}
		
	//sorting
		
		public List<Fruits> sortByDesc(String name)
		{
			return frepo.findAll(org.springframework.data.domain.Sort.by(name).descending());
		}
		
	//pagination
		public List<Fruits> pagination(int pnum,int psize)
		{
			Page<Fruits> cont=frepo.findAll(PageRequest.of(pnum, psize));
			return cont.getContent();
		}
		
	//pagination and sorting
		public List<Fruits> paginationAndSorting(int pnum,int psize,String name)
		{
			Page<Fruits> cont1=frepo.findAll(PageRequest.of(pnum, psize, Sort.by(name)));
			return cont1.getContent();
		}
}
