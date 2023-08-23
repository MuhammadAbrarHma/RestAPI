package com.example.day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day6.model.ApplianceBook;
import com.example.day6.repository.AppRepo;

@Service
public class AppService {
	@Autowired
	public AppRepo apprepo;
	
	//post data
	public String saveApp(ApplianceBook a)
	{
		apprepo.save(a);
		return "Data is saved to database";
	}
	
	//get data
	public List<ApplianceBook> getApp()
	{
		return apprepo.findAll();
	}
	
	//update the data
	public ApplianceBook updateApp(ApplianceBook hma)
	{
		return apprepo.saveAndFlush(hma);
	}
	
	//delete the data
	public void deleteApp(int id)
	{
		System.out.println("Deleted");
		apprepo.deleteById(id);
	}
	
	public boolean deleteappinfo(int appId)
	{
		if(apprepo.existsById(appId))
		{
			apprepo.deleteById(appId);
			return true;
		}
		return false;
	}
	
	public Optional<ApplianceBook> getUserId(int userId)
	   {
		   Optional<ApplianceBook>app=apprepo.findById(userId);
		   if(app.isPresent())
		   {
			   return app;
		   }
		   return null;
	   }
	}
