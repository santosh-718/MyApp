package com.infy.app.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.infy.app.entities.Users;

@Component
public class UsersDaoInterfaceImpl implements UsersDaoInterface {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional( readOnly = false)
	public void save(Users users) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(users);

	}

	@Override
	@Transactional( readOnly = false)
	public void update(Users users) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(users);

	}

	@Override
	@Transactional( readOnly = false)
	public void delete(Users users) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(users);

	}

	@Override
	public Users findByUserId(String userId) {
		// TODO Auto-generated method stub
	DetachedCriteria criteria = DetachedCriteria.forClass(Users.class);
	
	criteria.add(Restrictions.eq("userId", userId));
	
	Users users = null;
	 try {
		users = (Users)hibernateTemplate.findByCriteria(criteria).get(0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return users;
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Users.class);
	}

}
