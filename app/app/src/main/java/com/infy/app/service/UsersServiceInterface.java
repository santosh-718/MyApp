package com.infy.app.service;

import java.util.List;

import com.infy.app.entities.Users;

public interface UsersServiceInterface {

	public void save(Users users);
	public void update(Users users);
	public void delete(Users users);
	public Users findByUserId(String userId);
	public List<Users> findAll();
}
