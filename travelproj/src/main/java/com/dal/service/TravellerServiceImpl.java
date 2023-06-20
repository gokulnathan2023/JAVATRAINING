package com.dal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dal.entity.Traveller;
import com.dal.repository.TravellerRepository;

@Service
public class TravellerServiceImpl implements TravellerService{

	@Autowired
	TravellerRepository travellerRepository;
	
	@Override
	public Traveller addTraveller(Traveller traveller) {
	
		return travellerRepository.save(traveller);
	}

	@Override
	public List<Traveller> listAllTravellers() {
		
		return (List<Traveller>) travellerRepository.findAll();
	}

}
