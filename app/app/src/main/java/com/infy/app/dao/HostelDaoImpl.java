package com.infy.app.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.infy.app.entities.Hostel;

@Component
public class HostelDaoImpl implements HostelDao {
	
	@Autowired
    HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional( readOnly = false)
	public void save(Hostel hostel) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(hostel);

	}

	@Override
	@Transactional( readOnly = false)
	public void update(Hostel hostel) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(hostel);

	}

	@Override
	@Transactional( readOnly = false)
	public void delete(Hostel hostel) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(hostel);

	}

	@Override
	public List<Hostel> findByUserId(String userId) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Hostel.class);
		criteria.add(Restrictions.eq("userId", userId));
		List<Hostel> hostel = (List<Hostel>)hibernateTemplate.findByCriteria(criteria);
		
		return hostel;
	}

	@Override
	public List<Hostel> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Hostel.class);
	}

	@Override
	public Hostel findByHostel(String hostelName) {
		// TODO Auto-generated method stub
		
		return hibernateTemplate.get(Hostel.class,hostelName);
	}

}
