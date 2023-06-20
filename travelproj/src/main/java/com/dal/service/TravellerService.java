package com.dal.service;

import java.util.List;

import com.dal.entity.Traveller;

public interface TravellerService {
	public Traveller addTraveller(Traveller traveller);
	public List<Traveller> listAllTravellers();
}
