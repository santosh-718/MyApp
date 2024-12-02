package com.infy.app.dao;

import java.util.List;

import com.infy.app.entities.Hostel;
import com.infy.app.entities.Users;

public interface HostelDao {
	
	public void save(Hostel hostel);
	public void update(Hostel hostel);
	public void delete(Hostel hostel);
	public List<Hostel> findByUserId(String userId);
	public List<Hostel> findAll();
	public Hostel findByHostel(String hostelName);

}
