package com.example.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.day7.model.TransModel;
import com.example.day7.service.TransService;


@RestController
public class TransController {

		@Autowired
		public TransService tserv;
		
		//post mapping
		@PostMapping("/postFruit")
		public String postFruits (@RequestBody TransModel fc)
		{
			tserv.saveFruits(fc);
			return ("Data has been successfully saved");
		}
		
	//sort by asc
		
		@GetMapping("/sortAsc/{name}")
		public List<TransModel> sortasc(@PathVariable("name") String name)
		{
			return tserv.sortByAsc(name);
		}
		
	//sort by dec
		
		@GetMapping("/sortDsc/{name}")
		public List<TransModel> sortdsc(@PathVariable("name") String name)
		{
			return tserv.sortByDesc(name);
		}
		
		//pagination
		
		@GetMapping("/pagination/{num}/{size}")
		public List<TransModel>paginationEx(@PathVariable("num") int pnum,@PathVariable("size") int psize)
		{
			return tserv.pagination(pnum, psize);
		}
		
		
		//pagination and sorting
		
		@GetMapping("/paginations/{num}/{size}/{name}")
		public List<TransModel>paginationAndsorting(@PathVariable("num") int pnum,@PathVariable("size") int psize,@PathVariable("name") String name)
		{
			return tserv.paginationAndSorting(pnum, psize, name);
		}
}
