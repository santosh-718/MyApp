package com.infy.app.dao;

import java.util.List;

import com.infy.app.entities.Users;

public interface UsersDaoInterface {

	public void save(Users users);
	public void update(Users users);
	public void delete(Users users);
	public Users findByUserId(String userId);
	public List<Users> findAll();
}
