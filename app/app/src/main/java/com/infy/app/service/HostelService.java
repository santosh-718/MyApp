package com.infy.app.service;

import java.util.List;

import com.infy.app.entities.Hostel;

public interface HostelService {
	
	public void save(Hostel hostel);
	public void update(Hostel hostel);
	public void delete(Hostel hostel);
	public List<Hostel> findByUserId(String userId);
	public List<Hostel> findAll();
	public Hostel findByHostel(String hostelName);

}
