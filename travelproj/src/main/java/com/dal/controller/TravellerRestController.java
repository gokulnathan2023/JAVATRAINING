package com.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dal.entity.Traveller;
import com.dal.service.TravellerService;

@RestController
public class TravellerRestController {

	@Autowired
	TravellerService travellerService;
	
	@GetMapping("/")
	public String hello() {
		return "Hi all";
	}
	
	
	public Traveller addTraveller(Traveller traveller) {
		
		
		return travellerService.addTraveller(traveller);
	}
	public List<Traveller> listAllTravellers(){
		return travellerService.listAllTravellers();
	}
	
	
}
