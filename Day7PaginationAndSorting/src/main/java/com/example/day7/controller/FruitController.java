package com.example.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.day7.model.Fruits;
import com.example.day7.service.FruitService;

@RestController
public class FruitController {

		@Autowired
		public FruitService fserv;
		
		//post mapping
		@PostMapping("/postFruit")
		public String postFruits (@RequestBody Fruits fc)
		{
			fserv.saveFruits(fc);
			return ("Data has been successfully saved");
		}
		
	//sort by asc
		
		@GetMapping("/sortAsc/{name}")
		public List<Fruits> sortasc(@PathVariable("name") String name)
		{
			return fserv.sortByAsc(name);
		}
		
	//sort by dec
		
		@GetMapping("/sortDsc/{name}")
		public List<Fruits> sortdsc(@PathVariable("name") String name)
		{
			return fserv.sortByDesc(name);
		}
		
		//pagination
		
		@GetMapping("/pagination/{num}/{size}")
		public List<Fruits>paginationEx(@PathVariable("num") int pnum,@PathVariable("size") int psize)
		{
			return fserv.pagination(pnum, psize);
		}
		
		
		//pagination and sorting
		
		@GetMapping("/paginations/{num}/{size}/{name}")
		public List<Fruits>paginationAndsorting(@PathVariable("num") int pnum,@PathVariable("size") int psize,@PathVariable("name") String name)
		{
			return fserv.paginationAndSorting(pnum, psize, name);
		}
}
