package com.example.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



import com.example.day7.model.TransModel;
import com.example.day7.repository.TransRepo;


@Service

public class TransService {
	@Autowired
	public TransRepo trepo;
	
	//post mapping
	
	public String saveFruits (TransModel f)
	{
		trepo.save(f);
		return "The Data given has been saved";
	}
	
	//sorting by asc
	
		public List<TransModel> sortByAsc(String name)
		{
			return trepo.findAll(org.springframework.data.domain.Sort.by(name).ascending());
		}
		
	//sorting
		
		public List<TransModel> sortByDesc(String name)
		{
			return trepo.findAll(org.springframework.data.domain.Sort.by(name).descending());
		}
		
	//pagination
		public List<TransModel> pagination(int pnum,int psize)
		{
			Page<TransModel> cont=trepo.findAll(PageRequest.of(pnum, psize));
			return cont.getContent();
		}
		
	//pagination and sorting
		public List<TransModel> paginationAndSorting(int pnum,int psize,String name)
		{
			Page<TransModel> cont1=trepo.findAll(PageRequest.of(pnum, psize, Sort.by(name)));
			return cont1.getContent();
		}
}
