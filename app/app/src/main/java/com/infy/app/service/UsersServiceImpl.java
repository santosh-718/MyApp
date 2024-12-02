package com.infy.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infy.app.dao.UsersDaoInterface;
import com.infy.app.entities.Users;

@Component
public class UsersServiceImpl implements UsersServiceInterface {
   
	@Autowired
	private UsersDaoInterface usersDaoInterface;
	
	public UsersDaoInterface getUsersInterface() {
		return usersDaoInterface;
	}

	public void setUsersInterface(UsersDaoInterface usersInterface) {
		this.usersDaoInterface = usersInterface;
	}

	@Override
	public void save(Users users) {
		// TODO Auto-generated method stub
		usersDaoInterface.save(users);
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		usersDaoInterface.update(users);

	}

	@Override
	public void delete(Users users) {
		// TODO Auto-generated method stub
		usersDaoInterface.delete(users);
	}

	@Override
	public Users findByUserId(String userId) {
		// TODO Auto-generated method stub
		return usersDaoInterface.findByUserId(userId);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usersDaoInterface.findAll();
	}

}
