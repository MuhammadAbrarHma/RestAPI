package com.example.day8.Contoller; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day8.model.UserModal;
import com.example.day8.repository.UserRepo; 
@RestController 
@RequestMapping("/user") 
public class UserController 
{
	@Autowired 
	UserRepo urepo;
	
	//one to many put mapping
	@PostMapping("/details")
	public UserModal get(@RequestBody UserModal s)
	{ 
		return urepo.save(s); 
	}
	
	//one to many get mapping
	@GetMapping("/getdetails")
	public List<UserModal>getDetails()
	{
		return urepo.findAll();
	}
	
	//one to many delete mapping
//	@DeleteMapping("/delete/{id}")
//	public String removeFood(@PathVariable("id") int hid)
//	{
//		urepo.deleteFood(hid);
//		return "Food with Id"+hid+" is deleted";
//	}
}