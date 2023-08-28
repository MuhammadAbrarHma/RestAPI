package com.example.day.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.day.modal.SwagModal;
import com.example.day.service.SwagService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class SwagController {
	@Autowired
	public SwagService hserv;
	
	//post mapping
	@PostMapping("/postSwag")
	@Tag(name="Post Users",description = "To post the data from users")
	public String postSwag(@RequestBody SwagModal hr)
	{
		hserv.saveSwag(hr);
		return "Data saved";
	}
	
	//get mapping
	@GetMapping("/getSwag")
	@Tag(name="Post Users",description = "To get the data from users")
	public List<SwagModal> getSwagInfo()
	{
		return hserv.getSwag();
	}
	
	//put mapping
	@PutMapping("/updateSwag")
	@Tag(name="Put Users",description = "To put the data from users")
	public SwagModal updateSwagInfo(@RequestBody SwagModal ha)
	{
		return hserv.updateSwag(ha);
	}
	
	//delete mapping using path variable
	@DeleteMapping("/deleteSwag/{id}")
	@Tag(name="Delete Users",description = "To delete the data from users")
	public String removeSwag(@PathVariable("id") int hid)
	{
		hserv.deleteSwag(hid);
		return "Swag with Id"+hid+" is deleted";
	}
}