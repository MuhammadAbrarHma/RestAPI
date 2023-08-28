package com.example.day.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day.modal.SwagModal;
import com.example.day.repository.SwagRepo;

@Service
public class SwagService {
	@Autowired
	public SwagRepo hrepo;
	
	//post data
	public String saveSwag(SwagModal h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	
	//get data
	public List<SwagModal> getSwag()
	{
		return hrepo.findAll();
	}
	
	//update the data
	public SwagModal updateSwag(SwagModal hm)
	{
		return hrepo.saveAndFlush(hm);
	}
	
	//delete the data
		public void deleteSwag(int id)
		{
			System.out.println("Deleted");
			hrepo.deleteById(id);
		}
}