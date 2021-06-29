package com.psfroup.server.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.psfroup.server.main.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("/get")
public Employee getEmployee() {
	return new Employee(123456,456123,"satyam");
}
	@GetMapping("/getEmp")
	public List<Employee> getMoreEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(123456,456123,"satyam"));
		list.add(new Employee(147852,822962,"pinky"));
		return list;
	}
	@GetMapping("/filter")
	public MappingJacksonValue retrieveEmployee() {
		Employee e1 = new Employee(45612,789456,"amit");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("number","name");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(e1);
		mapping.setFilters(filters);
		return mapping;
	}
	
}
