package com.example.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5.model.HotelModel;
import com.example.day5.repository.HotelRepo;

@Service
public class HotelService {
	@Autowired
	public HotelRepo hrepo;
	
	//post data
	public String saveHotel(HotelModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	
	//get data
	public List<HotelModel> getHotel()
	{
		return hrepo.findAll();
	}
	
	//update the data
	public HotelModel updateHotel(HotelModel hm)
	{
		return hrepo.saveAndFlush(hm);
	}
	
	//delete the data
	public void deleteHotel(int id)
	{
		System.out.println("Deleted");
		hrepo.deleteById(id);
	}
	
	public boolean deletehotelinfo(int hotelId)
	{
		if(hrepo.existsById(hotelId))
		{
			hrepo.deleteById(hotelId);
			return true;
		}
		return false;
	}
	
	public Optional<HotelModel> getUserId(int userId)
	   {
		   Optional<HotelModel>hotel=hrepo.findById(userId);
		   if(hotel.isPresent())
		   {
			   return hotel;
		   }
		   return null;
	   }
	}
