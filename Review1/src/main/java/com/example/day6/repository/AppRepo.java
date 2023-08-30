
package com.example.day6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.day6.model.ApplianceBook;



public interface AppRepo extends JpaRepository<ApplianceBook, Integer>
{
	
	// native query
	@Query(value="select * from appliance_book", nativeQuery=true)
	public List<ApplianceBook> getAllRows();
}


