package com.infy.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infy.app.dao.HostelDao;
import com.infy.app.entities.Hostel;

@Component
public class HostelServiceImpl implements HostelService {
	
	@Autowired
	private HostelDao hostelDao;

	public HostelDao getHostelDao() {
		return hostelDao;
	}

	public void setHostelDao(HostelDao hostelDao) {
		this.hostelDao = hostelDao;
	}

	@Override
	public void save(Hostel hostel) {
		// TODO Auto-generated method stub
         hostelDao.save(hostel);
	}

	@Override
	public void update(Hostel hostel) {
		// TODO Auto-generated method stub
        hostelDao.update(hostel);
	}

	@Override
	public void delete(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelDao.delete(hostel);

	}

	@Override
	public List<Hostel> findByUserId(String userId) {
		// TODO Auto-generated method stub
		return hostelDao.findByUserId(userId);
	}

	@Override
	public List<Hostel> findAll() {
		// TODO Auto-generated method stub
		return hostelDao.findAll();
	}

	@Override
	public Hostel findByHostel(String hostelName) {
		Hostel hostel = (Hostel)hostelDao.findByHostel(hostelName);
		return hostel;
	}

}
